package com.Kitchenstory.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Kitchenstory.service.Customerservice;
import com.Kitchenstory.model.customer;

@Controller
public class Customercontroller {

	@Autowired
	Customerservice Custservice;
	
	//saveCustomer
	@PostMapping("/addCustomer")
	public String addcustomer(@ModelAttribute("customer")customer cm,Model model,HttpSession session)
	{
		
		Custservice.saveCustomer(cm);
		session.setAttribute("action","Profile Added Successfully");
		model.addAttribute("customer", cm);
		return "login2";
	}
	
	   
	//verify Customer
		@PostMapping("/checkcustomer")
		public String Checkcust(@RequestParam(name="username")String username,@RequestParam(name="password")String password,Model model)
		{
			if(Custservice.customerCheck(username, password))
			{
			return "Customerhome";
			}
			else
			{
				model.addAttribute("action","Invalid Credentials");
				return"login2";
			}
		}
}
