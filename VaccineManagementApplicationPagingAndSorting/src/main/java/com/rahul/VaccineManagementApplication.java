package com.rahul;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.Bo.VaccineDetails;
import com.rahul.Service.VaccineManagementImpl;

@SpringBootApplication
public class VaccineManagementApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(VaccineManagementApplication.class, args);
		//we are creating the getBean to inject the service class 
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
		
		VaccineDetails vaccine = new VaccineDetails("Sputnik", "RussianBasedComp");

//		service.searchVaccineByGivenData(vaccine, true, "vaccineName","vaccineCompany").
//		forEach((a)->System.out.println(a.getVaccineName()+ " =>"+a.getVaccineCompany()));
		 
		//service.searchVaccineByGivenObject(vaccine).forEach((v)->System.out.println(v));
		
		//System.out.println(service.searchVaccineById(6L));
		
		
		List<Long> ids = new ArrayList<>();
		ids.add(13L);
		ids.add(3L);
		System.out.println(service.removeVaccineByIds(ids));
		
		
		context.close();
	} 
}
