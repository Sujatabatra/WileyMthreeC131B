package com.sujata.training;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee extends Person {

	private String department;
	private String designation;
	private int salary;
	
	public Employee() {
		
	}

	

	public Employee(int id, String name, String department, String designation, int salary) {
		super(id, name);
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}



	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	private void writeObject(ObjectOutputStream ous) throws NotSerializableException{
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream ois) throws NotSerializableException{
		throw new NotSerializableException();
	}
	
}
