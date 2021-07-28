package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> studentlist = new ArrayList<Student>();

		studentlist.add(new Student(101, "Vijay", 23));
		studentlist.add(new Student(106, "Ajay", 27));
		studentlist.add(new Student(105, "Jai", 21));

		System.out.println("sorting list on age");

		Collections.sort(studentlist, new AgeComparator());

		for (Student st : studentlist) {
			System.out.print(st.rollNo + " " + st.name + " " + st.age + "      ");
		}
		System.out.println();
		System.out.println("Sorting by name");

		Collections.sort(studentlist, new NameComparator());

		for (Student st : studentlist) {
			System.out.print(st.rollNo + " " + st.name + " " + st.age + "      ");
		}

	}

}
