package chap04;

import java.util.Scanner;
public class Exam3 {

	public static void main(String[] args) {
		int year, month, day;
		int lday[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner input = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요: ");
		year = input.nextInt();
		System.out.print("월을 입력하세요: ");
		month = input.nextInt();
		System.out.print("일을 입력하세요: ");
		day = input.nextInt();
		input.close();
		
		int total = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		
		if ((year%4 == 0) && (year%100!=0) || (year%400==0)) {
			lday[1]=29;
		} else {
			lday[1]=28;
		}
		
		for(int i=0;i<month-1;i++) {
			total += lday[i];
		}
		
		total += day;
		
		int week = total%7;
		String[] weekday = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(year+"년 "+month+"월 "+day+"일은 "+weekday[week]+"요일입니다.");

	}

}
