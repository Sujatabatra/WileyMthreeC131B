package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class EmployeePaySlip {

	private Employee employee;
	private double hr;
	private double da;
	private double pf;
	private double totalSalary;
		
	
}
