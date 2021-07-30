package com.sujata.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import com.sujata.bean.Employee;
import com.sujata.bean.EmployeePaySlip;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

//	private EmployeeDao empDao=new EmployeeDaoImpl();

	private EmployeeDao empDao;

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public Collection<Employee> getAllEmployees() throws ClassNotFoundException, SQLException, IOException {

		return empDao.getAllRecords();
	}

	@Override
	public boolean insertEmployee(Employee employee) throws ClassNotFoundException, SQLException, IOException {

		return empDao.insertRecord(employee);
	}

	/*
	 * HR :15% of salary PF :12% of Salary DA : 8% of Salary
	 */
	@Override
	public EmployeePaySlip getPaySlip(int id) throws ClassNotFoundException, SQLException, IOException {
		EmployeePaySlip paySlip = null;
		Employee employee = empDao.getRecordById(id);
		if (employee != null) {
			paySlip = new EmployeePaySlip();
			paySlip.setEmployee(employee);
			paySlip.setHr(.15 * employee.getEmpSalary());
			paySlip.setDa(.01 * employee.getEmpSalary());
			paySlip.setPf(.12 * employee.getEmpSalary());
			paySlip.setTotalSalary(employee.getEmpSalary() + .15 * employee.getEmpSalary()
					+ .01 * employee.getEmpSalary() - .12 * employee.getEmpSalary());
		}
		return paySlip;
	}

}
