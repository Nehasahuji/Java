package transient_keyword;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializeDemo {

	public static void main(String args[]) {

		try {

//			creating an object
			Student student = new Student(101, "neha", 3999);

//			creating stream and writing the object
			FileOutputStream fout = new FileOutputStream(
					"D:\\Interview Prepration\\Java\\Basic Java\\Resources\\File handling\\file.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(student);
			out.flush();

//			close
			out.close();

			System.out.println("sucess");
		} catch (IOException exception) {
			System.out.println(exception);
		}

	}

}
