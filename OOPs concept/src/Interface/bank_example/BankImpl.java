package Interface.bank_example;

public class BankImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank1 = new SBI();

		System.out.println("SBI bank rate OF interest " + bank1.rateOFInterest());

		Bank bank2 = new ICIC();

		System.out.println("ICIC bank rate OF interest " + bank2.rateOFInterest());

	}

}
