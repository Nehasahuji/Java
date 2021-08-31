package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.Student;

/*1.import package
2.load and register driver
3.create connection 
4.create statement
5.execute statement
6.process result
7.close connection*/

public class StudentDao {

	Connection con = null;

//=====================================register driver=============================================================
	public void registerDriver() {

		try {

			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {

			System.out.println(e);
		}

	}

//=======================================connection with database==================================================
	public void connect() {

		String userName = "root";
		String password = "Neha@2497";
		String url = "jdbc:mysql://localhost:3306/JDBC_DEMO";

		try {

			con = DriverManager.getConnection(url, userName, password);

		} catch (SQLException e) {

			System.out.println(e);
		}
	}

//=====================================get Name of user from rollNo================================================
	public String getName(int rollNo) throws SQLException {

		registerDriver();
		connect();
		Student student = new Student();

		String query = "SELECT student.name from student where roll_no=" + rollNo;

		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			rs.next();
			student.name = rs.getString(1);

			st.close();
			con.close();

		} catch (SQLException e) {

			System.out.println(e);
		}

		return student.name;

	}

//=====================================add new student===============================================================
	public int addStudent(Student student) throws SQLException {

		registerDriver();
		connect();

		String insertQuery = "insert into student values(?,?)";
		PreparedStatement pst = con.prepareStatement(insertQuery);

		pst.setInt(1, student.roll_no);
		pst.setString(2, student.name);

		int result = pst.executeUpdate();

		pst.close();
		con.close();

		return result;
	}

//=====================================remove student==================================================================
	public int removeStudent(int rollNo) throws SQLException {

		registerDriver();
		connect();

		String deletequery = "delete from student where roll_no=" + rollNo;
		Statement st = con.createStatement();
		int result = st.executeUpdate(deletequery);
		st.close();
		con.close();
		return result;

	}

//=====================================show all records===============================================================
	public void ShowRecords() throws SQLException {

		registerDriver();
		connect();

		String retriveQuery = "select * from student";
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(retriveQuery);

		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);

			System.out.println("id : " + id + " name " + name);
		}

		st.close();
		con.close();

	}

}
