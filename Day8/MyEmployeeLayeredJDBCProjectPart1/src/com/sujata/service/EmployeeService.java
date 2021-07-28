package com.sujata.service;

import java.util.Collection;

import com.sujata.bean.Employee;

public interface EmployeeService {

	Collection<Employee> getAllEmployees();
	boolean insertEmployee(Employee employee);
}
