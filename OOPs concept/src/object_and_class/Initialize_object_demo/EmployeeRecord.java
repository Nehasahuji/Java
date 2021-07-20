package object_and_class.Initialize_object_demo;

public class EmployeeRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

//		initialize object by method
		emp1.insert(1, "New", 20000);

		emp1.display();

//		Initialize object reference variable
		Employee emp3 = new Employee();

		emp3.id = 3;
		emp3.name = "Refrence";
		emp3.salary = 400000;
		System.out.println();
		System.out.println("Initialize object reference variable");
		System.out.println(

				"Employee ID :  " + emp3.id + " Employee Name : " + emp3.name + " Employee Salary :" + emp3.salary);
		System.out.println();
		// initialize object by constructor

		Employee emp4 = new Employee(101, "neha", 200);

		System.out.println("Initialize object by constructor");
		System.out.println(
				"Employee ID :  " + emp4.id + " Employee Name : " + emp4.name + " Employee Salary :" + emp4.salary);

	}

}
