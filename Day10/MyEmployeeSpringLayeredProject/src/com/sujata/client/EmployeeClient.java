package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String[] args) {
//		EmployeePresentation empPresentation=new EmployeePresentationImpl();
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("employee.xml");
		
		EmployeePresentation empPresentation=(EmployeePresentation)springContainer.getBean("empPresentation");
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			empPresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			empPresentation.performMenu(choice);
			
		}

	}

}
