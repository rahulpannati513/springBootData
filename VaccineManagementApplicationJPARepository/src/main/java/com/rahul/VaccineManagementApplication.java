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
//		VaccineDetails vaccine = new VaccineDetails("Covaxine","Bharath Bio Tech");
//		
//		String message=service.registerVaccineDetails(vaccine);
//		System.out.println(message);
		
		//as we are saving all the records 
//		List<VaccineDetails> vaccineList = new ArrayList<>();
//		vaccineList.add(new VaccineDetails("CovidShield","Astrazenica"));
//		vaccineList.add(new VaccineDetails("Phizer","Moderna"));
//		vaccineList.add(new VaccineDetails("Sputnik","RussianBasedComp"));
//		
//		service.registerMultipleVaccineDetails(vaccineList);

//		Long count = service.getVaccinesCount();
//		System.out.println("Number of Vaccines in DB table : "+count);
//		
		
		
//		Long id = (long) 2;
//		Boolean status = service.CheckAvaiability(id);
//		if(status)
//			System.out.println("Vaccine availble with id: "+id );
//		else
//			System.out.println("Vaccine is not available with id : "+id);
		
		//Iterable<VaccineDetails> vaccineInfo = service.getAllVaccines();
//		List<VaccineDetails> vaccineInfo = (List<VaccineDetails>) service.getAllVaccines();
//		service.getAllVaccines().forEach((vaccines)->System.out.println(vaccines));


//		List<Long> vaccineIds  = new ArrayList<>();
//		vaccineIds.add(1L);
//		vaccineIds.add(2L);
//		service.getAllVaccinesByIds(vaccineIds).forEach((v)->System.out.println(v));
		
		 Long id = 1L;
		// Optional<VaccineDetails> optional = service.getVaccineById(id);
//		 if(optional.isPresent())
//			 System.out.println(optional.get());
//		 optional.orElse(new VaccineDetails());
//			 
			 
	//	 System.out.println(service.getVaccineById(id).orElse(new VaccineDetails()));
		 
	//	 System.out.println(service.removeVaccineById(id));
		 
		 
//		 List<Long> idList = new ArrayList<>();
//	     idList.add(2L);
//		 idList.add(3L);
//		 
//		 
//		 
//		 System.out.println(service.removeVaccineByIds(idList));  //Either all or nothing
//		 
		 
		 System.out.println(service.removeVaccineByObject(new VaccineDetails(4,"Astrazenica","CovidShield")));
		 
		 
		context.close();
	} 
}
