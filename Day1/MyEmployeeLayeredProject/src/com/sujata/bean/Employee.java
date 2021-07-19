package com.sujata.bean;

//POJO :Plain Old Java Object / JavaBean
public class Employee {

	private int empId;
	private String empName;
	private String designation;
	private String department;
	private int empSalary;
	
	public Employee() {
		
	}

	
	public Employee(int empId, String empName, String designation, String department, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.department = department;
		this.empSalary = empSalary;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", department="
				+ department + ", empSalary=" + empSalary + "]";
	}
	
	
}
