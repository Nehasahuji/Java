package transient_keyword;

import java.io.Serializable;

public class Student implements Serializable {

	int rollNo;

	String name;

	transient double age;

	public Student(int rollNo, String name, double age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

}
