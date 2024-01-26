package com.rahul;

import java.util.ArrayList;
import java.util.Date;
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
		
		//VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);

		//		service.fetchVaccineByCompanyName("Astrazenica").forEach((v)->System.out.println(v));
//	
//		System.out.println("**************************"); 
//		
//		service.fetchVaccineByCompanies("Moderna", "RussianBasedComp").forEach((v)->System.out.println(v));
//		
//		System.out.println("**************************"); 
//		
//		service.fetchVaccineByPriceRange(4500L, 8000L).forEach((v)->System.out.println(v));
//		
//		System.out.println("**************************"); 
//		//inmemory proxyclass will as far as we work with spring data jpa we willnot give implementation
//		//spirng data jpa means entire dao wil be taken care by data jpa
//		
//       List<Object[]> vaccineDetails = service.fetchVaccineDetailsByVaccineName("Covaxine", "Phizer");
//		//for object[] this kind of return type we must loop with 2d array or foreach method one forloop isdie
//       
//       for(Object[] obj:vaccineDetails) {
//    	   
//    	   for(Object vaccine:obj) {
//    		   System.out.print(vaccine);
//    	   }
//    	   System.out.println();
//       }
//       
       
		//update 

         //System.out.println(service.changePriceByVaccine(53534L, "Sputnik"));
		
		
		//delete
         
        // System.out.println("No of records deleted : "+service.changePriceByVaccineByPriceRange(30000, 60000));
		
		//insert usign native query
		
        // System.out.println("No of records inserted : "+service.insertVaccineDetails("Phizer", "Moderna",6765L));
         
		//getting date and time from the database using native sql query
		Date date = service.getTheSystemDateAndTime();
		System.out.println("Current data and time of System"+date);
		
		context.close();
	} 
}
