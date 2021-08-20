package com.sujata.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{


}
