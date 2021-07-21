package object_and_class.Inner_class.nested_interface.inside_interface;

public class NestedInterfaceDemo implements Showable.Message, Showable {

	public static void main(String args[]) {

		Showable.Message message = new NestedInterfaceDemo();
		message.msg();

//		created object of showable interface
		Showable showable = new NestedInterfaceDemo();
		showable.show();

	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("inside nested interface message");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Interface methopd show");
	}
}
