package com.rahul.Dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IStudent extends CrudRepository<StudentTable, Serializable> {
	//all the method in the crud will be implemented here interface methods are abtract method
	//spring will give the implementations...
	

}
