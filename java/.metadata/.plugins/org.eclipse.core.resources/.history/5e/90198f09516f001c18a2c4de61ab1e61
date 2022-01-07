package chap03;

import java.util.Scanner;
public class Exam1 {

	public static void main(String[] args) {
		String home;
		double score;
		int m=100;
		Scanner input = new Scanner(System.in);
		
		System.out.print("소득 분위를 입력하세요(a, b, c): ");
		home = input.next();
		System.out.print("평균 학점을 입력하세요: ");
		score = input.nextDouble();
		input.close();
		
		if (home.equals("c")) {
			if (score >=4.0) {
				System.out.println("다음 학기 납입할 등록금은 "+(int)(m-(m*0.6))+"만원 입니다.");
			} else {
				System.out.println("다음 학기 납입할 등록금은 "+(int)(m-(m*0.4))+"만원 입니다.");
			}
		} else if (score >= 4.0){
			System.out.println("다음 학기 납입할 등록금은 "+(int)(m-(m*0.2))+"만원 입니다.");
		}

//		String str="우리나라";
//		System.out.println(str.equals("우리나라"));
		
	}

}
