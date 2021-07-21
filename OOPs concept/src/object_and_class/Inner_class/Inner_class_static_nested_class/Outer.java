package object_and_class.Inner_class.Inner_class_static_nested_class;

public class Outer {

	static int data = 5;

//	created nested inner class
	static class Inner {

		int varibale = 10;

		void display() {
			System.out.println("inside nested static class variable is : " + varibale + " data is " + data);
		}
	}

	public static void main(String args[]) {
		Outer.Inner outer = new Outer.Inner();
		outer.display();
	}

}
