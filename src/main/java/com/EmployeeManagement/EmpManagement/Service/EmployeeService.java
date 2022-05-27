package com.EmployeeManagement.EmpManagement.Service;

import java.util.List;

import com.EmployeeManagement.EmpManagement.Entities.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();

	public Employee getEmpById(int id);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(int id);

}
