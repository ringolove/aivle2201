package chap05;

import java.util.Random;
public class Lottery {
	
	int [] lotto;
	
	public Lottery() {
		this.lotto = new int[6];
		this.lottonum();
		this.selectionSort();
	}
	
	void lottonum() {
	Random random = new Random();
	random.setSeed(System.currentTimeMillis());
	
	for (int i=0;i<this.lotto.length;i++) {
		this.lotto[i]=random.nextInt(45)+1;
		for(int j=0;j<i;j++) {
			if(this.lotto[i]==this.lotto[j]) {
				i--;
				}
			}	
		}
	}
	
	void selectionSort() {
		int ch;
		
		for (int i=0;i<this.lotto.length;i++) {
			for(int j=0;j<this.lotto.length;j++) {
				if(this.lotto[i]<this.lotto[j]) {
					ch = this.lotto[i];
					this.lotto[i] = this.lotto[j];
					this.lotto[j] = ch;
				}
			}
		}
	}
	
	int[] getlotto() {
		return this.lotto;
	}
}
