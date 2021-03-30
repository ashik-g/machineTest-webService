package com.faith.app.service;

import java.util.List;

import com.faith.app.entity.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployees();

	void addEmployee(Employee employee);

	void updateEmployee(Employee employee);

}