import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter filewriter = new FileWriter(
					"D:\\Interview Prepration\\Java\\Basic Java\\Resources\\File handling\\file.txt");

			filewriter.write("A named location used to store related information is referred to as a File.");

			filewriter.close();

			System.out.println("content is sucessfully written into file");

		} catch (IOException exception) {
			System.out.println(exception);
		}
	}

}
