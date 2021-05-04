package Concrete;


import Abstrack.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
		
	}

	

}
