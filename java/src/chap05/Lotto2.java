package chap05;

import java.util.Random;
public class Lotto2 {
	public static void main(String[] args) {
	Random random = new Random();
	random.setSeed(System.currentTimeMillis());
	int lotto[] = new int[6];
	
	for (int i=0;i<lotto.length;i++) {
		lotto[i]=random.nextInt(45)+1;
		
		for(int j=0;j<i;j++) {
			if(lotto[i]==lotto[j]) {
				i--;
			}
		}
	}
	
	for (int i=0;i<lotto.length;i++) {
		for(int j=0;j<lotto.length;j++) {
			if(lotto[i]<lotto[j]) {
				int ch = lotto[i];
				lotto[i] = lotto[j];
				lotto[j] = ch;
			}
		}
	}
	
	System.out.print("로또 번호: ");
	for (int i=0;i<lotto.length;i++) {
		System.out.print(lotto[i]+" ");
		}
	}
	
	
}
