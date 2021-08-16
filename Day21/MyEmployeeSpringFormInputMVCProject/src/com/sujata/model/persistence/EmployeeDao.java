package com.sujata.model.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import com.sujata.bean.Employee;



public interface EmployeeDao {

	Collection<Employee> getAllRecords();
	boolean insertRecord(Employee employee);
	Employee getRecordById(int id);
	boolean deleteRecordById(int id);
	boolean updateSalaryById(int id,int salary);
}
