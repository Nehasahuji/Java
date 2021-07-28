package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(101, "Neha");
		map.put(104, "Megha");
		map.put(103, "Astha");
		map.put(100, "Ayushi");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
