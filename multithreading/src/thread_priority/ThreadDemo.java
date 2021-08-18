package thread_priority;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		using anonymous class
//		use lambda expression
		Thread hithread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {

				System.out.println("Hello : " + Thread.currentThread().getName() + " " + Thread.currentThread().getId()
						+ " " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("Exception in Hello class" + e);

				}
			}

		});

		System.out.println("befor setting the priority : " + hithread.getPriority());
		hithread.setPriority(Thread.MIN_PRIORITY);
		System.out.println("after setting the priority : " + hithread.getPriority());

		Thread hellothread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi : " + Thread.currentThread().getName() + " " + Thread.currentThread().getId()
						+ " " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("Exception in hi class " + e);

				}
			}

		});

		System.out.println("befor setting the priority : " + hellothread.getPriority());
		hellothread.setPriority(Thread.MAX_PRIORITY);
		System.out.println("after setting the priority : " + hellothread.getPriority());

		hithread.start();

		try {
			Thread.sleep(10);
		} catch (Exception e) {
			System.out.println("Exception in hi class " + e);

		}

		hellothread.start();

//		
		// wait for hithread to complete join in main
		hithread.join();

		// wait for hellothread to complete and join in main
		hellothread.join();

		System.out.println("Bye");
	}

}
