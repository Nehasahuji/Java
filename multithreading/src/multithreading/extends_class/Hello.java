package multithreading.extends_class;

public class Hello extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Exception in Hello class" + e);

			}
		}
	}

}
