package com.rahul.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.Bo.VaccineDetails;
import com.rahul.Dao.IVaccineRepo;

@Service
public class VaccineManagementImpl implements IVaccineManagementInterface {

	@Autowired
	private IVaccineRepo repo;
	
	@Override
	public String registerVaccineDetails(VaccineDetails vaccine) {
		
		
		System.out.println("Implementing class of IVaccineRepo is :"+repo.getClass().getName());
		
	VaccineDetails v = repo.save(vaccine);
		
		
		return "Vaccine Details Registered"+v.getId();
	}

	@Override
	public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails> vaccineList) {
		return repo.saveAll(vaccineList);
	
	}

	@Override
	public Long getVaccinesCount() {
		
		return repo.count();
	}

	@Override
	public Boolean CheckAvaiability(Long id) {
		
		return repo.existsById(id);
	}

	@Override
	public Iterable<VaccineDetails> getAllVaccines() {
		
		return repo.findAll();
	}

	@Override
	public Iterable<VaccineDetails> getAllVaccinesByIds(Iterable<Long> idList) {
		
	
		return repo.findAllById(idList);
	}


	@Override
	public Optional<VaccineDetails> getVaccineById(Long id) {
	
		return repo.findById(id);
	}

	@Override
	public String removeVaccineById(Long id) {
		Optional<VaccineDetails> message =repo.findById(id);
		if(message.isPresent()) {
			repo.deleteById(id);
			return "Record Deleted";
		}
		return "There is no record with ID : "+id;
	}

	@Override
	public String removeVaccineByIds(List<Long> ids) {
		Iterable<VaccineDetails> list = repo.findAllById(ids);
		int count = ids.size();
		if(count == ((List)list).size())
		{
			repo.deleteAllById(ids);
			return count+"NUM OF ROWS DELETED ";
		}
		return "Deletion is not performed!...";
	}

	@Override
	public String removeVaccineByObject(VaccineDetails vaccine) {
		Optional<VaccineDetails> vaccineinfo = repo.findById(vaccine.getId());
		if(vaccineinfo.isPresent()) {
			repo.delete(vaccine);
			return "Given vaccine obj record deleted";
		}
		return "Record Not found to delete ";
	
	
	}



//	@Override
//	public Long getVaccinesCount() {
//		repo.findAllById();
//		return null;
//	}

}
