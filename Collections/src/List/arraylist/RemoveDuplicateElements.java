package List;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

//        create an arrayList
		List<Integer> numberList = new ArrayList<Integer>();

//		add elements in array
		numberList.add(1);
		numberList.add(1);
		numberList.add(1);
		numberList.add(1);
		numberList.add(1);

		// print array before deleting duplicate elements
		System.out.println(numberList);

		// create as set
		Set<Integer> numberSet = new LinkedHashSet<Integer>(numberList);

		// clear list
		numberList.clear();

		// add all the elements from set to list
		numberList.addAll(numberSet);

		// Print only distinct element
		System.out.println(numberList);

	}

}
