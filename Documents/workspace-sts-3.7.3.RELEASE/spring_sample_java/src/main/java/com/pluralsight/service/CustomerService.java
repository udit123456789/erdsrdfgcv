package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public interface CustomerService {

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	List<Customer> findAll();

	/*//@Autowired
	void setCustomerRepository(CustomerRepository customerRepository);*/

}