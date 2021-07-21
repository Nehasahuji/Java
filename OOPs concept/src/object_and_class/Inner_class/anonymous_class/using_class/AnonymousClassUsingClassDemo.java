package object_and_class.Inner_class.anonymous_class.using_class;

public class AnonymousClassUsingClassDemo extends Person {

	@Override
	public void displaydata() {
		// TODO Auto-generated method stub

		System.out.println("Inside anonymous inner class using class : display data ");

	}

	public static void main(String args[]) {

		Person P1 = new AnonymousClassUsingClassDemo();
		P1.displaydata();

	}

}
