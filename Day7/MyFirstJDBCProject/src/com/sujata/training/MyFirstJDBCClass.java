package com.sujata.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBCClass {

	public static void main(String[] args) {
		Connection connection=null;
		try {
		
		//1. Connect
		//1.1 Reg=null;ister Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//1.2 Connect to Database
		connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");
		
		//2. Query
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("SELECT * FROM EMP");
		
		//3.Process the result
		while(resultSet.next()) {
			int id=resultSet.getInt("ID");
			String na=resultSet.getString("NAME");
			String des=resultSet.getString("DESIGNATION");
			String deptt=resultSet.getString("DEPARTMENT");
			int sal=resultSet.getInt("SALARY");
			System.out.println(id+" "+na+" "+des+" "+deptt+" "+sal);
		}
		}
		catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				//4. close the connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
