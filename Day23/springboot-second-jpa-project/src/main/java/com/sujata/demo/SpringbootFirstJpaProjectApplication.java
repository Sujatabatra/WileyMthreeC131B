package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
@EntityScan(basePackages = "com.sujata.bean")
public class SpringbootFirstJpaProjectApplication implements CommandLineRunner {

	@Autowired
	EmployeeService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1=new Employee("Ashish", "Associate", "IT", 45000);
		Employee e2=new Employee("Bharti", "Manager", "Sales", 135000);
		
		empService.insertEmployee(e1);
		empService.insertEmployee(e2);
		
	}

}
