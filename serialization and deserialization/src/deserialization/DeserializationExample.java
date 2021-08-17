package deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

//		creating an stream to read object
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("D:\\Interview Prepration\\Java\\Basic Java\\Resources\\File handling\\file.txt"));

		Student student = (Student) in.readObject();

//		printing the data of serialized object
		System.out.println(student.age + " " + student.name + " " + student.rollNo);

//		closing the stream
		in.close();
	}

}
