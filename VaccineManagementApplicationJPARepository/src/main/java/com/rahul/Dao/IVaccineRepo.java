package com.rahul.Dao;

import org.springframework.data.repository.CrudRepository;

import com.rahul.Bo.VaccineDetails;

public interface IVaccineRepo extends CrudRepository<VaccineDetails, Long> {

}
