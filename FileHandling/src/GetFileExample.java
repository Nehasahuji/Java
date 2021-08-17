import java.io.File;

public class GetFileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D:\\Interview Prepration\\Java\\Basic Java\\Resources\\File handling\\file.txt");

		if (file.exists()) {
			System.out.println("file name is : " + file.getName());

			System.out.println("file absolute path : " + file.getAbsolutePath());

			System.out.println("Is readable :" + file.canRead());

			System.out.println("is writable : " + file.canWrite());

			System.out.println("length of file is : " + file.length());
		} else {
			System.out.println("file does not exist ");
		}

	}

}
