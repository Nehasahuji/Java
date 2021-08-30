package insert_through_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
steps of connectivity
1.import package*
2.load and register driver
3.create connection 
4.create statement
5.process statement
6.Generate result
7.close connection*/

public class PreparedStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

//		Register Driver
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/testdb";
		String userName = "root";
		String password = "Neha@2497";
		String query = "INSERT INTO STUDENT VALUES (?,?,?,?) ";

		int id = 8;
		String name = "case";
		int standard = 12;
		String emailId = "caose@gmail.com";

		// create connection
		Connection con = DriverManager.getConnection(url, userName, password);

		// create statement
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setInt(3, standard);
		preparedStatement.setString(4, emailId);

//		execute statement
		int noOfRowsAffected = preparedStatement.executeUpdate();
		System.out.println(noOfRowsAffected);

//		close statement
		preparedStatement.close();
		con.close();

	}

}
