package com.rishi.spring.boot.ems.service;

import java.util.List;

import com.rishi.spring.boot.ems.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEpEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	void deleteEmployeeById(Long id);
}
