package object_and_class.anonymous_object;

public class CalculationDemo {

	public static void main(String args[]) {
//		create ananoymus object
		System.out.println("factorial of 5 is : " + new Calculation().fact(5));

//		creating two object of same type

		Calculation cal1 = new Calculation(), cal2 = new Calculation();
		System.out.println("factorial of 10 is : " + cal1.fact(10));

		System.out.println("factorial of 2 is : " + cal2.fact(2));

	}

}
