package StringBuffer;

public class StringBufferDemo {

	public static void main(String args[]) {
		StringBuffer str1 = new StringBuffer("value1");
		String str2 = "value2";

		long startTime = System.nanoTime();

		for (int i = 0; i < 1000; i++) {
			str1 = str1.append(str2);
		}

		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("Total execution time to create 1000K objects in Java in millis: " + elapsedTime / 1000000);

		System.out.println("execution compled");

		/*
		 * in Java in millis: 1 execution compled
		 */
	}

}
