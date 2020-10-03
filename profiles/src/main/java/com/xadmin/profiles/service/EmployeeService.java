package com.xadmin.profiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.xadmin.profiles.dao.EmployeeRepository;
import com.xadmin.profiles.model.Employee;

@Service
@Profile(value = { "local", "production", "development" })
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public String saveEmployee(Employee employee) {
		repository.save(employee);
		return "saved employee with id" + employee.getId();
	}
	
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}

}
