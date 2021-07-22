package inheritance.has_a.employee_demo;

public class Employee {

	String firstName;
	String lastName;

	Address address;

	public Employee(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	void display() {
		System.out.println(firstName + " " + lastName);
		System.out.println(address.city + " " + address.state + " " + address.country + " " + address.pinCode);
	}

}
