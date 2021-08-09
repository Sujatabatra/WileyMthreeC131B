package com.sujata.training;

public class MyMainCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp=new Employee(111, "AAAA", "Sales", "Clerk", 15000);
		emp.setAddress(new Address(101, "Street 1", "Noida", "UP", "123456"));
		
		Employee emp1=emp.clone();
		
		System.out.println("emp : "+emp);
		System.out.println("emp1 : "+emp1);

		emp.setName("Abha");
		
		System.out.println("emp : "+emp);
		System.out.println("emp1 : "+emp1);
		
		emp.getAddress().setCity("Gurugram");
		emp.getAddress().setState("Haryana");
		
		System.out.println("emp : "+emp);
		System.out.println("emp1 : "+emp1);
	}

}
