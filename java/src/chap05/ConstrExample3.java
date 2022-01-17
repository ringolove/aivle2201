package chap05;

public class ConstrExample3 {

	public static void main(String[] args) {
		SubscriberInfo obj;
		obj = new SubscriberInfo(); // 파라미터 없이 객체를 생성합니다.
		printSubscriberInfo(obj);

	}
	
	static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println("이름:" + obj.name);
		System.out.println("아이디:" + obj.id);
		System.out.println("패스워드:" + obj.password);
		System.out.println("전화번호:" + obj.phoneNo);
		System.out.println("주소:" + obj.address);
		System.out.println();
		}
}
