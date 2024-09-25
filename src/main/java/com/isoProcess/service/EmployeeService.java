package com.isoProcess.service;

import com.isoProcess.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployee(Employee employee); // Create or update employee

    Optional<Employee> getEmployeeById(int id); // Get employee by id

    List<Employee> getAllEmployees(); // Get all employees

    void deleteEmployeeById(int id); // Delete employee by id
}