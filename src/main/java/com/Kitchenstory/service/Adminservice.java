package com.Kitchenstory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kitchenstory.model.admin;
import com.Kitchenstory.repository.Adminrepository;

@Service
public class Adminservice {

	@Autowired
	Adminrepository Arepo;
	
	public boolean adminCheck(String username,String password)
	{
		admin ad=Arepo.findByUsername(username);
		if(ad.getUsername().equals(username)&&ad.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}
	
	
	public admin getAdmin(String username) {
		return Arepo.findByUsername(username);
	}

	public void Passwordchange(admin ad)
	{
		Arepo.save(ad);
	}
	
}
