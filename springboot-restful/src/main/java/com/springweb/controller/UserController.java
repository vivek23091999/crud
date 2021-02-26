package com.springweb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.entity.User;
import com.springweb.exception.ResourceNotFoundException;
import com.springweb.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	//get all username
	@GetMapping("/getAll")
	public List<User> getallUsers(){
		return this.userRepository.findAll();
	}
	
	
	 //create username
	  @PostMapping("/create") 
	  public User createUser(@RequestBody User user){
	  return this.userRepository.save(user);
	  
	 
	
	
}
