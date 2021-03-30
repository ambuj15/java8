package streams;

import java.util.Arrays;
import java.util.List;

import someBasicPracticeOfLambda.preDefinedFunctionalInterfaces.PersonBase;

public class StreamExample3 {

	public static void main(String[] args) {
		List<PersonBase> people = Arrays.asList(new PersonBase("Ram", "Singh", 14),
				new PersonBase("Krishna", "Yadav", 29), new PersonBase("Hanuman", "Singh", 58),
				new PersonBase("Vishnu", "Goyal", 34), new PersonBase("Saraswati", "Gupta", 10));

		System.out.println("Print all first names whose last name starts with G");

		people.stream()
		.filter(a -> a.getLastName().startsWith("G"))
		.forEach(b -> System.out.println(b.getFirstName()));
	}

}
