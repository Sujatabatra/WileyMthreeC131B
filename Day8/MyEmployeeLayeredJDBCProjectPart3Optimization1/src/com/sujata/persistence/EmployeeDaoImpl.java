package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.sujata.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Collection<Employee> getAllRecords() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Collection<Employee> employees = new ArrayList<Employee>();
		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");

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
	public boolean insertRecord(Employee employee) throws ClassNotFoundException, SQLException {
		Connection connection = null;

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");

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
	public Employee getRecordById(int id) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Employee employee = null;
		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");

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
