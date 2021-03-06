package chap05;

public class StaticFieldExample1Revisited {

	public static void main(String[] args) {
		System.out.println(Accumulator.grandTotal);
		
		Accumulator obj1 = new Accumulator();
		obj1.accumulate(10);

		System.out.println("obj1.total = " + obj1.total);
		System.out.println("obj1.grandTotal = " + Accumulator.grandTotal);
		
		Accumulator obj2 = new Accumulator();
		obj2.accumulate(20);

		System.out.println("obj2.total = " + obj2.total);
		System.out.println("obj2.grandTotal = " + Accumulator.grandTotal);
	}

}
