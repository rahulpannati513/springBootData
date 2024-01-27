package com.rahul;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.Bo.CustomerDetails;
import com.rahul.Service.CustomerServiceIMPL;


@SpringBootApplication
public class CustomerManagementApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(CustomerManagementApplication.class, args);
		//we are creating the getBean to inject the service class 
		
		CustomerServiceIMPL service = context.getBean(CustomerServiceIMPL.class);
		
//        CustomerDetails customer = new CustomerDetails("virat","Bengaluru",LocalDateTime.of(1987,11, 3, 7, 18),
//				LocalTime.of(21, 32),LocalDate.of(2024, 01, 27));
//        String status = service.registerCustomer(customer);
//
//        System.out.println(status);
        
		//printing all the data from the database
		
		service.getAllCustomer().forEach((v)->System.out.println(v));
		
		
		
		
		context.close();
	} 
}
