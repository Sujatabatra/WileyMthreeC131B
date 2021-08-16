package com.sujata.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.bean.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(resultSet.getInt("ID"));
		employee.setEmpName(resultSet.getString("NAME"));
		employee.setDesignation(resultSet.getString("DESIGNATION"));
		employee.setDepartment(resultSet.getString("DEPARTMENT"));
		employee.setEmpSalary(resultSet.getInt("SALARY"));
		return employee;
	}

}
