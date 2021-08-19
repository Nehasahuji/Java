package interthread_communication;

public class InterThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test testInterThread = new Test();
		new Producer(testInterThread);
		new Consumer(testInterThread);

	}

}
