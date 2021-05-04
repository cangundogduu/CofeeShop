package Concrete;

import Abstrack.BaseCustomerManager;
import Abstrack.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends  BaseCustomerManager {

	private CustomerCheckService _customerCheckService; 
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		_customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
	if (_customerCheckService.checkIfRealPerson(customer)) {
		super.save(customer);
	}
	else {
		System.out.println("Not a valid person");
	}
	
		
	}

	



}
