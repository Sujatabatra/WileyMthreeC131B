package com.sujata.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public Collection<Employee> getAllRecords() throws SQLException{
//		Connection connection = MySqlConnection.getConnection();
		Connection connection =dataSource.getConnection();
		
		Collection<Employee> employees = new ArrayList<Employee>();
		

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMP");

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			Employee employee = new Employee();
			employee.setEmpId(resultSet.getInt("ID"));
			employee.setEmpName(resultSet.getString("NAME"));
			employee.setDesignation(resultSet.getString("DESIGNATION"));
			employee.setDepartment(resultSet.getString("DEPARTMENT"));
			employee.setEmpSalary(resultSet.getInt("SALARY"));

			employees.add(employee);
		}

		connection.close();
		return employees;
	}

	@Override
	public boolean insertRecord(Employee employee) throws SQLException{
//		Connection connection = MySqlConnection.getConnection();;

		Connection connection=dataSource.getConnection();
		
		PreparedStatement preparedStatement = connection
				.prepareStatement("INSERT INTO EMP(ID,NAME,DESIGNATION,DEPARTMENT,SALARY) VALUES(?,?,?,?,?)");

		preparedStatement.setInt(1, employee.getEmpId());
		preparedStatement.setString(2, employee.getEmpName());
		preparedStatement.setString(3, employee.getDesignation());
		preparedStatement.setString(4, employee.getDepartment());
		preparedStatement.setInt(5, employee.getEmpSalary());

		int rows = preparedStatement.executeUpdate();

		if (rows > 0)
			return true;

		return false;
	}

	@Override
	public Employee getRecordById(int id) throws SQLException{
//		Connection connection = MySqlConnection.getConnection();

		Connection connection =dataSource.getConnection();
		
		Employee employee = null;
		
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EMP where ID=?");
		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			employee = new Employee();
			employee.setEmpId(resultSet.getInt("ID"));
			employee.setEmpName(resultSet.getString("NAME"));
			employee.setDesignation(resultSet.getString("DESIGNATION"));
			employee.setDepartment(resultSet.getString("DEPARTMENT"));
			employee.setEmpSalary(resultSet.getInt("SALARY"));

		}

		return employee;
	}

}
