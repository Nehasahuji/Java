package variable;

public class Student {

	int rollNo;
	String name;
	static String COLLEGE = "ITS";

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	void display() {
		System.out.println("rool no : " + rollNo + " name : " + name + " College : " + COLLEGE);

	}

}
