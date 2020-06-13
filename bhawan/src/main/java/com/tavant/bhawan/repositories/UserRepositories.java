package com.tavant.bhawan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tavant.bhawan.models.User;

@Repository
public interface UserRepositories extends JpaRepository<User, Integer> {

}
