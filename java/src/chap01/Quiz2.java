package chap01;

import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		
		int i = 0;
		int rad;
		Scanner radinput = new Scanner(System.in);
		
		while (i<3) {
			System.out.print("원의 반지름을 입력하세요");
			rad = radinput.nextInt();
			System.out.println("반지름이 "+rad+"인 원의 넓이는"+Math.pow(rad,2)*Math.PI+"입니다.");
			
			i += 1;
			
			
		
			
		}
		
		radinput.close();
	}

}
