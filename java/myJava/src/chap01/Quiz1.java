package chap01;

import java.util.Scanner;
public class Quiz1 {

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		n1 = input.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		n2 = input.nextInt();
		input.close();
		
		System.out.println("\n"+n1+" + "+n2+" = "+(n1+n2));
		System.out.println(n1+" - "+n2+" = "+(n1-n2));
		System.out.println(n1+" * "+n2+" = "+(n1*n2));
		System.out.println(n1+" / "+n2+" = "+(n1/n2));

	}

}
