package com.rahul.Service;

import java.util.List;
import java.util.Optional;

import com.rahul.Bo.VaccineDetails;

public interface IVaccineManagementInterface 
{
	public List<VaccineDetails> searchVaccineByGivenData(VaccineDetails vaccine,boolean status,String...args);
	public List<VaccineDetails> searchVaccineByGivenObject(VaccineDetails vaccine);
	public VaccineDetails searchVaccineById(Long id);
	public  String removeVaccineByIds(Iterable<Long> ids);
 

}
