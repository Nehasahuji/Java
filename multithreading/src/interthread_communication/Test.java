package interthread_communication;

public class Test {

	int num;
	boolean valueset = false;

	public synchronized void put(int num) {
		while (valueset) {

//			thread needs to wait till the value is get
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" put : " + num);
		this.num = num;
		valueset = true;

//		notify the consumer thread that you can get value now
		notify();

	}

//	thread needs to wait till the value is set
	public synchronized void get() {
		while (!valueset) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" get : " + num);
		valueset = false;

//		notify producer  thread that you can work now
		notify();

	}

}
