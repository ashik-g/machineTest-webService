package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Employee;
import com.faith.app.repo.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees(){
		return (List<Employee>) employeeRepository.findAll();
	}
	
	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
}