package com.site.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.testingtable.model.User;
import com.testingtable.dao.Userdao;
import com.testingtable.model.Category;

import com.testingtable.dao.Categorydao;
import com.testingtable.model.Suplier;
import com.testingtable.dao.Suplierdao;
import com.testingtable.model.Product;
import com.testingtable.dao.Productdao;

@Controller
public class UserController {

	@Autowired
    Suplierdao sdao;
public void Suplierdao(Suplierdao sdao)
{
   this.sdao=sdao;	
}
@Autowired
Userdao userDao;

public void Userdao(Userdao userDao)
{
	this.userDao=userDao;
}

@Autowired
Categorydao cdao;
public void Categorydao(Categorydao cdao)
{
   this.cdao=cdao;	
}
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index()
	{
		System.out.println("inside controller");
		List<Category> clist=cdao.getAllCategories();
		ModelAndView m=new ModelAndView("index");
		m.addObject("clist",clist);
		return m;
	}

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String signin1()
	{
		System.out.println("inside controller"); 
		return "register";
	}

	
	
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public ModelAndView success(HttpServletRequest request)

	{
	 System.out.println("inside home controller");
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
	System.out.println("haoiii"+name+" "+email+"adress"+adress+"phone"+phone+"password"+password);
		User u=new User();
		u.setId(id);
		u.setName(name);
		u.setPassword(password);
		u.setEmail(email);
		u.setRol(rol);
		u.setAdress(adress);
		u.setPhone(phone);
		userDao.persist(u);
		System.out.println("Mother Earth");
		
		 mv = new ModelAndView("success");
	   }
	   catch(Exception ex)
	   {
		   System.out.println(ex.getMessage());
		   mv=new ModelAndView("error","error",ex);
	   }
	   finally
	   {
		return mv;
	   }
	}

@RequestMapping(value="/success2",method=RequestMethod.GET)
public ModelAndView success2(HttpServletRequest request)

{
 System.out.println("inside home controller under Suplier");
   ModelAndView mv=null;
   try{
	   int Sid=Integer.parseInt(request.getParameter("Sid"));
	  
   String Sname=request.getParameter("Sname");

	System.out.println("hello" +Sid+" "+Sname);
	Suplier s=new Suplier();
    s.setS_id(Sid);
    s.setS_name(Sname);
    sdao.persist(s);
	System.out.println("Mother Earth");
	
	 mv = new ModelAndView("success");
  }
  catch(Exception ex)
  {
	   System.out.println(ex.getMessage());
	   mv=new ModelAndView("error","error",ex);
  }
  finally
  {
	return mv;
  }
   
}


@RequestMapping(value="/success1",method=RequestMethod.GET)
public ModelAndView success1(HttpServletRequest request)


{
 System.out.println("inside home controller under Category");
   ModelAndView mv=null;
   try{
	   int Cid=Integer.parseInt(request.getParameter("Cid"));
	  
   String Cname=request.getParameter("Cname");
	String Cdesc=request.getParameter("Cdesc");
	System.out.println("hello" +Cid+" "+Cname+" "+Cdesc);
	 Category c=new Category();
   c.setC_id(Cid);
   c.setC_name(Cname);
   c.setC_desc(Cdesc);
   cdao.persist(c);
       

	System.out.println("Mother Earth");
	
	 mv = new ModelAndView("success");
  }
  catch(Exception ex)
  {
	   System.out.println(ex.getMessage());
	   mv=new ModelAndView("error","error",ex);
  }
  finally
  {
	return mv;
  }
  
}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String signin2()
	{
		System.out.println("inside controller");
		return "admin";
	}
	@RequestMapping(value="/Suplieradd",method=RequestMethod.GET)
	public String Suplieradd()
	{
		System.out.println("inside controller");
		return "Suplieradd";
	}


	@RequestMapping(value="/categoryadd",method=RequestMethod.GET)
	public String Categoryadd()
	{
		System.out.println("inside Category controller");
		return "categoryadd";
	}
  @RequestMapping(value="/ProductDetails",method=RequestMethod.GET)
  public String productdetails()
  {
	  System.out.println("inside product details");
	  return "ProductDetails";
	  
  }

 

	@Autowired
	Productdao pdao;
	public void Productdao(Productdao pdao)
	{
		this.pdao=pdao;
		
	}
	
	@RequestMapping(value="/success3",method=RequestMethod.GET)
	public ModelAndView success3(HttpServletRequest request)

	{
	 System.out.println("inside Product homecontroller");
	   ModelAndView mv=null;
	   try{
		   int Pid=Integer.parseInt(request.getParameter("Pid"));
		   
       String Pname=request.getParameter("Pname");
   	String Pbrand=request.getParameter("Pbrand");
	
       String Pdesc=request.getParameter("Pdesc");
     /*  String Pprice=request.getParameter("Pprice");*/
       int Pprice=Integer.parseInt(request.getParameter("Pprice"));
       String stock=request.getParameter("stock");
       System.out.println("hello"+Pid+" "+Pname+" "+Pbrand+" "+Pdesc+" "+Pprice);
		Product p=new Product();
		
		p.setP_id(Pid);
		p.setP_name(Pname);
		p.setP_brand(Pbrand);
		p.setP_description(Pdesc);
		p.setP_price(Pprice);
		p.setStock(stock);
		pdao.persist(p);
		
		System.out.println("Mother Earth");
		
		 mv = new ModelAndView("success");
	   }
	   catch(Exception ex)
	   {
		   System.out.println(ex.getMessage());
		   mv=new ModelAndView("error","error",ex);
	   }
	   finally
	   {
		return mv;
	   }
	}

       
       
       
   
	@RequestMapping(value="/productadd",method=RequestMethod.GET)
	public ModelAndView Productadd()
	{
		System.out.println("inside productadd controller");
		List<Suplier> slist=sdao.getAllSupliers();
		   List<Category> clist=cdao.getAllCategories();
		ModelAndView m = new ModelAndView("productadd");
		m.addObject("slist", slist);
		m.addObject("clist", clist);
      
		return m;
		
	    
		//return "productadd";
} 

	
}
	

