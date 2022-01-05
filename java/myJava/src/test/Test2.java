/*
	사용자에게 하나의 실수를 입력받아 버림, 반올림, 올림의 결과를 출력하는 코드 작성
	
	실행 예 1)
	하나의 실수를 입력하세요: 3.6
	
	버림: 3
	반올림: 4
	올림: 4
 */
package test;

import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		double test;                    
		int test1, down, round, up;
		Scanner input = new Scanner(System.in);

		System.out.print("하나의 실수를 입력하세요: ");
		test = input.nextDouble();
		input.close();
		
		test1 = (int)(test);
		
		down = test1;
		System.out.println("버림: "+down);
		
		if (test-test1 < 0.5){
			round = test1;
		} else {
			round = test1+1;
		}
		
		System.out.println("반올림: "+round);
		
		if (test-test1 == 0){
			up = test1;}
		else {
			up = test1 + 1;
		}
		
		System.out.println("올림: "+up);
		
		
		
	}

}
