package com.rahul.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.Bo.VaccineDetails;
import com.rahul.Dao.IVaccineRepo;

@Service
public  class VaccineManagementImpl implements IVaccineManagementInterface {

	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<VaccineDetails> fetchVaccineByCompanyName(String company) {
		return repo.searchVaccineByCompanyName(company);	
	}

	@Override
	public List<VaccineDetails> fetchVaccineByCompanies(String comp1, String comp2) {
return repo.searchVaccineByCompanies(comp1, comp2);
		
		
	}



	@Override
	public List<String> fetchVaccineByPriceRange(Long min, Long max) {
		
		return repo.searchVaccineByPriceRange(min, max);
	}

	@Override
	public List<Object[]> fetchVaccineDetailsByVaccineName(String vac1, String vac2) {
		return repo.searchVaccineDetailsByVaccineName("vac1","vac2");
	}

	
	//update
	
	@Override
	public int changePriceByVaccine(Long newPrice, String vaccineName) {
		
		return repo.updatePriceByVaccine(newPrice, vaccineName);
	}

	//Delete
	
	@Override
	public int changePriceByVaccineByPriceRange(Integer min, Integer max) {
		
		return repo.deletePriceByVaccineByPriceRange(min, max);
	}

	//insert using native query
	
	@Override
	public int insertVaccineDetails(String vaccineName, String vaccineCompany, Long price) {
		
		return repo.insertVaccineDetails(vaccineName, vaccineCompany, price);
	}
	
	//getting time and date using native query

	@Override
	public Date getTheSystemDateAndTime() {
		
		return repo.getTheSystemDateAndTime();
	}

	
	
	
	
}
