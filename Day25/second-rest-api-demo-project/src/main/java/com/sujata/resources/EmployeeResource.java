package com.sujata.resources;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;
import com.sujata.service.EmployeeService;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeResource {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(/*path = "/employees",*/method = RequestMethod.GET,produces = "Application/json")
	public Collection<Employee> findAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
//	@RequestMapping(path="/employees/{eid}",method = RequestMethod.GET,produces = "Application/json")
	@GetMapping(path = "/{eid}",produces = "Application/json")
	public Employee getEmployeeById(@PathVariable("eid") int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping(path = "/xml/{eid}",produces = "Application/xml")
	public Employee getEmpById(@PathVariable("eid") int id) {
		return employeeService.getEmployeeById(id);
	}
	@RequestMapping(path = "/payslips/{eid}",method = RequestMethod.GET,produces = "Application/json")
	public EmployeePaySlip getPaySlipById(@PathVariable("eid") int id) {
		return employeeService.getPaySlip(id);
	}
	
//	@RequestMapping(path = "/employees",method = RequestMethod.POST,produces = "Application/json",consumes = "Application/json")
	@PostMapping(produces = "Application/json",consumes = "Application/json")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return employeeService.insertEmployee(emp);
	}
	
//	@RequestMapping(path = "/employees/{id}",method = RequestMethod.DELETE,produces = "Application/json")
	@DeleteMapping(path = "/{id}",produces = "Application/json")
	public Employee deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployeeById(id);
	}
	
//	@RequestMapping(path = "/employees/{id}/{sal}",method = RequestMethod.PUT,produces = "Application/json")
	@PutMapping(path = "/{id}/{sal}",produces = "Application/json")
	public Employee updateEmployee(@PathVariable("id") int id,@PathVariable("sal") int salary) {
		return employeeService.modifySalary(id, salary);
	}
	
}
