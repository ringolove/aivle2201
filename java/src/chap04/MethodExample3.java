package chap04;

public class MethodExample3 {

	public static void main(String[] args) {
		MethodExample3 obj = new MethodExample3();
		
		obj.printCharacter('*', 30);
		System.out.println("Hello, Java");
		obj.printCharacter('-', 30);
		}
	
		void printCharacter(char ch, int num) {
			for (int cnt = 0; cnt < num; cnt++)
				System.out.print(ch);
			System.out.println();

	}

}
