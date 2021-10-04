package com.emp.cruddemo.controller;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.cruddemo.entity.User;
import com.emp.cruddemo.service.UserServiceInterface;

@RestController
public class UserController {
	@Autowired
	UserServiceInterface userInterface;

	@PostMapping("/save")
	public ResponseEntity<User> addUser(@RequestBody User user){
		User userSaved=userInterface.addUser(user);
		return new ResponseEntity<User>(userSaved,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUser(){
		List <User> listofAllUser=userInterface.getAllUser();
		return new ResponseEntity<List<User>>(listofAllUser,HttpStatus.OK); 
	}
	
	
	
	@GetMapping("user/{useridL}")
	public ResponseEntity<User> getUserById(@PathVariable Long useridL){
		User userRetrieve=userInterface.getUserById(useridL);
		return new ResponseEntity<User>(userRetrieve,HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("delete/useridL")
	public ResponseEntity<Void> deleteUserById(@PathVariable Long useridL)
	{
		userInterface.deleteUserById(useridL);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	
	
	@PutMapping("update")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		User userSaved=userInterface.addUser(user);
		return new ResponseEntity<User>(userSaved,HttpStatus.CREATED);
	}
	
	
}
