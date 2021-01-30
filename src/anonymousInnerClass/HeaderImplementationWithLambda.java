package anonymousInnerClass;

public class HeaderImplementationWithLambda {

	public static void main(String[] args) {
		Header h = (value1) -> System.out.println("Hi " + value1);
		Header h1 = (value2) -> System.out.println("Hi all at " + value2);
		Header h2 = (n) -> System.out.println("Hi everyone at " + n);

		h.pageHeading("Google");
		h.pageHeading("Facebook");
		h1.pageHeading("Google");
		h1.pageHeading("Facebook");
		h2.pageHeading("Google");
		h2.pageHeading("Facebook");

	}

}
