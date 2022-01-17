package chap04;

import java.util.Scanner;
public class Exam3Ans {

	public static void main(String[] args) {
		int year, month, day, total_days=0;
		int lday[] = {-1, 31,28,31,30,31,30,31,31,30,31,30,31};
		String[] weekday = {"일", "월", "화", "수", "목", "금", "토"};
		Scanner input = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요: ");
		year = input.nextInt();
		System.out.print("월을 입력하세요: ");
		month = input.nextInt();
		System.out.print("일을 입력하세요: ");
		day = input.nextInt();
		input.close();
		
		for(int i=1;i<year;i++) {
			if (year%4 == 0 && year%100!=0 || year%400==0){
				total_days += 366;
			} else {
				total_days += 365;
			}
		}
		
		if ((year%4 == 0) && (year%100!=0) || (year%400==0)) {
			lday[2]=29;
		}
		
		for(int i=1;i<month-1;i++) {
			total_days += lday[i];
		}
		
		total_days += day;
		
		System.out.println(year+"년 "+month+"월 "+day+"일은 "+weekday[total_days%7]+"요일입니다.");

	}

}
