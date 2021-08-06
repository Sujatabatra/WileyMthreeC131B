package com.sujata.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;

public interface EmployeeService {

	Collection<Employee> getAllEmployees();
	boolean insertEmployee(Employee employee);
	EmployeePaySlip getPaySlip(int id);
}
