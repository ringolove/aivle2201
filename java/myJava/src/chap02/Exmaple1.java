package chap02;

public class Exmaple1 {

	public static void main(String[] args) {
		int a=0, b=0;
		boolean c;
		
		c = ++a == 0 ^ b++ == 1;
		
		System.out.println(c+" : "+a+" : "+b);

	}

}

/*
	A 		B 		A ^ B
	f 		f 		f
	f 		t	 	t
	t 		f 		t
	t 		t 		f
 
 */