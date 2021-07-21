package object_and_class.Inner_class.nested_interface.inside_class;

public class NestedClassInterfaceImp implements NestedClassInterface.demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NestedClassInterface.demo nested = new NestedClassInterfaceImp();
		nested.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

		System.out.println("value inside the method of nested class interface");

	}

}
