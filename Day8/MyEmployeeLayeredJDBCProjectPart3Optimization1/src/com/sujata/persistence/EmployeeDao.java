package com.sujata.persistence;

import java.sql.SQLException;
import java.util.Collection;

import com.sujata.bean.Employee;



public interface EmployeeDao {

	Collection<Employee> getAllRecords()throws ClassNotFoundException,SQLException;
	boolean insertRecord(Employee employee)throws ClassNotFoundException,SQLException;
	Employee getRecordById(int id)throws ClassNotFoundException,SQLException;
}
