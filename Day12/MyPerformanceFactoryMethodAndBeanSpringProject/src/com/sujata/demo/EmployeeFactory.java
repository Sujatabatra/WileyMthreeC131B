package com.sujata.demo;

public class EmployeeFactory {

	public Employee getWagedEmployee() {
		return new WagedEmployee();
	}
	
	public Employee getSalariedEmployee() {
		return new SalariedEmployee();
	}
}
