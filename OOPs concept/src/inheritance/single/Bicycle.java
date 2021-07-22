package inheritance.single;

public class Bicycle {

	int gear;
	int speed;

	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}

	public int applyBreak(int decrement) {
		return speed - decrement;
	}

	public int sppedUp(int increment) {
		return speed + increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}

}
