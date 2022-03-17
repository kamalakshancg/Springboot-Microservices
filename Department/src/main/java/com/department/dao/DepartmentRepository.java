package com.department.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.department.entity.Department;

@Repository
@Component
public interface DepartmentRepository extends JpaRepository<Department, Integer>  {

}
