package com.EmployeeManagement.EmpManagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.EmployeeManagement.EmpManagement.Entities.Employee;
import com.EmployeeManagement.EmpManagement.Repository.EmployeeRepository;
import com.EmployeeManagement.EmpManagement.Service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		 
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmpById(int id) {
		 
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		 
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		 
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		
	}
	
	
	 
	 

}
