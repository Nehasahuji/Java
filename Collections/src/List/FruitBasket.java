package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FruitBasket {

	public static void main(String args[]) {

//    	define a array List
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("mango");
		fruitList.add("banana");
		fruitList.add("grapes");
		fruitList.add("papaya");
		fruitList.add("Apple");

		System.out.print("printer using For each loop : ");

		for (String listitr : fruitList) {

			System.out.print(listitr + " ");

		}

		System.out.println();

		// get specific elements from list

		System.out.println("get fruit at index 4 : " + fruitList.get(4));

		// set specific element at specific position in list

		fruitList.set(2, "dates");

		// print using iterator

		Iterator itr = fruitList.iterator();
		System.out.print("printed using iterator :  ");
		while (itr.hasNext()) {

			System.out.print(itr.next() + " ");
		}

		System.out.println();
		System.out.print("after sorting of elemets  : ");

		// Sorting of list value
		Collections.sort(fruitList);

		for (String string : fruitList) {
			System.out.print(string + " ");
		}

		System.out.println();

		// print values using listITerator

		ListIterator<String> list1 = fruitList.listIterator(fruitList.size());

		System.out.print("printed using list iterator : ");
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.print(str + " ");
		}

		System.out.println();

		System.out.print("print values using lamda expression : ");

		// print values used lamda expresiion

		fruitList.forEach(a -> {
			System.out.print(a + " ");
		});

	}

}
