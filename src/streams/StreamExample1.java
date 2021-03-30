package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			l.add(i);

		}
		l.forEach(System.out::println);

		System.out.println("Print all even numbers without using stream");
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (Integer i : l) {
			if (i % 2 == 0) {
				l2.add(i);
			}
		}
		System.out.println(l2);

		System.out.println("================================");
		System.out.println("Print all even numbers with stream");
		System.out.println(l.stream().filter(number -> number % 2 == 0).collect(Collectors.toList()));
	}

}
