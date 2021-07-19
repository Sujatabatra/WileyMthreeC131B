package com.sujata.persistence;

import java.util.Collection;

import com.sujata.bean.Employee;
import com.sujata.db.EmployeeDb;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Collection<Employee> getAllRecords() {
		return EmployeeDb.getEmployees().values();
	}

	@Override
	public boolean insertRecord(Employee employee) {
		EmployeeDb.getEmployees().put(employee.getEmpId(), employee);
		return true;
	}

}
