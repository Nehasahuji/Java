package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitilaizeArrayDemo {

	public static void main(String args[]) {

		List<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(numberList);

	}

}
