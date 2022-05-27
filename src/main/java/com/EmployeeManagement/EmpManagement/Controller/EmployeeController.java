package com.EmployeeManagement.EmpManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.EmployeeManagement.EmpManagement.Entities.Employee;
import com.EmployeeManagement.EmpManagement.Service.EmployeeService;

public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home()
	{
	return "welcome to Employee Management System";
	}
	
	@PostMapping("/addEmp")
     public Employee addEmployee(@RequestBody Employee employee)
	{
	    return this.employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee>getAllEmployee()
	{
		return this.employeeService.getAllEmployee();
	}
	
	@GetMapping("/empoyees/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return this.employeeService.getEmpById(id);
	}
	
	@PutMapping("/Employees")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
	return this.employeeService.updateEmployee(employee);
	}
	


	@DeleteMapping("/Employees/{id}")
	public void  deleteEmployee(@PathVariable int id)
	{
		employeeService.deleteEmployee(id);
		
	}
	

}
