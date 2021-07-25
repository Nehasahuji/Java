package encapsulation.bank_demo;

public class Account {

	int acccountNo;
	String name, Email;

	Double ammount;

	public int getAcccountNo() {
		return acccountNo;
	}

	public void setAcccountNo(int acccountNo) {
		this.acccountNo = acccountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Double getAmmount() {
		return ammount;
	}

	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println(
				" Name : " + name + " Email : " + Email + " AccountNo :" + acccountNo + " Ammount : " + ammount);
	}

}
