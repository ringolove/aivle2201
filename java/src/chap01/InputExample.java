package chap01;

import java.util.Scanner;
public class InputExample {

	public static void main(String[] args) {
		
		String name;
		int age;
		double height;
		String intro;
		String buffer;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		System.out.print("키를 입력하세요: ");
		height = sc.nextDouble();
		System.out.print("자기소개를 입력하세요");
		buffer = sc.nextLine();
		intro = sc.nextLine();
		
		sc.close();
		
		System.out.println("이름은 "+name+", 나이는 "+age+", 키는 "+height+"입니다.");
		System.out.println(intro);

	}

}
