package chap04;

import java.util.Scanner;
public class Exam2Ans {

	public static void main(String[] args) {
		int year, month;
		int [] lday = new int[] {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner input = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요: ");
		year = input.nextInt();
		System.out.print("월을 입력하세요: ");
		month = input.nextInt();
		input.close();
		
		if ((year%4 == 0) && (year%100!=0) || (year%400==0)) {
			lday[2] = 29;
		}
		
		System.out.println(year+"년 "+month+"월의 마지막 일자: "+lday[month]+"일");
	}

}
