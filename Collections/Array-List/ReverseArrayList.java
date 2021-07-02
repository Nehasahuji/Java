package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String args[]) {

		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		System.out.print("array list : ");

		System.out.println(arrayList);
		List<Integer> reverseList = new ArrayList<Integer>();

		for (int i = arrayList.size() - 1; i >= 0; i--) {
			reverseList.add(arrayList.get(i));
		}

		System.out.println("reverse array list list copy feature  : " + reverseList);

		System.out.print("reverse array list using collecctions freamework : ");
		// using the reverse function of arrayList

		Collections.reverse(arrayList);
		System.out.print(arrayList);
	}

}
