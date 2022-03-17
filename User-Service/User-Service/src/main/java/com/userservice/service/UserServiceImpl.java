package com.userservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.userservice.VO.Department;
import com.userservice.VO.ResponseVO;
import com.userservice.dao.UserRepository;
import com.userservice.entity.User;

@Service
@Component
public class UserServiceImpl implements UserServiceInterface{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User saveData(User user) {
		return null;
	}

	@Override
	public User Display(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseVO getUserWithDepartment(int userId) {
		System.out.println("Entered controller");
		ResponseVO vo = new ResponseVO();
		Optional<User> findById = userRepository.findById(userId);
		System.out.println("Entered databases");
		User user = findById.get();
		System.out.println("user"+user);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/get/1",Department.class);
		System.out.println("department: "+department);
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}

}
