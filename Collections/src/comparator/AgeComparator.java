package comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub

		if (student1.age == student2.age) {
			return 0;
		} else if (student1.age > student2.age) {
			return 1;

		} else {
			return -1;
		}
	}

}
