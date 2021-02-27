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

=======================================================================================================

*Java 8 Interface Changes – default method and static method*

*a) **Why Default Method?**

For example, if several classes such as A, B, C and D implements an interface XYZInterface then if we add a new method to the XYZInterface, we have to change the code in all the classes(A, B, C and D) that implements this interface. In this example we have only four classes that implements the interface which we want to change but imagine if there are hundreds of classes implementing an interface then it would be almost impossible to change the code in all those classes. This is why in java 8, we have a new concept “default methods”. These methods can be added to any existing interface and we do not need to implement these methods in the implementation classes mandatorily, thus we can add these default methods to existing interfaces without breaking the code.

We can say that concept of default method is introduced in java 8 to add the new methods in the existing interfaces in such a way so that they are backward compatible. Backward compatibility is adding new features without breaking the old code.

**Static methods** in interfaces are similar to the default methods except that we cannot override these methods in the classes that implements these interfaces.

**Java 8 Example: Default method in Interface**
The method newMethod() in MyInterface is a default method, which means we need not to implement this method in the implementation class Example. This way we can add the default methods to existing interfaces without bothering about the classes that implements these interfaces.

interface MyInterface{  
    /* This is a default method so we need not
     * to implement this method in the implementation 
     * classes  
     */
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    /* Already existing public and abstract method
     * We must need to implement this method in 
     * implementation classes.
     */
    void existingMethod(String str);  
}  
public class Example implements MyInterface{ 
	// implementing abstract method
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
    	Example obj = new Example();
    	
    	//calling the default method of interface
        obj.newMethod();     
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn"); 
  
    }  
}

**Output:**

Newly added default method
String is: Java 8 is easy to learn

**Java 8 Example: Static method in Interface**

As mentioned above, the static methods in interface are similar to default method so we need not to implement them in the implementation classes. We can safely add them to the existing interfaces without changing the code in the implementation classes. Since these methods are static, we cannot override them in the implementation classes.

interface MyInterface{  
    /* This is a default method so we need not
     * to implement this method in the implementation 
     * classes  
     */
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    
    /* This is a static method. Static method in interface is
     * similar to default method except that we cannot override 
     * them in the implementation classes.
     * Similar to default methods, we need to implement these methods
     * in implementation classes so we can safely add them to the 
     * existing interfaces.
     */
    static void anotherNewMethod(){
    	System.out.println("Newly added static method");
    }
    /* Already existing public and abstract method
     * We must need to implement this method in 
     * implementation classes.
     */
    void existingMethod(String str);  
}  
public class Example implements MyInterface{ 
	// implementing abstract method
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
    	Example obj = new Example();
    	
    	//calling the default method of interface
        obj.newMethod();     
        //calling the static method of interface
        MyInterface.anotherNewMethod();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn"); 
        
  
    }  
}

**Output:**

Newly added default method
Newly added static method
String is: Java 8 is easy to learn


