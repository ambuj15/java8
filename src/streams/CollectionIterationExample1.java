package streams;

import java.util.Arrays;
import java.util.List;

import someBasicPracticeOfLambda.preDefinedFunctionalInterfaces.PersonBase;

public class CollectionIterationExample1 {

	public static void main(String[] args) {
		List<PersonBase> people = Arrays.asList(new PersonBase("Ram", "Singh", 14),
				new PersonBase("Krishna", "Yadav", 29), new PersonBase("Hanuman", "Singh", 58),
				new PersonBase("Vishnu", "Goyal", 34), new PersonBase("Saraswati", "Gupta", 10));

		System.out.println("Iteration using normal for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		System.out.println("============================================");

		System.out.println("Iteration using advance for loop");
		for (PersonBase p1 : people) {
			System.out.println(p1);
		}

		System.out.println("============================================");

		System.out.println("Iteration using forEach loop");

		people.forEach(p -> System.out.println(p));

		System.out.println("============================================");

		System.out.println("Iteration using forEach loop with Method reference");
		people.forEach(System.out::println);

	}

}
