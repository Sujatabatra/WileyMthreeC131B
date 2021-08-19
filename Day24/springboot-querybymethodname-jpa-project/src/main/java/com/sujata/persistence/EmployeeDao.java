package com.sujata.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;

/*
 * Return type : Basic Type, Entity or Optional and List<E> or Stream<E>
 * while writing query we make use of JPAQL (Java Persistence API Query Language)
 * JPAQL will be converted to underlying DB by dialect.
 * In JPAQL we use class name instead of table name
 * and property names instead of column name
 * 
 */
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	List<Employee> getEmployeeByEmpName(String name);
	
}
