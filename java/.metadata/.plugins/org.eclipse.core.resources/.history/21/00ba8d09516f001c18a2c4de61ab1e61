package chap03;

import java.util.Scanner;
public class Exam2 {

	public static void main(String[] args) {
		int used;
		double m, kwm, total, tax;
		Scanner input = new Scanner(System.in);
		
		System.out.print("전기 사용량을 입력하세요(kw): ");
		used = input.nextInt();
		input.close();
		
		total = 0;
		if (used > 500) {
			m = 9330;
			kwm = 100*52.0+100*88.5+100*127.8+100*184.3+100*274.3+(used-500)*494.0;
			total += m+kwm;
			
		} else if (used > 400 & used <= 500){
			m = 5130;
			kwm = 100*52.0+100*88.5+100*127.8+100*184.3+(used-400)*274.3;
			total += m+kwm;
			
		} else if (used > 300 & used <= 400) {
			m = 2710;
			kwm = 100*52.0+100*88.5+100*127.8+(used-300)*184.3;
			total += m+kwm;
		} else if (used > 200 & used <= 300) {
			m = 1130;
			kwm = 100*52.0+100*88.5+(used-200)*127.8;
			total += m+kwm;
		} else if (used > 100 & used <= 200) {
			m = 660;
			kwm = 100*52.0+(used-100)*88.5;
			total += m+kwm;
		} else {
			m = 370;
			kwm = used*52.0;
			total += m+kwm;
		}
		
		tax = (total)*0.09;
		System.out.println("이번 달 요금은 "+(int)(total+tax)+"원 입니다.");
	}

}
