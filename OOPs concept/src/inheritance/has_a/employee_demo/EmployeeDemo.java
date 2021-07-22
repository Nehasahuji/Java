package inheritance.has_a.employee_demo;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address1 = new Address("gzb", "UP", "india", 48001);
		Address address2 = new Address("gno", "UP", "india", 99999);

		Employee employee1 = new Employee("varun", "nema", address1);
		Employee employee2 = new Employee("seema", "nema", address1);

		employee1.display();
		employee2.display();
	}

}
