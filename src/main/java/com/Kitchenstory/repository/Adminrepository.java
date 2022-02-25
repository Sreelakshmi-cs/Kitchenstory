package com.Kitchenstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kitchenstory.model.admin;

@Repository
public interface Adminrepository extends JpaRepository<admin,Integer> {
	admin findByUsername(String username);

}
