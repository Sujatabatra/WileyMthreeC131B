package com.sujata.resources;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;
import com.sujata.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(path = "/employees",method = RequestMethod.GET,produces = "Application/json")
	Collection<Employee> findAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(path="/employees/{eid}",method = RequestMethod.GET,produces = "Application/json")
	Employee getEmployeeById(@PathVariable("eid") int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@RequestMapping(path = "/employees/payslips/{eid}",method = RequestMethod.GET,produces = "Application/json")
	EmployeePaySlip getPaySlipById(@PathVariable("eid") int id) {
		return employeeService.getPaySlip(id);
	}
	
	@RequestMapping(path = "/employees",method = RequestMethod.POST,produces = "Application/json",consumes = "Application/json")
	Employee saveEmployee(@RequestBody Employee emp) {
		return employeeService.insertEmployee(emp);
	}
	
}
