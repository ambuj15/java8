package defaultMethods;

public class Interf1_Implementation implements Interf1 {

	public static void main(String[] args) {
		Interf1_Implementation i1 = new Interf1_Implementation();
		i1.m1();
		i1.m2();
		
//Calling Static method
		
		Interf1.m3();
		Interf2.m3();

	}

}
