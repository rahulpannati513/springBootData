package com.rahul.Service;

import java.util.List;
import java.util.Optional;

import com.rahul.Bo.VaccineDetails;

public interface IVaccineManagementInterface {
    public String registerVaccineDetails(VaccineDetails vaccine);
    public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails> vaccine);
    public Long getVaccinesCount();
    public Boolean CheckAvaiability(Long id);
    public Iterable<VaccineDetails> getAllVaccines();
    public Iterable<VaccineDetails> getAllVaccinesByIds(Iterable<Long> idList);
    public Optional<VaccineDetails> getVaccineById(Long id);
    public String removeVaccineById(Long id);
    public String removeVaccineByIds(List<Long> id);
    public String removeVaccineByObject(VaccineDetails vaccine);
    

}
