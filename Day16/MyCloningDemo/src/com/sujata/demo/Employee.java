package com.sujata.demo;


/*
 * private < default < protected <  public
 * 
 */
public class Employee implements Cloneable{

	private int id;
	private String name;
	private String deptt;
	private String desig;
	private int salary;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String deptt, String desig, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptt = deptt;
		this.desig = desig;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptt() {
		return deptt;
	}

	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee clone()throws CloneNotSupportedException{
		return (Employee)super.clone();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptt=" + deptt + ", desig=" + desig + ", salary=" + salary
				+ "]";
	}
	
	
}
