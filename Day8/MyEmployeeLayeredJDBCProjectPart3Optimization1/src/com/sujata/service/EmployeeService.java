package com.sujata.service;

import java.sql.SQLException;
import java.util.Collection;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;

public interface EmployeeService {

	Collection<Employee> getAllEmployees()throws ClassNotFoundException,SQLException;
	boolean insertEmployee(Employee employee)throws ClassNotFoundException,SQLException;
	EmployeePaySlip getPaySlip(int id)throws ClassNotFoundException,SQLException;
}
