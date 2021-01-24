package basicProgrammes;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {

		ArrayList<EmployeeBase> l = new ArrayList<>();
		l.add(new EmployeeBase("Ambuj", 684177));
		l.add(new EmployeeBase("Apoorva", 53948));
		l.add(new EmployeeBase("Anil", 124366));
		l.add(new EmployeeBase("Sanchi", 784177));
		l.add(new EmployeeBase("Sagar", 84177));
		l.add(new EmployeeBase("Neelu", 694177));

		System.out.println("Before Sorting: " + l);

		System.out.println(
				"==========Using Lambda with compare method of Comparator Interface to sort integer values=========");
		// Sorting on the basis of Ascending order of Employee Number
		Collections.sort(l, (e1, e2) -> (e1.eNo < e2.eNo) ? -1 : (e1.eNo > e2.eNo) ? 1 : 0);

		System.out.println("After Sorting in Ascending order of Emploee number : " + l);

		// Sorting on the basis of Descending order of Employee Number
		Collections.sort(l, (e1, e2) -> (e1.eNo < e2.eNo) ? 1 : (e1.eNo > e2.eNo) ? -1 : 0);
		System.out.println("After Sorting in Descending order of Emploee number : " + l);

		System.out.println(
				"==========Using Lambda with compareTo method of Comparable Interface to sort integer values=========");
		// Sorting on the basis of name in Ascending order
		Collections.sort(l, (n1, n2) -> n1.name.compareTo(n2.name));
		System.out.println("After Sorting in Ascending order of Emploee name :" + l);

		// Sorting on the basis of name in Descending order
		Collections.sort(l, (n1, n2) -> n2.name.compareTo(n1.name));
		System.out.println("After Sorting in Descending order of Emploee name :" + l);
	}

}
