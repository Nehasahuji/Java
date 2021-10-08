package equlals_hashnode;

public class ClinetService {

	public static void main(String args[]) {

		Client client_1 = new Client(20);
		Client client_2 = new Client(20);
		Client client_3 = client_1;

//		using == operator compares the refrence not the object
		System.out.println(client_1 == client_2);

		System.out.println(client_1 == client_3);

//		using equals method compares the refrence not the object if we do not overide it same as that of == operator

		System.out.println(client_1.equals(client_2));

		System.out.println(client_1.equals(client_3));
	}
}
