package com.rahul.Service;

import java.util.List;

import com.rahul.Bo.CustomerDetails;

public interface ICustomerService {
	
	public String registerCustomer(CustomerDetails customer);
	public List<CustomerDetails> getAllCustomer();
	
}
