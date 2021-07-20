package object_and_class.Initialize_object_demo;

public class Employee {

	int id;
	String name;
	float salary;

//	Initialize object by method
	public void insert(int empId, String empName, float empSalary) {
		id = empId;
		name = empName;
		salary = empSalary;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Initialize object by method");
		System.out.println("Employee ID :  " + id + " Employee Name : " + name + " Employee Salary :" + salary);
	}

	public Employee() {

	}

	// initialize object by constructor
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}
