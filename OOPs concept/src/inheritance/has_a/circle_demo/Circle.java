package inheritance.has_a.circle_demo;

public class Circle {

	int radius;
	Square sq;

	public float area(int radius) {

		sq = new Square();
		return (float) (3.14 * sq.square(radius));
	}

}
