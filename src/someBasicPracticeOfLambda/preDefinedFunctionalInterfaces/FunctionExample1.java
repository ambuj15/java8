package someBasicPracticeOfLambda.preDefinedFunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample1 {

	public static void main(String[] args) {

		// 1. Finding square of an integer

		Function<Integer, Integer> f1 = i -> i * i;
		System.out.println("Square of integer using function :" + f1.apply(10));

		// 2. Length of the string using function
		Function<String, Integer> f2 = s -> s.length();
		System.out.println("Length of String using function :" + f2.apply("shiva"));
		
		// 3. Function chaining
		Function<Integer, Integer> f3 = i -> 2 * i;
		Function<Integer, Integer> f4 = i -> i * i * i;
		System.out.println(f3.andThen(f4).apply(2));
		

	}

}
