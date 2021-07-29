package com.sujata.helper;

import java.util.Scanner;

import com.sujata.bean.Employee;

public class EmployeeInputOutput {
	
	public static Employee getEmployeeData() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int id=scanner.nextInt();
		System.out.println("Enter Employee Name : ");
		String na=scanner.next();
		System.out.println("Enter Designation : ");
		String des=scanner.next();
		System.out.println("Enter Department : ");
		String deptt=scanner.next();
		System.out.println("Enter Salary : ");
		int sal=scanner.nextInt();
		Employee employee=new Employee(id, na, des, deptt, sal);
		return employee;
	}
	
	public static void displayEmployee(Employee employee) {
		System.out.print(employee.getEmpId()+"     "+employee.getEmpName()+"     "+employee.getDesignation()+"     "+employee.getDepartment()+"     "+employee.getEmpSalary()+"     ");
	}

}
