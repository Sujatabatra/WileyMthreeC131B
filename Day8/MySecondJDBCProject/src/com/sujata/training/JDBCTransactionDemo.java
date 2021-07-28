package com.sujata.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTransactionDemo {

	public static void main(String[] args) {
		Connection connection=null;
		Scanner sc=new Scanner(System.in);
		try {
		
		//1. Connect
		//1.1 Reg=null;ister Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//1.2 Connect to Database
		connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");
		
		connection.setAutoCommit(false);
		
		
		//2. Query
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMP(ID,NAME,DESIGNATION,DEPARTMENT,SALARY) VALUES(?,?,?,?,?)");
		
		System.out.println("Enter Employee id : ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name : ");
		String name=sc.next();
		System.out.println("Enter Employee Designation : ");
		String desig=sc.next();
		System.out.println("Enter Employee Department : ");
		String deptt=sc.next();
		System.out.println("Enter Employee Salary : ");
		int sal=sc.nextInt();
		
		
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, desig);
		preparedStatement.setString(4, deptt);
		preparedStatement.setInt(5, sal);
		

		
		int rows=preparedStatement.executeUpdate();
		connection.commit();
		//3.Process the result
		if(rows>0)
			System.out.println("Employee Inserted");
		else
			System.out.println("Employee Insertion Failed");
		}
		catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
