package com.sujata.persistence;

import java.util.Collection;

import com.sujata.bean.Employee;



public interface EmployeeDao {

	Collection<Employee> getAllRecords();
	boolean insertRecord(Employee employee);
}
