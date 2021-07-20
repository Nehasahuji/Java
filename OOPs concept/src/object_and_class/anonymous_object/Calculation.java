package object_and_class.anonymous_object;

public class Calculation {

	public float fact(int n) {

		float fact = 1;
		for (int i = n; i > 1; i--) {
			fact = fact * i;
		}

		return fact;
	}

}
