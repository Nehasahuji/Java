package multithreading.extends_class;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hi hi = new Hi();
		Hello hello = new Hello();

		hi.start();

		try {
			Thread.sleep(10);
		} catch (Exception e) {
			System.out.println("Exception in hi class " + e);

		}
		hello.start();

	}

}
