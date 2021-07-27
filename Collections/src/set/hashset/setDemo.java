package set.hashset;

import java.util.HashSet;
import java.util.Set;

public class setDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> stringSet = new HashSet<String>();

		stringSet.add("Ravi");
		stringSet.add("Vijay");
		stringSet.add("Arun");
		stringSet.add("Sumit");
		System.out.println("An initial list of elements: " + stringSet);

		stringSet.remove("Sumit");
		System.out.println("An updated list of elements: " + stringSet);

		stringSet.removeIf(set -> stringSet.contains("Vijay"));

		System.out.println("An removing defined element, list of elements: " + stringSet);

	}

}
