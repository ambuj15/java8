package methodAndConstructorReference;

@FunctionalInterface
interface MyInterface {
	public void add(int a, int b);
}

public class Example1 {

	public int summation(int x, int y) {
		System.out.println("The sum using summation method is :" + (x + y));
		return x + y;
	}

	public static void main(String[] args) {

		// 1. Implementing add method of FI using Lambda:

		MyInterface mi = (m, n) -> System.out.println("The sum using lambda is :" + (m + n));
		mi.add(10, 20);

		// 2. Implementation of add method of FI using method reference
		Example1 e = new Example1();
		MyInterface mi1 = e::summation;
		mi1.add(200, 100);
	}

}
