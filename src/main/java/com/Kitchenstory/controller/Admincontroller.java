package com.Kitchenstory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Kitchenstory.service.Adminservice;

@Controller
public class Admincontroller {
	
	@Autowired
	Adminservice Aservice;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String Mainhome()
	{
		return "Home";
	}
	
	@RequestMapping(value="/login1", method=RequestMethod.GET)
	public String AdminLogin()
	{
		return "login1";
	}
	

}
