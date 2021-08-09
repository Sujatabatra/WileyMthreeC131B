package com.sujata.demo;

public class MainCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee(101, "AAAA", "IT", "Associate", 25000);

		emp.setName("Ashish");

		Employee emp1 = emp.clone();
		System.out.println("emp : " + emp);
		System.out.println("emp1 : " + emp1);

		System.out.println("Hash Code of emp " + emp.hashCode());
		System.out.println("Hash Code of emp1 " + emp1.hashCode());

		emp1.setName("bharat");

		System.out.println("emp : " + emp);
		System.out.println("emp1 : " + emp1);
	}

}
