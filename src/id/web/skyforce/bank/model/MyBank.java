package id.web.skyforce.bank.model;

public class MyBank {

	public static void main(String[] args) {
		Customer customer = new Customer("Bill", "Gates", 'M', 28 - 10 - 1955,
				"1234 5678");
		Account account1 = new Account("XYZ123", 40000000000, 'a');
		Account account2 = new Account("XYZ456", 20000000, 'i');
		Address address1=new Address("silicon valley No.13", "san Fransisco", "94027");

	}
}
