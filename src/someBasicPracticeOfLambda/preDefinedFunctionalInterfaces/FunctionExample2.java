package someBasicPracticeOfLambda.preDefinedFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Locale.Category;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {
	
	// Requirement is to categorize the individuals based on their age

	public static void main(String[] args) {
		List<PersonBase> l1 = Arrays.asList(new PersonBase("Shiv", "J", 14), 
				new PersonBase("Krishna", "Y", 29),
				new PersonBase("Hanuman", "G", 58), 
				new PersonBase("Vishnu", "S", 34),
				new PersonBase("Saraswati", "D", 10));
		
		Function<PersonBase, String> f1 = pB -> {
			String category = "";
			if (pB.getAge() < 18) {
				category = "Children";
			} else if (pB.getAge() <= 40) {
				category = "Youth";
			} else
				category = "Old";
			return category;
		};
		for (PersonBase l2 : l1) {
			System.out.println("Name :" + l2.getFirstName());
			System.out.println("Age :" + l2.getAge());
			System.out.println("Category :" + f1.apply(l2));
			System.out.println("=============");

		}
		
		// Now i want to print only those names whose first name starts with S.

		System.out.println("Function with predicate. Printing only those catregories whose names starts with S");
		Predicate<PersonBase> predicate = pB2 -> pB2.getFirstName().startsWith("S");
		for (PersonBase l2 : l1) {
			if (predicate.test(l2)) {
				System.out.println("Name :" + l2.getFirstName());
				System.out.println("Age :" + l2.getAge());
				System.out.println("Category :" + f1.apply(l2));
				System.out.println("=============");
			}

		}
	}
}
