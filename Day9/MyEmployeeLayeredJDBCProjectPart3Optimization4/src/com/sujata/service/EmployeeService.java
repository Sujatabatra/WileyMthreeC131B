package com.sujata.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;

public interface EmployeeService {

	Collection<Employee> getAllEmployees()throws ClassNotFoundException,SQLException, IOException;
	boolean insertEmployee(Employee employee)throws ClassNotFoundException,SQLException, IOException;
	EmployeePaySlip getPaySlip(int id)throws ClassNotFoundException,SQLException, IOException;
}
