package com.department.service;

import com.department.entity.Department;

public interface DepartmentInterface {
	
	public void Save(Department department);
    public Department getData(int deptId);
}
