package com.rahul.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.rahul.Bo.VaccineDetails;
import com.rahul.Dao.IVaccineRepo;

@Service
public class VaccineManagementImpl implements IVaccineManagementInterface {

	@Autowired
	private IVaccineRepo repo;



	@Override
	public List<VaccineDetails> searchVaccineByGivenData(VaccineDetails vaccine, boolean status, String... args) {
		Example<VaccineDetails> example = Example.of(vaccine);
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, args);
		
		return repo.findAll(example, sort);
	
	}



	@Override
	public List<VaccineDetails> searchVaccineByGivenObject(VaccineDetails vaccine) {
		
		Example<VaccineDetails> example = Example.of(vaccine);
		return repo.findAll(example);
	
	}



	@Override
	public VaccineDetails searchVaccineById(Long i) {
	
		return 	repo.getById(i);
	
	}



	@Override
	public String removeVaccineByIds(Iterable<Long> ids) {
		List<VaccineDetails> list = repo.findAllById(ids);
		if(list.size()!=0) {
			repo.deleteAllByIdInBatch(ids);
			return "Records are deleted!!!";
		}
		
	
		return "Records are not Deleted...";
	}
	
	
	
}





