package method;

public class StudentImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student(101, "neha");
		Student student2 = new Student(102, "megha");

//		before call of static method
		System.out.println("before call of static method");
		student1.display();
		student2.display();

		Student.Change(); // calls method with the class name not with the object bname as method is
							// associated with the class not with the object

		System.out.println("after call of static method");
//		after call of static method
		student1.display();
		student2.display();

	}

}
