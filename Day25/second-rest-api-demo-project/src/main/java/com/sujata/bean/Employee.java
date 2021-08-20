package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="EmpJPA")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Employee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column(name="name")
	private String empName;
	private String designation;
	private String department;
	@Column(name="Salary")
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
	
	

	public Employee(String empName, String designation, String department, int empSalary) {
		super();
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
