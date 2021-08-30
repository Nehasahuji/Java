import java.sql.SQLException;
import java.util.Scanner;

import dao.StudentDao;
import entity.Student;

public class StudentDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		StudentDao sdao = new StudentDao();
		sdao.registerDriver();
		sdao.connect();

		String name = sdao.getName(101);
		System.out.println(name);

		sdao.connect();

		Student student = new Student();

		System.out.println("enter rollNo of Student");
		student.roll_no = sc.nextInt();

		sc.nextLine();

		System.out.println("enter name of student");
		student.name = sc.nextLine();

		int sucess = sdao.addStudent(student);
		System.out.println("is suceed " + sucess);

		sdao.connect();

		System.out.println("insert roll no for which student needs to delete");
		int rollNo = sc.nextInt();
		int result = sdao.removeStudent(rollNo);
		System.out.println("deleted record  " + result);

		sdao.connect();
		sdao.ShowRecords();

	}

}
