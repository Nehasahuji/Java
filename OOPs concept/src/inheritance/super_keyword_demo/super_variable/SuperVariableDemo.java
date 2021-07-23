package inheritance.super_keyword_demo.super_variable;

public class SuperVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		object of Car Class

		Car c = new Car();

//	 calls variable of car class
		System.out.println("variable of Car classs --------------" + c.speed);

		Vehicle v = new Vehicle();
		System.out.println("Variable of  vehicle class -------------" + v.speed);

		c.display();

	}

}
