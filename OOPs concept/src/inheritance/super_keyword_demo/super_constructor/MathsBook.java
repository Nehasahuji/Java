package inheritance.super_keyword_demo.super_constructor;

public class MathsBook extends Book {

	MathsBook() {

		System.out.println(" calls contructor of MathsBook Class ");
	}

	MathsBook(int no) {

//		 calls Parameterized constructor of book class
		super(10);
		System.out.println(" calls parmetrized contructor of MathsBook Class ");
	}

}
