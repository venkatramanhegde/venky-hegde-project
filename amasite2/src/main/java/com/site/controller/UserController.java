package com.site.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//import javax.servlet.http.*
@Controller
public class UserController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index()
	{
		System.out.println("inside controller");
		return "index";
	}

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String signin1()
	{
		System.out.println("inside controller");
		return "register";
	}
	@RequestMapping(value="/Suplier LIst",method=RequestMethod.GET)
	public String signin()
	{
		System.out.println("inside controller");
		return "Suplier List";
	}}

	 
/*	
	@RequestMapping(value="/registrer")
	public ModelAndView reg(HttpServletRequest request)
	{
        
		
		ModelAndView mv = new ModelAndView("registrer");*/
		
		/*return mv;
	}*/
	

