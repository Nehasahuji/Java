package inheritance.super_keyword_demo.super_method;

public class Student extends Person {

	public void message() {
		System.out.println("---------- Message method of Student  class --------------");
	}

	void display() {

		System.out.println(" ------------------------------------------");
		message();

		System.out.println(" ------------------------------------------");
		super.message();

	}
}
