package com.Kitchenstory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kitchenstory.model.product;
import com.Kitchenstory.repository.Productrepository;

@Service
public class Productservice {
	
	@Autowired
	Productrepository Prepo;
	
	//Method to List all Products
	public List<product>getAllProducts()
	{
		return Prepo.findAll();
	}
	
	//Method to save a product
	public void saveProduct(product pd)
	{
		Prepo.save(pd);
	}
	
	public void deleteProduct(int id)
	{
		Prepo.deleteById(id);
	}

}
