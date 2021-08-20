package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.Employee.Employee;

@Service
public class EmployeeConsumerService {

	@Autowired
	private RestTemplate restTemplate;
	
	public Employee getEmpById(int id) {
		Employee emp=restTemplate.getForObject("http://localhost:8082/employees/"+id, Employee.class);
		return emp;
	}
}
