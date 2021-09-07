package com.emp.cruddemo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.cruddemo.entity.Employee;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long>{

}
