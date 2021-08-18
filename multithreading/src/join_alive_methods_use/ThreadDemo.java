package join_alive_methods_use;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		using anonymous class
//		use lambda expression
		Thread hithread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {

				System.out.println("Hello");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("Exception in Hello class" + e);

				}
			}

		});

		Thread hellothread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("Exception in hi class " + e);

				}
			}

		});

		hithread.start();

		try {
			Thread.sleep(10);
		} catch (Exception e) {
			System.out.println("Exception in hi class " + e);

		}

		hellothread.start();

//		check if the thread is alive
		System.out.println("Ishithread is alive :" + hithread.isAlive());

		// wait for hithread to complete join in main
		hithread.join();
		System.out.println("Ishithread is alive after join:" + hithread.isAlive());

		System.out.println("Ishellowthread is alive :" + hellothread.isAlive());

		// wait for hellothread to complete and join in main
		hellothread.join();
		System.out.println("Ishellothread is alive after join:" + hellothread.isAlive());

		System.out.println("Bye");
	}

}
