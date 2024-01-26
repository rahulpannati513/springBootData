package com.rahul.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.rahul.Bo.VaccineDetails;

public interface IVaccineManagementInterface {
	public List<VaccineDetails> fetchVaccineByCompanyName(String company);
	public List<VaccineDetails> fetchVaccineByCompanies(String comp1,String comp2);
	public List<String> fetchVaccineByPriceRange(Long min,Long max);
	//difficult ot implement it throws obj refernce //public List<Object[]> fetchVaccineByPriceRange(Long min,Long max);
	public List<Object[]> fetchVaccineDetailsByVaccineName(String vac1,String vac2);
	

	//update
	public int changePriceByVaccine(Long newPrice,String vaccineName);
	
	
	//delete
	
	public int changePriceByVaccineByPriceRange(Integer min,Integer max);
	
	//insert using native query
	
	public int insertVaccineDetails(String vaccineName,String vaccineCompany,Long price);
	
	//get The time 
	public Date getTheSystemDateAndTime();
	
}