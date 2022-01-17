package chap04;

import java.util.Scanner;
public class Exam1 {

	public static void main(String[] args) {
		int year, common, leap;
		Scanner input = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요: ");
		year = input.nextInt();
		input.close();
		
		if ((year%4 == 0) && (year%100!=0) || (year%400==0)) {
			leap = year;
			System.out.println(leap+"년은 윤년입니다.");
		} else {
			common = year;
			System.out.println(common+"년은 평년입니다.");
		}

	}

}
