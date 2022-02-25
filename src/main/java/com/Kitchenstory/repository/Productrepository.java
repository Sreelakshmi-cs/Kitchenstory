package com.Kitchenstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kitchenstory.model.product;

@Repository
public interface Productrepository extends JpaRepository<product,Integer> {
	
	

}
