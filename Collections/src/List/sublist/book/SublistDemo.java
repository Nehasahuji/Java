package List.sublist.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SublistDemo {

	public static void main(String args[]) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));

		List<Integer> list2 = list.subList(2, 4);

		System.out.println(list2);

		System.out.println(list.size());

		int[] intarray = new int[20];
		int x = intarray.length;
		System.out.println(x);

	}

}
