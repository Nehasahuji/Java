package inheritance.multiple;

public class Rectangle implements showable, printable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.show();
		rectangle.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

		System.out.println("Printable interface is called");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

		System.out.println("Showable interface is called");

	}

}
