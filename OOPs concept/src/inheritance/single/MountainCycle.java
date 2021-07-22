package inheritance.single;

public class MountainCycle extends Bicycle {

	public int seatHight;

	public MountainCycle(int gear, int speed, int seatHight) {
		super(gear, speed);
		this.seatHight = seatHight;
	}

	public int setSeatHeight(int height) {
		return seatHight + height;
	}

	@Override
	public String toString() {
		return "MountainCycle [seatHight=" + seatHight + ", gear=" + gear + ", speed=" + speed + "]";
	}

}
