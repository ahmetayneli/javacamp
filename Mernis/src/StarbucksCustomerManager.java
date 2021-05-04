
public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customercheckservice;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customercheckservice = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if (customercheckservice.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println(" Not a valid person.");
		}
		
  
	}

}
