package com.rahul.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.rahul.Bo.VaccineDetails;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long> {

}
