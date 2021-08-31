import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*steps of connection with database jdbc
 1.import package -->java.sql
 2.load driver    --> right click - build path -libraries - modules -add external jar -select file and then close
 3.register driver -->forName method
 4.create connection  -->connection interface
 5.create statement   -->statement interface
 6.execute query      -->execute command 
 7.process result      -->resultset.next
 8.close connection        -->close connection and statement
  
*/
public class Demo {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {

		String databaseUrl = "jdbc:mysql://localhost:3306/testdb";
		String userName = "root";
		String password = "Neha@2497";
		String fetch_query = "SELECT * FROM students";

//	register driver
		Class.forName("com.mysql.jdbc.Driver");
// create connection 
		Connection con = DriverManager.getConnection(databaseUrl, userName, password);

//		create statement 
		Statement st = con.createStatement();

//		execute query store in result set
		ResultSet rs = st.executeQuery(fetch_query); // used for DQL

//		process result
		/*
		 * while (rs.next()) { int id = rs.getInt(1); String name = rs.getString(2);
		 * String standard = rs.getString(3); String email = rs.getString(4);
		 * 
		 * System.out.println(id + " " + name + " " + standard + " " + email); }
		 */
//	close connection
		st.close();
		con.close();

	}

}
