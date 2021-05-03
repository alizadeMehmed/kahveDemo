package kahveDemo;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkifRealPerson(Customer customer) {
		
		return true;
	}
	
}
