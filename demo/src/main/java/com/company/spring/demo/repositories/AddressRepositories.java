package com.company.spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.spring.demo.models.Address;

@Repository
public interface AddressRepositories extends JpaRepository<Address, Long> {

}
