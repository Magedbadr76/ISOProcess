package com.isoProcess.repo;


import com.isoProcess.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositor extends JpaRepository<Employee, Integer> {

}
