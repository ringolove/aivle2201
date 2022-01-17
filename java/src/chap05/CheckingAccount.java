package chap05;

public class CheckingAccount extends Account2 {
	String cardNo;
	
	CheckingAccount(){
		System.out.println("CheckingAccount 클래스의 생성자 호출!");
	}
	
	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}
}
