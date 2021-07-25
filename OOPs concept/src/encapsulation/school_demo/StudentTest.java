package encapsulation.school_demo;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student(101, "neha");
		System.out.println(" Name : " + s.getName() + " Roll No : " + s.getRollNo());

		Student s1 = new Student();

		s1.setName("Akash");
		s1.setRollNo(151);

		System.out.println(" Name : " + s1.getName() + " Roll No : " + s1.getRollNo());

	}

}
