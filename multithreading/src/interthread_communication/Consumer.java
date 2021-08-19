package interthread_communication;

public class Consumer implements Runnable {

	Test test;

	public Consumer(Test test) {
		this.test = test;

		Thread consumerThread = new Thread(this, "Conumer thread");
		consumerThread.start();
	}

	@Override
	public void run() {

		while (true) {
			test.get();

//			sleep of thread for some time
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
