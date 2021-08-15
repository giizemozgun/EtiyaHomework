package homework3;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerService{
	
	CustomerCheckService _customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void Save(Customer customer){
		
		if(_customerCheckService.checkIfRealPerson(customer)) {
			this.Save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
		
		
	}

}
