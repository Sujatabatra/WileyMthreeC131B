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
	public Collection<Employee> getAllEmployees()throws SQLException{
		
		return empDao.findAll();
	}

	@Override
	public boolean insertEmployee(Employee employee)throws SQLException{
		Employee e=empDao.save(employee);
		if(e!=null)
			return true;
		return false;
	}
/*
 * HR :15% of salary
 * PF :12% of Salary
 * DA : 8% of Salary
 */
	@Override
	public EmployeePaySlip getPaySlip(int id)throws SQLException{
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

}