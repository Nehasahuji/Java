package multithreading.implements_interface;

public class Hi implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Exception in hi class " + e);

			}
		}
	}

}
