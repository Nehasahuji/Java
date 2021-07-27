package List.arraylist.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();

		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);

		studentList.add(s3);
		studentList.add(s2);
		studentList.add(s1);

		Iterator<Student> itr = studentList.listIterator();

		while (itr.hasNext()) {
			Student student = itr.next();
			System.out.println("roll no : " + student.rollNo + " name : " + student.name + " age : " + student.age);
		}
	}

}
