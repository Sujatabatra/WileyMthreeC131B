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
	public Collection<Employee> getAllRecords() {
		Connection connection = null;
		Collection<Employee> employees=new ArrayList<Employee>();
		try {

			// 1. Connect
			// 1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 1.2 Connect to Database
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");

			// 2. Query
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

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 4. close the connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return employees;
	}

	@Override
	public boolean insertRecord(Employee employee) {
		Connection connection = null;

		try {

			// 1. Connect
			// 1.1 Reg=null;ister Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 1.2 Connect to Database
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");

			// 2. Query
			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO EMP(ID,NAME,DESIGNATION,DEPARTMENT,SALARY) VALUES(?,?,?,?,?)");

			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3, employee.getDesignation());
			preparedStatement.setString(4, employee.getDepartment());
			preparedStatement.setInt(5, employee.getEmpSalary());

			int rows = preparedStatement.executeUpdate();

			// 3.Process the result
			if (rows > 0)
				return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 4. close the connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

}
