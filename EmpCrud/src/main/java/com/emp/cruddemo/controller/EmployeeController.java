package com.emp.cruddemo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.emp.cruddemo.entity.Employee;
import com.emp.cruddemo.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/code")
public class EmployeeController {

	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	
	@PostMapping("save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		
		Employee employeesaved=employeeServiceInterface.addEmployee(employee);
		return new ResponseEntity<Employee>(employeesaved,HttpStatus.CREATED);
	}
	@GetMapping("all")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> listOfAllempls=employeeServiceInterface.getAllEmployee();
		return new ResponseEntity<List <Employee>>(listOfAllempls,HttpStatus.OK);
	}
	
	
}
