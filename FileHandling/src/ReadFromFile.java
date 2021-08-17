import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D:\\Interview Prepration\\Java\\Basic Java\\Resources\\File handling\\file.txt");

		Scanner dataReader;
		try {
			dataReader = new Scanner(file);

			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}

			dataReader.close();
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
