package chap05;

public class LottoMain {

	public static void main(String[] args) {
		Lottery mylotto = new Lottery();
		int[] lott = mylotto.getlotto();
		
		System.out.print("로또 번호: ");
		for (int i=0;i<lott.length;i++) {
			System.out.print(lott[i]+" ");

		}
	}
}
