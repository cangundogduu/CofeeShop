import Abstrack.BaseCustomerManager;
import Adapter.MernisAdaptor;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new NeroCustomerManager();
		customerManager.save(new Customer(1, "Can", "Gundogdu", 1990, "12345678910"));
		
		BaseCustomerManager customerManager2=new StarbucksCustomerManager(new MernisAdaptor());
		customerManager2.save(new Customer(2, "Fatma", "Gundogdu", 1992, "12345678920"));
			
		 
		 
		 }
		 
		 
	}

