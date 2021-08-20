package com.sujata.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	@Transactional
	@Modifying
	@Query("UPDATE Employee set empSalary=:sal where empId=:id")
	public int updateEmployeeSaalry(@Param("id") int id,@Param("sal") int salary);

}
