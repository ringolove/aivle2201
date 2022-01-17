/*
	[1] 사용자에게 영어와 수학 두 과목의 점수를 입력받아 두 과목 모두 80점 이상이면 "합격입니다, 아니면 "불합격입니다"를
		출력하는 코드를 작성하세요.
		
	[2] 사용자에게 영어와 수학 두 과목의 점수를 입력받아 한 과목이라도 80점 미만이면 "80점 미만의 값이 있습니다"를
		아니면 "모두 80점 이상입니다"를 출력하는 코드를 작성하세요.
		
	[3] 사용자에게 영어와 수학 두 과목의 점수를 입력받아 두 과목 모두 80점 이상이면 "합격입니다, 아니면 "불합격입니다"를
		출력하는 코드를 작성하세요. 단, AND 연산자는 사용할 수 없습니다.
 */
package test;

import java.util.Scanner;
public class TestRevisited {

	public static void main(String[] args) {
		
		int eng, math;
		String score, result, aeresult, result1;
		String [] scores; //scores []도 가능
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어와 수학 점수를 입력하세요(ex 90 85): ");
		score = sc.nextLine();
		sc.close();
		
		scores = score.split(" ");
		eng = Integer.parseInt(scores[0]);
		math = Integer.parseInt(scores[1]);
		
		result = eng >= 80 && math >= 80 ? "합격입니다" : "불합격입니다";
		aeresult = eng < 80 || math < 80 ? "80점 미만의 값이 있습니다" : "모두 80점 이상입니다";
		result1 = !(eng < 80 && math < 80) ? "합격입니다" : "불합격입니다";
		
		System.out.println(result);
		System.out.println(aeresult);
		System.out.println(result1);
		
		
	}

}
