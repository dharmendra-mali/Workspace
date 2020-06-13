package com.company.spring.demo.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.spring.demo.models.User;

public interface UserRepositories extends JpaRepository<User, Long> {

}
