package multithreading.implements_interface;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable hi = new Hi();
		Runnable hello = new Hello();

		Thread hithread = new Thread(hi);
		Thread hellothread = new Thread(hello);

		hithread.start();

		try {
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println("Exception in hi class " + e);

		}

		hellothread.start();

	}

}
