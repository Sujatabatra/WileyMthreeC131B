package com.sujata.db;

import java.util.HashMap;
import java.util.Map;

import com.sujata.bean.Employee;

public class EmployeeDb {
	
	private static Map<Integer, Employee> employees=new HashMap<Integer, Employee>();
	static {
		employees.put(101, new Employee(101, "AAAAA", "Associate", "IT", 35000));
		employees.put(102, new Employee(102, "BBBBB", "Manager", "Sales", 125000));
		employees.put(103, new Employee(103, "CCCCC", "Executive", "Marketing", 15000));
		employees.put(104, new Employee(104, "DDDDD", "Sr. Associate", "IT", 60000));
		employees.put(105, new Employee(105, "EEEEE", "Clerk", "Purchase", 10000));
		employees.put(106, new Employee(106, "FFFFF", "Manager", "IT", 215000));
	}
	public static Map<Integer, Employee> getEmployees() {
		return employees;
	}
	public static void setEmployees(Map<Integer, Employee> employees) {
		EmployeeDb.employees = employees;
	}

	
}
