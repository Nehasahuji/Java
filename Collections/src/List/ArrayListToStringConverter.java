package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToStringConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		list.add("How");
		list.add("Are");
		list.add("you");

		System.out.println(list);

		StringBuffer sb = new StringBuffer();

		for (String s : list) {
			sb.append(s);
			sb.append(" ");
		}

		String str = sb.toString();

		System.out.println(str);

	}

}
