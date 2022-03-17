package com.userservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.userservice.VO.ResponseVO;
import com.userservice.entity.User;
import com.userservice.service.UserServiceImpl;

@RestController
@Component
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Autowired
	RestTemplate restTemplate;
	
	public UserController() {
		
	}
	
	public User saveUser(@RequestBody User user) {
		return userServiceImpl.saveData(user);
	}
	
	@GetMapping("/getuser/{userid}")
	public ResponseVO getUserWithDepartment(@PathVariable (name= "userid") int userid) {
		ResponseVO userWithDepartment = userServiceImpl.getUserWithDepartment(userid);
		return userWithDepartment;
	}
	
	@GetMapping("/check")
	public String checking() {
		return "running";
	}
}
