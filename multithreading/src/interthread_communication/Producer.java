package interthread_communication;

public class Producer implements Runnable {

	Test test;

	public Producer(Test test) {

		this.test = test;
//		creating a new thread
		Thread producerThread = new Thread(this, "Producer thread");
		producerThread.start();
	}

	@Override
	public void run() {

		int i = 0;

		while (true) {
			test.put(i++);
//			added try catch block
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
