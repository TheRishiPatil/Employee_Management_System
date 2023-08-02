package com.rishi.spring.boot.ems.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rishi.spring.boot.ems.model.Employee;
import com.rishi.spring.boot.ems.repository.EmployeeRepository;
import com.rishi.spring.boot.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public List<Employee> getAllEpEmployees() {
		return repository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		repository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> optional =  repository.findById(id);
		Employee result = null;
		if (optional.isPresent()) {
			result =  optional.get();
		} else {
			throw new RuntimeException("Id not Found!!");
		}
		return result;
	}

	@Override
	public void deleteEmployeeById(Long id) {
		repository.deleteById(id);
	}

}
