package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

/*@Scope("singleton")*/
/*@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
 * 
 * AOP jar is required for the scope annotation to work*/
/*scope can be specified using annotation for a particular bean*/
public class CustomerServiceImpl implements CustomerService {
	
	//Here the Autowired annotation can be used along with the setter injection as well as constructor injection
	@Autowired
	private CustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	public CustomerServiceImpl(){
		
	}

	//@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("constructor");
		this.customerRepository = customerRepository;
	}

	//@Autowired
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#setCustomerRepository(com.pluralsight.repository.CustomerRepository)
	 */
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("setter");
		this.customerRepository = customerRepository;
	}
	
}
