package anonymousInnerClass;

public class HeaderImplementationWithAnonyomusClass {

	// Here we are implementing header directly and not creating any separate
	// concrete class for it's implementation

	public static void main(String[] args) {

		Header h = new Header() {

			public void pageHeading(String value) {
				System.out.println("Hello " + value);
			}

		};

		Header h1 = new Header() {

			public void pageHeading(String value) {
				System.out.println("Hello everyone at  " + value);
			}

		};
		h.pageHeading("Google");
		h.pageHeading("FaceBook");
		h1.pageHeading("google");
		h1.pageHeading("faceBook");
	}
}