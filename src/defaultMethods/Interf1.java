package defaultMethods;

public interface Interf1 {
	default void m1()
	{
		System.out.println("I am M1 method of Interf1");
	}
	
	default void m2()
	{
		System.out.println("I am M2 method of Interf1");
	}
	
	public static void m3()
	{
		System.out.println("Static method m3 of Interf1");
	}

}
