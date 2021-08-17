import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("D:\\Interview Prepration\\Java\\Basic Java\\Resources\\File handling\\file.txt");
			file.delete();
			System.out.println("file deleted sucessfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
