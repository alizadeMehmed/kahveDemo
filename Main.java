package kahveDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerCheckService checkservice= new CustomerCheckManager();
		BaseCustomerManager customerManager= new StarbucksCustomerManager(checkservice);
		customerManager.save(new Customer(1, "Engin", "Demiroð", "12345678910"));
		

	}

}
