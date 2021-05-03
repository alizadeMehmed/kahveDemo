package kahveDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {

		if (checkService.checkifRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Geçerli bir kiþi deðildir");
		}

	}
}
