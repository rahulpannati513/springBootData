package com.rahul.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.Bo.CustomerDetails;
import com.rahul.Dao.ICustomerDao;

@Service
public class CustomerServiceIMPL implements ICustomerService {
	
	@Autowired
	ICustomerDao repo;
	
	

	@Override
	public String registerCustomer(CustomerDetails customer) {
		CustomerDetails id = repo.save(customer);
		return "customer details have been succesfully saved : "+id;
	}

	@Override
	public List<CustomerDetails> getAllCustomer() {
		List<CustomerDetails> list = (List<CustomerDetails>) repo.findAll();
		return list;
	}

	

}
