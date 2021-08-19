package com.sujata.bean;

public class EmployeePaySlip {

	private Employee employee;
	private double hr;
	private double da;
	private double pf;
	private double totalSalary;
	
	public EmployeePaySlip() {
		
	}

	public EmployeePaySlip(Employee employee, double hr, double da, double pf, double totalSalary) {
		super();
		this.employee = employee;
		this.hr = hr;
		this.da = da;
		this.pf = pf;
		this.totalSalary = totalSalary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getHr() {
		return hr;
	}

	public void setHr(double hr) {
		this.hr = hr;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	@Override
	public String toString() {
		return "EmployeePaySlip [employee=" + employee + ", hr=" + hr + ", da=" + da + ", pf=" + pf + ", totalSalary="
				+ totalSalary + "]";
	}
	
		
	
}
