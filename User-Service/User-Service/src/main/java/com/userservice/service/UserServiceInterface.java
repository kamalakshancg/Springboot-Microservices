package com.userservice.service;

import com.userservice.VO.ResponseVO;
import com.userservice.entity.User;

public interface UserServiceInterface {
	
	public User saveData(User user);
	public User Display(int id);
	public ResponseVO getUserWithDepartment(int userId);

}
