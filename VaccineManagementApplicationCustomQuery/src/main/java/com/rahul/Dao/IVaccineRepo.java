package com.rahul.Dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.rahul.Bo.VaccineDetails;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long> 
{
	@Query("FROM VaccineDetails WHERE vaccineCompany=:company")
	public List<VaccineDetails> searchVaccineByCompanyName(String company);
	 
//	@Query("FROM vaccineDetails WHERE vaccineCompany=:company")
//	public List<VaccineDetails> searchVaccineByCompanyName(@Param("company")String vc);
	 
	@Query("FROM VaccineDetails WHERE vaccineCompany IN(:comp1,:comp2)")
	public List<VaccineDetails> searchVaccineByCompanies(String comp1,String comp2);
	
	//for retriving the specific columns to need specific we use select before  from
	@Query("SELECT vaccineName,vaccineCompany FROM VaccineDetails WHERE price BETWEEN :min AND :max")
	public List<String> searchVaccineByPriceRange(Long min,Long max);
	
	//@Query("SELECT vaccineName, vaccineCompany FROM VaccineDetails WHERE price BETWEEN :min AND :max")
	//List<Object[]> searchVaccineByPriceRange(@Param("min") Long min, @Param("max") Long max);

	
	@Query("SELECT vaccineCompany,price FROM VaccineDetails WHERE vaccineName IN(:vac1,:vac2)")
	public List<Object[]> searchVaccineDetailsByVaccineName(String vac1,String vac2);
	//here why we create object is object is parent class of every sublcass and it should be as array as the parametes can be many

//	public List<VaccineDetails> searchVaccineByPriceRange(Long min, Long max);
	
	
	
	//update 
	
	
	@Modifying
	@Transactional
	@Query("UPDATE VaccineDetails SET price=:newPrice WHERE vaccineName=:vaccineName")
	public int updatePriceByVaccine(Long newPrice,String vaccineName);
	
	//delete
	
	@Modifying
	@Transactional
	@Query("DELETE FROM VaccineDetails  WHERE price BETWEEN :min AND :max")
	public int deletePriceByVaccineByPriceRange(Integer min,Integer max);
	
	//insert using native query
	//while working with native sql then 
	
	
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO vaccine_information (`vaccinecompany`,`vaccinename`,`price`) Values(?,?,?)", nativeQuery=true)
	public int insertVaccineDetails(String vaccineName,String vaccineCompany,Long price);
	
	@Query(value="SELECT NOW() FROM DUAL", nativeQuery=true)
	public Date getTheSystemDateAndTime();
	
	
}