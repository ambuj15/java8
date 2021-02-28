**Java -8 Pre-Defined functional interfaces**

>>Pre-Defined functional interfaces are introduced in order to make programming easy and these are some common interfaces with some methods which can be used in daily programs and hence we don't need to create multiple functional interfaces separately. 
  We can use any pre-defined FI depending on the usage and type of method we need.

>>You can find all these pre-defined functional interfaces in *java.util.function* package
*1. Single argument pre-defined functional interfaces*
a) Predicate
b) Function
c) Consumer
d) Supplier

*2. Double argument pre-defined functional interfaces*
a) BiPredicate
b) BiFunction
c) BiConsumer

*3. Primitive functional interfaces*

a) IntPredicate
b) IntFunction
c) IntConsumer

======================================================================================================================================================

**Predicate** : We use predicate whenever we need conditional checks. Hence it is clear that it will return boolean value. 

e.g : 
```import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		// Checking for even number
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(10));

		// Check length of string is greater than 5 or not
		Predicate<String> p1 = s -> s.length() > 5;
		System.out.println(p1.test("BholeNath"));
		
		// Print the names whose length is more than 5 characters
		
		String[] s = { "Ambuj", "Apoorva", "ShivShankar", "Kusum" };
		Predicate<String> p3 = name -> name.length() > 5;
		for (String s1 : s) {
			if (p3.test(s1)) {
				System.out.println(s1);
			}
		}

	}

}

o/p: 
true
true
Apoorva
ShivShankar
```
*Predicate Joining :* This is a facility provided by java by which we can combine predicates to form one single predicate in order to simplify the complex conditional checks

-- p1--> predicate to check whether number is even or not
-- p2--> predicate to check whether number is greater than 10 or not

a) p1.and(p2).test(34) -- This will check whether 34 is even and is greater than 10 or not.
b) p1.or(p2).test(34) -- This will check if 34 is even or greater than 10 or not.
c) p1.negate() -- This will be used find opposite of p1.

Eg:

```
public class PredicateExample {

	public static void main(String[] args) {
	int[] a = { 10, 20, 5, 25, 30, 42, 64, 55 };
		System.out.println("--------------Numbers are even and greater than 10--------------------");
		Predicate<Integer> p4 = pJ1 -> pJ1 % 2 == 0;
		Predicate<Integer> p5 = pJ2 -> pJ2 > 10;
		for (int a1 : a) {
			if (p4.and(p5).test(a1)) {
				System.out.println(a1);
			}
		}
		System.out.println("--------------Numbers are even or greater than 10--------------------");
		for (int a1 : a) {
			if (p4.or(p5).test(a1)) {
				System.out.println(a1);
			}
		}
		System.out.println("--------------Numbers are not even--------------------");
		for (int a1 : a) {
			if (p4.negate().test(a1)) {
				System.out.println(a1);
			}
		}

	}
	
Output:

--------------Numbers are even and greater than 10--------------------
20
30
42
64
--------------Numbers are even or greater than 10--------------------
10
20
25
30
42
64
55
--------------Numbers are not even--------------------
5
25
55
```
