package com.sujata.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;
import com.sujata.helper.EmployeeRowMapper;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Collection<Employee> getAllRecords() {
		List employees=jdbcTemplate.query("SELECT * FROM EMP", new EmployeeRowMapper());
		return employees;	
	}

	@Override
	public boolean insertRecord(Employee employee){		
		int rows=jdbcTemplate.update("INSERT INTO EMP(ID,NAME,DESIGNATION,DEPARTMENT,SALARY) VALUES(?,?,?,?,?)", employee.getEmpId(),employee.getEmpName(),employee.getDesignation(),employee.getDepartment(),employee.getEmpSalary());
		if (rows > 0)
			return true;
		return false;
	}

	@Override
	public Employee getRecordById(int id){
		Employee employee=jdbcTemplate.queryForObject("SELECT * from EMP where ID=?",new Object[] {id}, new EmployeeRowMapper());
		return employee;
	}

}
