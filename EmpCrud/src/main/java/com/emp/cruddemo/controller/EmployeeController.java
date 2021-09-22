package com.emp.cruddemo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.emp.cruddemo.entity.Employee;
import com.emp.cruddemo.service.EmployeeServiceInterface;
import com.emp.cruddemo.utility.GlobalResources;

@RestController
@RequestMapping("/code")
public class EmployeeController {

	private Logger logger=GlobalResources.getLogger(EmployeeController.class);
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	
	@PostMapping("save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		
		Employee employeesaved=employeeServiceInterface.addEmployee(employee);
		return new ResponseEntity<Employee>(employeesaved,HttpStatus.CREATED);
	}
	@GetMapping("all")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		String methodName="getAllEmployee()";
		logger.info(methodName+"called");
		List<Employee> listOfAllempls=employeeServiceInterface.getAllEmployee();
		return new ResponseEntity<List <Employee>>(listOfAllempls,HttpStatus.OK);
	}
	@GetMapping("emp/{empidL}")
	public ResponseEntity<Employee> getEmpById(@PathVariable Long empidL){
		Employee empRetrieve=employeeServiceInterface.getEmpById(empidL);
		return new ResponseEntity<Employee>(empRetrieve,HttpStatus.OK);
	}
	@DeleteMapping("delete/{empidL}")
	public ResponseEntity<Void> deleteEmpById(@PathVariable Long empidL){
		employeeServiceInterface.deleteEmpById(empidL);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	@PutMapping("update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		
		Employee employeesaved=employeeServiceInterface.addEmployee(employee);
		return new ResponseEntity<Employee>(employeesaved,HttpStatus.CREATED);
	}
}
