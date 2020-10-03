package com.xadmin.profiles.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xadmin.profiles.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
