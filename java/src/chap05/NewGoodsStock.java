package chap05;

public class NewGoodsStock {
	String goodsCode;
	int stockNum;
	
	NewGoodsStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
		}
	
	void addStock(int amount) {
		this.stockNum += amount;
	}
	
	int subtractStock(int amount) {
		if (this.stockNum < amount)
			return 0;
		this.stockNum -= amount;
		return amount;
	}
}
