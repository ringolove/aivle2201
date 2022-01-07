package chap05;

import chap04.GoodsStock;

public class ConstrExmaple1 {

	public static void main(String[] args) {
		NewGoodsStock obj;
		
		obj = new NewGoodsStock("52135", 200);
		
		System.out.println("상품코드: "+obj.goodsCode);
		System.out.println("재고수량: "+obj.stockNum);

		System.out.println("상품코드: "+obj.goodsCode);
		System.out.println("재고수량: "+obj.stockNum);

		obj.addStock(1000);

		System.out.println("상품코드: "+obj.goodsCode);
		System.out.println("재고수량: "+obj.stockNum);

	}

}