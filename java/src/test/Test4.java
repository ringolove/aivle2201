package test;

public class Test4 {

	public static void main(String[] args) {
		char ch1='A', ch2='a', ch3='0', ch4='가';
		byte a = 100;
		short b = 200;
		int c = 300;
		long d = 400L;
		
		float f1 = 0.123456789012345678901234567890f;
		double f2 = 0.123456789012345678901234567890;
		String str = "Apple";
		
		System.out.printf("%c:%d, %c:%d, %c:%d, %c:%d \n",
				ch1, (int)ch1, ch2, (int)ch2, ch3, (int)ch3, ch4, (int)ch4);
		
		System.out.printf("%d %o %x, %d %o %x, %d %o %x, %d %o %x \n",
				a, a, a, b, b, b, c, c, c, d, d, d);
		
		System.out.printf("%d, %5d, %05d, %-5d \n", c, c, c, c);
		
		System.out.println(f1+","+f2);
		System.out.printf("%.3f, %7.3f, %07.3f, %-7.3f \n", f1, f2, f1, f2);
		System.out.printf("%b %b \n", true, false);
		System.out.printf("%s %10s, %-10s", str, str, str);
	}

}
