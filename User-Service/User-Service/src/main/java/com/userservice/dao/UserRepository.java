package com.userservice.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.userservice.entity.User;

@Repository
@Component
public interface UserRepository extends JpaRepository<User, Integer> {

	

}
