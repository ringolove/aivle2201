package test;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		int eng, math;
		String result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어 점수를 입력하세요: ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		math = sc.nextInt();
		
		sc.close();
		
		result = eng >= 80 && math >= 80 ? "합격입니다" : "불합격입니다";
			
		System.out.println(result);
		
		
	}

}
