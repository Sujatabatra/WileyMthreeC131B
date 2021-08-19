package com.sujata.presentation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;
import com.sujata.helper.EmployeeInputOutput;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@Component
public class EmployeePresentationImpl implements EmployeePresentation {
	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public void showMenu() {
		System.out.println("1. List All Employees");
		System.out.println("2. Insert Employee ");
		System.out.println("3. Generate Payslip");
		System.out.println("4. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			Collection<Employee> employees=null;
			try {
				employees = employeeService.getAllEmployees();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			for(Employee emp:employees) {
			
				EmployeeInputOutput.displayEmployee(emp);
				System.out.println();
			}
			break;
		case 2:
			
			Employee employee=EmployeeInputOutput.getEmployeeData();
			
			try {
				if(employeeService.insertEmployee(employee))
					System.out.println("Employee Added Successfully!");
				else
					System.out.println("Employee Addition Failed!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Enter Employee ID : ");
			int eId=scanner.nextInt();
			EmployeePaySlip empPaySlip=null;
			try {
				empPaySlip = employeeService.getPaySlip(eId);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			if(empPaySlip!=null) {
				EmployeeInputOutput.displayEmployee(empPaySlip.getEmployee());
				System.out.println(empPaySlip.getHr()+"     "+empPaySlip.getDa()+"     "+empPaySlip.getPf()+"     "+empPaySlip.getTotalSalary());
			}

			else
				System.out.println("Employee with id "+eId+" does not exist");
			break;
		case 4:
			System.out.println("Thanks for using employee management system!");
			System.exit(0);
		}

	}

}
