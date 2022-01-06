package chap04;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	void addStock(int amount) { //void: 출력값이 없음
		stockNum += amount;
	}
	int subtractStock(int amount) {
		if (stockNum < amount)
			return 0;
		stockNum -= amount;
		return amount;
	}
}
