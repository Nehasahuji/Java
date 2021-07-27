package set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String args[]) {

		Set<Book> bookTreeSet = new TreeSet<Book>();
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

		// Adding Books to TreeSet
		bookTreeSet.add(b1);
		bookTreeSet.add(b2);
		bookTreeSet.add(b3);

		// Traversing TreeSet
		for (Book b : bookTreeSet) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}

}
