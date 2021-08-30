package insert_through_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
steps of connectivity
1.import package*
2.load and register driver
3.create connection 
4.create statement
5.process statement
6.Generate result
7.close connection*/

public class InsertQuerythroughDatabaseDemo {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {

//		register driver
		Class.forName("com.mysql.jdbc.Driver");

		String databaseUrl = "jdbc:mysql://localhost:3306/testdb";
		String userName = "root";
		String password = "Neha@2497";
		String query = "INSERT INTO STUDENT VALUES(7,\"Boss\",11,\"boss@gmail.com\");";

//		create connection
		Connection con = DriverManager.getConnection(databaseUrl, userName, password);

//		create statement
		Statement st = con.createStatement();

//	process statement	
		int noOfRowsUpdated = st.executeUpdate(query);

//		print result
		System.out.println("no of rows affected are" + noOfRowsUpdated);

//		close connection
		st.close();
		con.close();

	}

}
