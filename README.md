# Java8
This repo contains Java 8 features from the very beginning and also several programs which can be referred that how we use to write them before java 8 and after java8.

# Anonymous InnerClass vs LambdaExpression.

Anonymous inner class basically is one of the way by which you can implemet interface directly in a class without creating a seperate concrete class just to give body to the abstarct methods there. 

**Example:**


Let's create one Functional interface Header which can be used to give heading to any web page

public interface Header {

	public void pageHeading(String value);
}

Now let's implement it using

**A) Anonymous Inner Class concept.**

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

**O/P :**

Hello Google 

Hello FaceBook 

Hello everyone at  google

Hello everyone at  faceBook

In the output you can see that for changing the implementation we again have to write particular block of code for a very minute change. This can be mitigated using Lambda Expression which is as follow:

**B) Lambda Expression concept.**

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

**O/P :**

Hi Google 

Hi Facebook 

Hi all at Google

Hi all at Facebook 

Hi everyone at Google 

Hi everyone at Facebook 

** You can see that the implementation changed just in single line without writing repetetive portion of code which was prominent in Anonymous Inner Class.**

