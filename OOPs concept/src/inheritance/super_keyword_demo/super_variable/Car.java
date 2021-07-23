package inheritance.super_keyword_demo.super_variable;

public class Car extends Vehicle {

	int speed = 15;

//	want to refer the variable of parent class using child class use keyword super
	void display() {
		System.out.println("calls Variable of Car class using super keyword ---------------" + super.speed);
	}

}
