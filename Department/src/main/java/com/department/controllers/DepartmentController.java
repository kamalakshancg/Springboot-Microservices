package com.department.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.service.DepartmentServiceImpl;

@RestController
@Component
@RequestMapping("/departments")
public class DepartmentController {
    
	public DepartmentController() {
		
	}
	@Autowired
	DepartmentServiceImpl departmentServiceImpl;
	
	@PostMapping("/post")
	public Department saveData(@RequestBody Department department){
	    departmentServiceImpl.Save(department);
		return department;
		
	}
	
	@GetMapping("/get/{id}")
	public Department Display(@PathVariable(name = "id") int id) {
		Department data = departmentServiceImpl.getData(id);
		return data;
	}
	
	
	
	

}
