
public class StringConcatinationDemo {

	public static void main(String args[]) {

		String str1 = "value1";
		String str2 = "value2";

		long startTime = System.nanoTime();

		for (int i = 0; i < 1000; i++) {
			str2 = str1 + str2;
		}

		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("in Java in millis: " + elapsedTime / 1000000);

		System.out.println("execution compled");
	}

	/*
	 * in Java in millis: 8 execution compled
	 */

}
