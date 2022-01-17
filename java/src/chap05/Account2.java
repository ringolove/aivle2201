package chap05;

public class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
	Account2(){
		System.out.println("Account2 클래스의 생성자 호출!");
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;
	}

}
