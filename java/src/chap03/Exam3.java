package chap03;

import java.util.Random;
import java.util.Scanner;
public class Exam3 {

	public static void main(String[] args) {
		int namba, ans, i = 1;
		Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		ans = random.nextInt(100)+1;
		
		for (;;) {
			System.out.print("숫자 입력(1부터 100까지): ");
			namba = input.nextInt();
			
			if (namba>ans) {
				System.out.println(namba+"보다 작습니다!");
				i++;
			} else if (namba<ans) {
				System.out.println(namba+"보다 큽니다!");
				i++;
			} else {
				System.out.println("정답입니다!");
				input.close();
				break;
			}
		}
		System.out.println("시도한 횟수는 "+i+"회입니다.");
	}

}
