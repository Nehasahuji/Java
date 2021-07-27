package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] A = { 22, 45, 33, 66, 55, 34, 77 };
		Integer[] B = { 33, 2, 83, 45, 3, 12, 55 };

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));

		System.out.println("set one is : " + set1);

		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));

		System.out.println("set two is : " + set2);

		Set<Integer> unionData = new HashSet<Integer>(set1);
		unionData.addAll(set2);

		System.out.println("union of two sets" + unionData);

		Set<Integer> intersectionData = new HashSet<Integer>(set1);
		intersectionData.retainAll(set2);
		System.out.println("intersection of two sets" + intersectionData);

		Set<Integer> differentData = new HashSet<Integer>(set1);
		differentData.removeAll(set2);
		System.out.println("difference between two sets" + differentData);

	}

}
