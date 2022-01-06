package chap04;

import java.util.Scanner;
public class Exam2 {

	public static void main(String[] args) {
		int year, common, leap, month;
		int mon[][] = {{1, 3, 5, 7, 8, 10, 12},{4, 6, 9, 11}};
		Scanner input = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요: ");
		year = input.nextInt();
		System.out.print("월을 입력하세요: ");
		month = input.nextInt();
		input.close();
		
		for (int i=0;i<mon.length;i++) {
			if (month==mon[i][0]) {
				System.out.println(year+"년 "+month+"월의 마지막 일자: 31일");
			} else if (month==mon[i][1]) {
				System.out.println(year+"년 "+month+"월의 마지막 일자: 30일");
			}
		}	
		
		if (month==2) {
			if ((year%4 == 0) && (year%100!=0) || (year%400==0)) {
				leap = year;
				System.out.println(leap+"년 2월의 마지막 일자: 29일");
			} else {
				common = year;
				System.out.println(common+"년 2월의 마지막 일자: 28일");
			}
		}

	}

}
