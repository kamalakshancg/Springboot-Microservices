package com.userservice.VO;

import org.springframework.stereotype.Component;

import com.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
public class ResponseVO {
    
	private User user;
	private Department department;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "ResponseVO [user=" + user + ", department=" + department + "]";
	}
	
	
	
}
