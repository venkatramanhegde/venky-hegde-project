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

	/*@Autowired
	Userdao userDao;
	public void Userdao(Userdao userDao)
	{
		this.userDao=userDao;
	}*/
	@RequestMapping(value="/success",method=RequestMethod.GET)
	//public ModelAndView success(HttpServletRequest request)
	public String success()
	{
		/*ModelAndView mv=null;*/
		 /*  try{
	       String mail=request.getParameter("mail");
	       String name=request.getParameter("name");
			String add=request.getParameter("address");
			int age=Integer.parseInt(request.getParameter("age"));
			String phone=request.getParameter("phone");
			String pass=request.getParameter("passwd");
			System.out.println("haoiii"+name+"mail"+"add"+add+"age"+age+"phone"+phone+"pass"+pass);
			User u=new User();
			u.setU_mail(mail);
			u.setAge(age);
			u.setU_password(pass);
			u.setPhone(phone);
			u.setRole("role");
			userDao.persist(u);
			System.out.println("Mother Earth");
			
			 mv = new ModelAndView("success");
		   }catch(Exception ex)
		   {
			   mv=new ModelAndView("ErrorPage","error",ex);
		   }finally
		   {
			return mv;
		   }
		*/
		System.out.println("inside controller");
		return "success";
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String signin2()
	{
		System.out.println("inside controller");
		return "admin";
	}
	/*@RequestMapping(value="/Suplier LIst",method=RequestMethod.GET)
	public String signin()
	{
		System.out.println("inside controller");
		return "Suplier List";
	}}
*/
} 
/*	
	@RequestMapping(value="/registrer")
	public ModelAndView reg(HttpServletRequest request)
	{
        
		
		ModelAndView mv = new ModelAndView("registrer");*/
		
		/*return mv;
	}*/
	

