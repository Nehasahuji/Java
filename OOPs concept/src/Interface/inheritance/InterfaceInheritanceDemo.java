package Interface.inheritance;

public class InterfaceInheritanceDemo implements showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceInheritanceDemo interfaceInheritanceDemo = new InterfaceInheritanceDemo();
		interfaceInheritanceDemo.show();
		interfaceInheritanceDemo.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printable parent interface is called");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

		System.out.println("showable  child interface is called");

	}

}
