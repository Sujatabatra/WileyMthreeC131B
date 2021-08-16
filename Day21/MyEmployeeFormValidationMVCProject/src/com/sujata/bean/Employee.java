package com.sujata.bean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

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
	@Size(min = 4,max = 10,message = "Length must be between 4 and 10 characters")
	private String empName;
	private String designation;
	private String department;
	private int empSalary;
		
	
}
