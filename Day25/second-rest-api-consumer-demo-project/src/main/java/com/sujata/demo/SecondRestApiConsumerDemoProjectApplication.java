package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sujata.Employee.Employee;
import com.sujata.service.EmployeeConsumerService;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class SecondRestApiConsumerDemoProjectApplication implements CommandLineRunner{

	@Autowired
	private EmployeeConsumerService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(SecondRestApiConsumerDemoProjectApplication.class, args);
	}

	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id : ");
		int id=sc.nextInt();
		
		Employee emp=empService.getEmpById(id);
		System.out.println(emp);
		
	}
}
