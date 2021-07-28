package map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class FruitsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> fruitsMap = new TreeMap<Integer, String>();

		fruitsMap.put(101, "grapes");
		fruitsMap.put(1, "Mango"); // Put elements in Map
		fruitsMap.put(2, "Apple");
		fruitsMap.put(3, "Banana");
		fruitsMap.put(1, "Grapes"); // trying duplicate key

		for (Map.Entry m : fruitsMap.entrySet()) {
			System.out.print(m.getKey() + " " + m.getValue() + "      ");
		}

		System.out.println();
		System.out.println("after entering a new recored");

		fruitsMap.putIfAbsent(103, "mango");

		for (Map.Entry m : fruitsMap.entrySet()) {
			System.out.print(m.getKey() + " " + m.getValue() + "       ");
		}
		System.out.println();
		System.out.println("after removing a recored");

		fruitsMap.remove(1);

		for (Map.Entry m : fruitsMap.entrySet()) {
			System.out.print(m.getKey() + " " + m.getValue() + "       ");
		}
		System.out.println();
		System.out.println("after replacing a recored");

		fruitsMap.replace(3, "kivi");

		for (Map.Entry m : fruitsMap.entrySet()) {
			System.out.print(m.getKey() + " " + m.getValue() + "       ");
		}

	}

}
