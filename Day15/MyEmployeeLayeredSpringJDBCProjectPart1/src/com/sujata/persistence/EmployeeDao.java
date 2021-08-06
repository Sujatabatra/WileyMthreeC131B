package com.sujata.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import com.sujata.bean.Employee;



public interface EmployeeDao {

	Collection<Employee> getAllRecords()throws SQLException;
	boolean insertRecord(Employee employee)throws SQLException;
	Employee getRecordById(int id)throws SQLException;
}
