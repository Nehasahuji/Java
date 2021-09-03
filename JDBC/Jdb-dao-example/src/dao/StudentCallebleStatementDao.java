package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import entity.Student;

public class StudentCallebleStatementDao {

	public void insertStudent(Student student) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		String userName = "root";
		String password = "Neha@2497";
		String url = "jdbc:mysql://localhost:3306/JDBC_DEMO";

		Connection con = DriverManager.getConnection(url, userName, password);

		java.sql.CallableStatement cst = con.prepareCall("{call insertData(?,?)}");

		cst.setInt(1, student.roll_no);
		cst.setString(2, student.name);

		cst.execute();

		System.out.println("sucess");

		cst.close();
		con.close();

	}
}
