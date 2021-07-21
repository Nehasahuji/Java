package object_and_class.Inner_class_local_inner_class;

public class LocalInnerClassDemo {

	int variable = 50;

	public void viewData() {

//		created class inside method
//		class canot be public
		class Inner {

			int data = 30;

			public void display() {
				System.out.println("Inside Local inner class value is : " + data);
			}

		}

		Inner inner = new Inner();
		inner.display();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalInnerClassDemo localInnerClassDemo = new LocalInnerClassDemo();
		localInnerClassDemo.viewData();
	}

}
