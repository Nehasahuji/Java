package using_lambda_expression;

public class ThreadDemo {

	public static void main(String[] args) {
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

	}

}
