package someBasicPracticeOfLambda.preDefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import someBasicPracticeOfLambda.Person_commonClass;

public class PredicateExample {

	public static void main(String[] args) {

		// Checking for even number
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(10));

		// Check length of string is greater than 5 or not
		Predicate<String> p1 = s -> s.length() > 5;
		System.out.println(p1.test("BholeNath"));

		// Printing only those strings whose length is more than 5
		List<PersonBase> pb = Arrays.asList(new PersonBase("Shiv", "Jain", 25), 
				new PersonBase("Krishna", "Yadav", 29),
				new PersonBase("Hanuman", "Goyal", 58),
				new PersonBase("Vishnu", "Singhal", 34));
		
		Predicate<PersonBase> p2 = name -> name.getFirstName().length() > 5;
		for (PersonBase printNames : pb) {
			if (p2.test(printNames))
				System.out.println(printNames);
		}

		// Above code in simple way

		String[] s = { "Ambuj", "Apoorva", "ShivShankar", "Kusum" };
		Predicate<String> p3 = name -> name.length() > 5;
		for (String s1 : s) {
			if (p3.test(s1)) {
				System.out.println(s1);
			}
		}
		
		// Predicate Joining example

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

}
