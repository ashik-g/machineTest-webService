package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
