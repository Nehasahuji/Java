package List.linkedlist.book;

import java.util.LinkedList;
import java.util.List;

public class BookLinkedList {

	public static void main(String args[]) {
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

		List<Book> bookLinkedList = new LinkedList<Book>();
		bookLinkedList.add(b3);
		bookLinkedList.add(b2);
		bookLinkedList.add(b1);

		for (Book b : bookLinkedList) {
			System.out.println("id : " + b.id + " name : " + b.name + "author : " + b.author + " punbication : "
					+ b.publisher + " quantity : " + b.quantity);
		}
	}

}
