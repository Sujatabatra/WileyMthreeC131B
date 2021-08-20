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
public class SecondRestApiDemoProjectApplication/* implements CommandLineRunner*/{
/*
	@Autowired
	private EmployeeService empService;
	*/
	public static void main(String[] args) {
		SpringApplication.run(SecondRestApiDemoProjectApplication.class, args);
	}
/*
	@Override
	public void run(String... args) throws Exception {
		empService.insertEmployee(new Employee("Charu", "Manager", "Purchase", 85000));
		empService.insertEmployee(new Employee("Deepak", "Sr. Associate", "IT", 95000));
		empService.insertEmployee(new Employee("Esha", "Executive", "Sales", 25000));
		empService.insertEmployee(new Employee("Faraz", "Sr. Manager", "IT", 175000));
	}
*/
}
