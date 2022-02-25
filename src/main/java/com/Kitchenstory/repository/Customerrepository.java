package com.Kitchenstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kitchenstory.model.customer;

	
@Repository
public interface Customerrepository extends JpaRepository<customer,Integer> {

		 customer findByUsername(String username);

	}


