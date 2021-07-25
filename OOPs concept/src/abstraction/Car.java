package abstraction;

public class Car extends Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v = new Car();
		v.run();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("car is runniung");

	}

}
