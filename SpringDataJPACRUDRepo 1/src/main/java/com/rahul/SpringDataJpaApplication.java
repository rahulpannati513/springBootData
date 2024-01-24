package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahul.Dao.IStudent;
import com.rahul.Dao.StudentTable;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		IStudent dao = context.getBean(IStudent.class);//it is an interface
		//using interface reference we can the call the implementation methods
		//yes we can do ....
		//we are asking the spring to give the implementation...
        StudentTable st = new StudentTable();
        st.setSid(6);
        st.setSname("Rahul");
        st.setScity("GodavariKhani");
		dao.save(st);
		
		//ddddddIterable<StudentTable> iterable = dao.findAllById(null);
		
		context.close();
	}

}
