package map.hashmap.book;

import java.util.HashMap;
import java.util.Map;

public class BookMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Book> bookMap = new HashMap<Integer, Book>();

		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

		// Adding Books to map
		bookMap.put(1, b1);
		bookMap.put(2, b2);
		bookMap.put(3, b3);

		for (Map.Entry<Integer, Book> m : bookMap.entrySet()) {
			int T = m.getKey();
			Book b = m.getValue();

			System.out.print("key : " + T + " Details : ");
			System.out.println(b.id + ", " + b.name + ", " + b.author + ", " + b.publisher + ", " + b.quantity);
		}

	}

}
