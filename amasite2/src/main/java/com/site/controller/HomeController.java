package com.site.controller;


//	package com.site.controller;

	import javax.servlet.http.HttpServletRequest;

	//import org.hibernate.annotations.common.util.impl.Log_.logger;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	import com.testingtable.model.User;

	@Controller
	public class HomeController {

		
		
		@Autowired
		Userdao userDao;
		
		public void Userdao(Userdao userDao)
		{
			this.userDao=userDao;
		}

		 @RequestMapping("/register")
			public ModelAndView reg(HttpServletRequest request)
			{
			   ModelAndView mv=null;
			   try{
				   int id=Integer.parseInt(request.getParameter("id"));
				  
		       String name=request.getParameter("name");
		   	String password=request.getParameter("password");
			
		       String email=request.getParameter("email");
		       String rol=request.getParameter("rol");
				String adress=request.getParameter("adress");
				//int age=Integer.parseInt(request.getParameter("age"));
				String phone=request.getParameter("phone");
			System.out.println("haoiii"+name+"mail"+"adress"+adress+"phone"+phone+"password"+password);
				User u=new User();
				u.setId(id);
				u.setName(name);
				u.setPassword(password);
				u.setEmail(email);
			//	u.setAge(age);
				u.setRol(rol);
			//	u.setU_password(pass);
				u.setAdress(adress);
				u.setPhone(phone);
				//u.setRole("role");
				Userdao.persist(u);
				System.out.println("Mother Earth");
				
				 mv = new ModelAndView("index");
			   }
			   catch(Exception ex)
			   {
				   mv=new ModelAndView("ErrorPage","error",ex);
			   }
			   finally
			   {
				return mv;
			   }
			}}


