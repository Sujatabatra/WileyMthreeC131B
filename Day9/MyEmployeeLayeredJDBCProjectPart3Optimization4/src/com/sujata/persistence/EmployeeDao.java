package com.sujata.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import com.sujata.bean.Employee;



public interface EmployeeDao {

	Collection<Employee> getAllRecords()throws ClassNotFoundException,SQLException, IOException, IOException;
	boolean insertRecord(Employee employee)throws ClassNotFoundException,SQLException, IOException, IOException;
	Employee getRecordById(int id)throws ClassNotFoundException,SQLException, IOException, IOException;
}
