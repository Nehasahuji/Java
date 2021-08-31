import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveImageFromdatabase {

	public static void main(String[] args) throws SQLException, IOException {

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

		String query = "select * from image_details";

		byte b[];
		Blob blob;

		PreparedStatement preparedStatement = con.prepareStatement(query);

		File file = new File("D:\\Interview Prepration\\Java\\JDBC\\output\\farewell.jpg"); // take input in file
		FileOutputStream fileOutputStream = new FileOutputStream(file); // change file to input stream

//==================================Result set statement=======================================================================
		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {

			int Id = rs.getInt(1);
			String ImageName = rs.getString(2);

			blob = rs.getBlob("image"); // get image

			b = blob.getBytes(1, (int) blob.length());// convert it into bytes

			fileOutputStream.write(b); // write output in file

			System.out.println(Id + " " + ImageName + " " + "sucessfully created file");
		}

//==================================close connection========================================================================

		preparedStatement.close();
		fileOutputStream.close();
		con.close();

	}

}
