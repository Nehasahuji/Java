package List.sublist.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {

	public static void main(String args[]) {
		List<Book> booklists = new ArrayList<Book>();

		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

		booklists.add(b3);
		booklists.add(b2);
		booklists.add(b1);

		Iterator<Book> itr = booklists.iterator();

		while (itr.hasNext()) {
			Book temp = itr.next();
			System.out.println("book id =>  " + temp.getId() + " book name => " + temp.getName() + " book author => "
					+ temp.getAuthor() + "book publisher => " + temp.getPublisher() + " book quantity => "
					+ temp.getQuantity());
		}

	}
}
