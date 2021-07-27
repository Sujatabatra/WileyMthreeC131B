package com.sujata.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySecondJDBCClass {

	public static void main(String args[]) {
		Connection connection=null;
		Scanner sc=new Scanner(System.in);
		try {
		
		//1. Connect
		//1.1 Reg=null;ister Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//1.2 Connect to Database
		connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");
		
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
		//2. Query
		Statement statement=connection.createStatement();
		String query="INSERT INTO EMP(ID,NAME,DESIGNATION,DEPARTMENT,SALARY) VALUES("+id+",'"+name+"','"+desig+"','"+deptt+"',"+sal+")";
		int rows=statement.executeUpdate(query);
		
		//3.Process the result
		if(rows>0)
			System.out.println("Employee Inserted");
		else
			System.out.println("Employee Insertion Failed");
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
