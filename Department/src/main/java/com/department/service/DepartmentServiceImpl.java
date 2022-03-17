package com.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.department.dao.DepartmentRepository;
import com.department.entity.Department;

@Component
public class DepartmentServiceImpl implements DepartmentInterface {
    
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	public void Save(Department department) {
		// TODO Auto-generated method stub
		departmentRepository.save(department);
		
	}

	@Override
	public Department getData(int deptId) {
		// TODO Auto-generated method stub
		Department department = null;
		Optional<Department> findById = departmentRepository.findById(deptId);
		if(findById.isPresent()) {
			department = findById.get();
		}
		return department;
	}
    
	
}
