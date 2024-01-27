package com.rahul.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rahul.Bo.CustomerDetails;

@Repository
public interface ICustomerDao extends CrudRepository<CustomerDetails,Integer>
{//we have given integer to as cid is primary id its datatype is integer so written integer

	
	
}
