package com.sujata.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;
import com.sujata.persistence.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public Collection<Employee> getAllEmployees(){
		
		return empDao.findAll();
	}

	@Override
	public Employee insertEmployee(Employee employee){
		Employee e=empDao.save(employee);
		return e;
//		if(e!=null)
//			return true;
//		return false;
	}
/*
 * HR :15% of salary
 * PF :12% of Salary
 * DA : 8% of Salary
 */
	@Override
	public EmployeePaySlip getPaySlip(int id){
		EmployeePaySlip paySlip=null;
		Employee employee=empDao.getById(id);
		if(employee!=null) {
			paySlip=new EmployeePaySlip();
			paySlip.setEmployee(employee);
			paySlip.setHr(.15*employee.getEmpSalary());
			paySlip.setDa(.01*employee.getEmpSalary());
			paySlip.setPf(.12*employee.getEmpSalary());
			paySlip.setTotalSalary(employee.getEmpSalary()+.15*employee.getEmpSalary()+.01*employee.getEmpSalary()-.12*employee.getEmpSalary());
		}
		return paySlip;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee emp=empDao.getById(id);
		return emp;
	}

	@Override
	public Employee deleteEmployeeById(int id) {
		Employee emp=empDao.getById(id);
		empDao.deleteById(id);
		return emp;
	}

	@Override
	public Employee modifySalary(int id, int salary) {
		int rows=empDao.updateEmployeeSaalry(id, salary);
		Employee emp=null;
		if(rows>0)
			emp=empDao.getById(id);
		return emp;
	}

}
