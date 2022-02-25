import scrapy

# 하나의 row 데이터를 담을 클래스
class GmarketItem(scrapy.Item):
    title = scrapy.Field()
    price = scrapy.Field()
    link = scrapy.Field()
