package com.emp.cruddemo.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.cruddemo.controller.EmployeeController;
import com.emp.cruddemo.entity.Employee;
import com.emp.cruddemo.repos.EmployeeCrudRepo;
import com.emp.cruddemo.utility.GlobalResources;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	private Logger logger=GlobalResources.getLogger(EmployeeService.class);
	@Autowired
	private EmployeeCrudRepo crudRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee=crudRepo.save(employee);
		return savedEmployee;
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		String methodName="getAllEmployee()";
		logger.info(methodName+"called");
		return crudRepo.findAll();
	}

	@Override
	public Employee getEmpById(Long empidL) {
		// TODO Auto-generated method stub
		return crudRepo.findById(empidL).get();
	}

	@Override
	public void deleteEmpById(Long empidL) {
		crudRepo.deleteById(empidL);
		
	}
}
