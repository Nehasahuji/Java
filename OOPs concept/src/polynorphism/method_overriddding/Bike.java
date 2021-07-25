package polynorphism.method_overriddding;

public class Bike extends Vehicle {

	@Override
	int speed() {

		System.out.println("Bike class is called");
		return 10;
	}

	public static void main(String args[]) {
		Bike b = new Bike();
		System.out.println(b.speed());

	}

}
