package com.emp.cruddemo.service;

import java.util.List;

import com.emp.cruddemo.entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee getEmpById(Long empidL);

	public void deleteEmpById(Long empidL);

}
