import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D:\\Interview Prepration\\Java\\Basic Java\\Resources\\File handling\\file.txt");

		try {

			if (file.createNewFile()) {
				System.out.println("file is created " + file.getName());
			} else {
				System.out.println("file is already exist");
			}

		} catch (IOException exception) {
			System.out.println(exception);
		}

	}

}
