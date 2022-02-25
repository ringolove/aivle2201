import scrapy
from gmarket.items import GmarketItem

class GMSpider(scrapy.Spider):
    name = "GMB" # spider 이름
    allow_domain = ["gmarket.co.kr"] # 허용 도메인
    start_urls = ["http://corners.gmarket.co.kr/Bestsellers"] # 최초 request URL
    
    def parse(self, response): # 최초 request에 대한 reponse 메서드
        links = response.xpath('//*[@id="gBestWrap"]/div/div[3]/div[2]/ul/li/div[1]/a/@href').extract() # link 수집 selector
        for link in links:
            yield scrapy.Request(link, callback=self.parse_content) # link로 request 후 response를 받아 callback함수 호출
    
    def parse_content(self, response): # callback 으로 실행 되는 함수
        item = GmarketItem() # 하나의 row 데이터를 담을 객체
        item["title"] = response.xpath('//*[@id="itemcase_basic"]/div[1]/h1/text()')[0].extract() # title 수집 selector
        item["price"] = response.xpath('//*[@id="itemcase_basic"]/div[1]/p/span/strong/text()')[0].extract() # price 수집 selector
        item["link"] = response.url # request에서 사용한 url
        yield item
