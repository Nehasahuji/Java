import java.sql.SQLException;
import java.util.Scanner;

import dao.StudentCallebleStatementDao;
import dao.StudentDao;
import entity.Student;

public class StudentDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//=====================================scanner for taking input=======================================================

		Scanner sc = new Scanner(System.in);

//  create reference of dao object

		StudentDao sdao = new StudentDao();

//=====================================get name of the user from rollno================================================

		String name = sdao.getName(101);
		System.out.println(name);

//=====================================insert record through prepared statement=========================================		

		Student student = new Student();

		System.out.println("enter rollNo of Student");
		student.roll_no = sc.nextInt();

		sc.nextLine();

		System.out.println("enter name of student");
		student.name = sc.nextLine();

		int sucess = sdao.addStudent(student);
		System.out.println("is suceed " + sucess);

//=====================================delete record for specific rollNo================================================

		System.out.println("insert roll no for which student needs to delete");

		int rollNo = sc.nextInt();
		int result = sdao.removeStudent(rollNo);

		System.out.println("deleted record  " + result);

//=====================================insert new record into student table ============================================ 

		Student student1 = new Student();

		System.out.println("enter rollNo of Student");
		student1.roll_no = sc.nextInt();

		sc.nextLine();

		System.out.println("enter name of student");
		student1.name = sc.nextLine();

		StudentCallebleStatementDao stcd = new StudentCallebleStatementDao();

		stcd.insertStudent(student1);

//======================================view all the records============================================================

		sdao.ShowRecords();

	}

}
