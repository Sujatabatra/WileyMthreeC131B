package com.sujata.bean;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//POJO :Plain Old Java Object / JavaBean
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Employee {

	private int empId;
	private String empName;
	private String designation;
	private String department;
	private int empSalary;
		
	
}
