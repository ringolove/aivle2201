package chap03;

public class ContinueExample1 {

	public static void main(String[] args) {
		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt == 5)
			continue; //continue가 증감식으로 감
			System.out.println(cnt);
			}
		System.out.println("Done.");

	}

}
