package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizeArrayList {

	public static void main(String args[]) {

		// An array list which is not sychronized

		List<String> listOfSymbols = new ArrayList<String>();
		listOfSymbols.add("Realince");
		listOfSymbols.add("Tata");
		listOfSymbols.add("TechMah");
		listOfSymbols.add("Hdfc");
		listOfSymbols.add("IcIc");

		// synchronise array list
		listOfSymbols = Collections.synchronizedList(listOfSymbols);

		synchronized (listOfSymbols) {

			Iterator<String> myIterator = listOfSymbols.iterator();

			while (myIterator.hasNext()) {
				System.out.println(myIterator.next());
			}
		}
	}

}
