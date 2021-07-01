package workers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkersList {

	public static void main(String args[]) {

		Worker w1 = new Worker(1, "neha", 20);
		Worker w2 = new Worker(2, "megha", 15);

		List<Worker> workerLists = new ArrayList<Worker>();
		workerLists.add(w1);
		workerLists.add(w2);

		Iterator<Worker> itr = workerLists.iterator();

		while (itr.hasNext()) {

			Worker worker = (Worker) itr.next();
			System.out.println(
					"id is : " + worker.getId() + " name is : " + worker.getName() + " age is : " + worker.getAge());
		}

	}

}
