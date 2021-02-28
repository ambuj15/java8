package someBasicPracticeOfLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Person_Unit1Excercise2 {

	public static void main(String[] args) {
		List<Person_commonClass> people = Arrays.asList(
				new Person_commonClass("Shiv", "Jain", 25),
				new Person_commonClass("Krishna", "Yadav", 29), 
				new Person_commonClass("Hanuman", "Goyal", 58),
				new Person_commonClass("Vishnu", "Singhal", 34));

		// Step 1. Sort List by Last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2 : Create a method that prints all the elements in the list
		System.out.println("Printing all persons");
		performConditionally(people, p -> true, p -> System.out.println(p));
		System.out.println("------------------------------------------------------------");

		// Step 3 : Print only the first names of the people having first name
		// starting with S
		System.out.println("Prints all persons with first name beginning with S");
		performConditionally(people, p -> p.getFirstName().startsWith("S"), p -> System.out.println(p.getFirstName()));

		// Step 4 : Print only the details whose age is less than 30
		System.out.println("------------------------------------------------------------");
		performConditionally(people, p -> p.getAge() < 30, p -> System.out.println(p));

	}

	private static void performConditionally(List<Person_commonClass> people, Predicate<Person_commonClass> predicate,
			Consumer<Person_commonClass> consumer) {
		for (Person_commonClass p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}

