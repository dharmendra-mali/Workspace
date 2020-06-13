package com.company.spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.spring.demo.models.User;
@Repository
public interface UserRepositories extends JpaRepository<User, Long> {
  
	
	User findByUserFirstName(String name);
}
