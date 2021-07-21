package object_and_class.Inner_class.anonymous_class.using_interface;

public class AnonymousClassUsingInterfaceDemo implements Eatable {
	public static void main(String args[]) {

		Eatable eatable = new AnonymousClassUsingInterfaceDemo();
		eatable.eat();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Inside anonymous inner class using interface : eat apples ");
	}

}
