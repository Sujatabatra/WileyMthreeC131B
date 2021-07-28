package com.sujata.service;

import java.util.Collection;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao empDao=new EmployeeDaoImpl();
	
	@Override
	public Collection<Employee> getAllEmployees() {
		
		return empDao.getAllRecords();
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		
		return empDao.insertRecord(employee);
	}

}
