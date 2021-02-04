package defaultMethods;

public interface Interf2 {
	default void m1()
	{
		System.out.println("I am M1 method of Interf2");
	}
	
	default void m2()
	{
		System.out.println("I am M2 method of Interf2");
	}
	
	public static void m3()
	{
		System.out.println("Static method m3 of Interf2");
	}
}
