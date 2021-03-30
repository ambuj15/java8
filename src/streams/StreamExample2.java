package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		l1.forEach(System.out::println);

		System.out.println("Doubling the value of each element without streams");
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (Integer i : l1) {
			l2.add(i * 2);
		}
		System.out.println(l2);
		System.out.println("===============================================");
		System.out.println("Doubling the value of each element with streams");
		System.out.println(l1.stream().map(number -> number * 2).collect(Collectors.toList()));

	}

}
