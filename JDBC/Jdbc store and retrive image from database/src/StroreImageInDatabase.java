import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StroreImageInDatabase {

	public static void main(String args[]) throws SQLException, FileNotFoundException {

//==================================Register Driver=============================================================================
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			System.out.println(e);
		}

//==================================Create Connection========================================================================

		String userName = "root";
		String password = "Neha@2497";
		String url = "jdbc:mysql://localhost:3306/image_db";

		Connection con = DriverManager.getConnection(url, userName, password);

//=================================Create Statement========================================================================

		String query = "insert into image_details values (?,?,?)";
		PreparedStatement preparedStatement = con.prepareStatement(query);

		int id = 3;

		String ImageName = "mumbai";
		File file = new File("D:\\Interview Prepration\\Java\\JDBC\\assets\\neha.jpg"); // take input in file
		FileInputStream fileInputStream = new FileInputStream(file); // change file to input stream

		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, ImageName);
		preparedStatement.setBinaryStream(3, fileInputStream, (int) file.length());

//==================================execute statement=======================================================================
		preparedStatement.executeUpdate();

		System.out.println("sucessfully inserted image in database");

//==================================close connection========================================================================
		preparedStatement.close();
		con.close();

	}
}
