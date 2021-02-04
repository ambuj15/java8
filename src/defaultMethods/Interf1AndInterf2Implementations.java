package defaultMethods;

public class Interf1AndInterf2Implementations implements Interf1, Interf2 {

	/*
	 * We can implement default methods with same name in two different
	 * interfaces in two ways
	 */

	// First : By overriding them in implementation class (Most common way)
	
//	public void m1() {
//		System.out.println("I am overriding m1 method as duplicate m1 methods are there in interf1 and 2");
//	}
//
//	public void m2() {
//		System.out.println("I am overriding m2 method as duplicate m1 methods are there in interf1 and 2");
//	}

	/* Second : In this approach we want exact same implementation which was
	 available in interface and to that we have to use super keyword*/
	
	public void m1() {
		Interf1.super.m1();
		Interf2.super.m1();
	}

	public void m2() {
		Interf1.super.m2();
		Interf2.super.m2();
	}

	public static void main(String[] args) {
		Interf1AndInterf2Implementations i = new Interf1AndInterf2Implementations();
		i.m1();
		i.m2();

	}

}
