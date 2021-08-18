package thread_name;

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

//print name of thread
		System.out.println("befor set name " + hithread.getName());
		hithread.setName("Hi thread ");
		System.out.println("After set name " + hithread.getName());

		Thread hellothread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println("Exception in hi class " + e);

				}
			}
// sets the name of the thread 
		}, "Hello thread");

		System.out.println("After set name " + hellothread.getName());

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

		System.out.println("bye");

	}

}
