package someBasicPracticeOfLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Person_Unit1Excercise1 {

	public static void main(String[] args) {
		List<Person_commonClass> people = Arrays.asList(
				new Person_commonClass("Apoorva", "Jain", 25),
				new Person_commonClass("Ambuj", "Goyal", 29), 
				new Person_commonClass("Kusum", "Goyal", 58),
				new Person_commonClass("Sanchi", "Singhal", 34));

		// Step 1. Sort List by Last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2 : Create a method that prints all the elements in the list
		System.out.println("Printing all persons");
		printConditionally(people, p -> true);

		// Step 3 : Create a method that prints all the people having first name
		// begining with A
		System.out.println("Prints all persons with first name beginning with A");
		printConditionally(people, p -> p.getFirstName().startsWith("A"));

	}

	private static void printConditionally(List<Person_commonClass> people, Predicate<Person_commonClass> predicate) {
		for (Person_commonClass p : people) {
			if (predicate.test(p)) {
				System.out.println(p);
			}
		}
	}

}
