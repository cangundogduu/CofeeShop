package Adapter;

import java.rmi.RemoteException;

import Abstrack.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdaptor implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
			KPSPublicSoap mernisCheck = new KPSPublicSoapProxy();

			try {
						boolean result=mernisCheck.TCKimlikNoDogrula
								(Long.parseLong(customer.getNationalityId()), 
								customer.getFirstName().toUpperCase(), 
								customer.getLastName().toUpperCase(), 
								customer.getDateOfBirth());
								return result;
			} catch (NumberFormatException e) {
				
				e.printStackTrace();
			} catch (RemoteException e) {
				
				e.printStackTrace();
			}
			return false;
		}
		
		
		
	}

