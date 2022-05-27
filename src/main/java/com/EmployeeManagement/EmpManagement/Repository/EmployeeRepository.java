package com.EmployeeManagement.EmpManagement.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.EmployeeManagement.EmpManagement.Entities.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
