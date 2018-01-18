package com.site.controller;

import java.util.HashMap;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.testingtable.dao.Categorydao;
import com.testingtable.dao.Productdao;
import com.testingtable.dao.Suplierdao;
import com.testingtable.model.Category;
import com.testingtable.model.Suplier;
import com.testingtable.model.Product;
import com.testingtable.dao.Productdao;


@Controller
public class AdminController {
	@Autowired
	Categorydao cdao;
	public void Categorydao(Categorydao cdao)
	{
	   this.cdao=cdao;	
	}

	
	@RequestMapping("admin/categorylist")
	public ModelAndView adding1(){
		List<Category> list= cdao.getAllCategories();
		HashMap<String, Object> model = new HashMap<String, Object>();
		
model.put("lista", list);
model.put("hi","hi");
	     return new ModelAndView("categorylist",model);
	      		
	}
	

@Autowired
Suplierdao sdao;
public void Suplierdao(Suplierdao sdao)
{
this.sdao=sdao;	
}

	@RequestMapping("admin/Suplierlist")
	public ModelAndView adding2(){
		List<Suplier> list=sdao.getAllSupliers();
		ModelAndView m = new ModelAndView("Suplierlist");
		m.addObject("list", list);
	     return m;
			}
	
	
	@Autowired
	Productdao pdao;
	public void Productdao(Productdao pdao)
	{
		this.pdao=pdao;
		
	}

	 @RequestMapping("admin/Productlist")
	 public ModelAndView adding3(){
	 
	 
		List<Product> list=pdao.getAllProducts();
		ModelAndView m = new ModelAndView("Productlist");
		m.addObject("list", list);
	     return m;
	    		}
	    

		@RequestMapping(value="/Productlist",method=RequestMethod.GET)
		public String Productlist()
		{
			System.out.println("inside productlist controller");
			return "Productlist";
	} 
		@RequestMapping(value="/categorylist",method=RequestMethod.GET)
		public String categorylist()
		{
			System.out.println("inside productadd controller");
			return "categorylist";
	} 
		@RequestMapping(value="/Suplierlist",method=RequestMethod.GET)
		public String Suplieradd()
		{
			System.out.println("inside controller");
			return "Suplierlist";
		}
/*
		 @RequestMapping(value="/admin/productdetailslist",method=RequestMethod.GET)
		  public String productdetails(HttpServletRequest request)
		  {
			  String cid=request.getParameter("cid");
			  List<Category> list= pdao.getAllCategories();
			 public List<Product> getFilterProducts(int c_id);
			  System.out.println("inside product details");
		 	  return "productdetailslist";
			  
		  }*/
		 @RequestMapping("Productdetailslist")
			public ModelAndView adding4(HttpServletRequest request){
			  System.out.println("inside product details1111111111111111111111111111111111111111");
				 String cid=request.getParameter("cid");
				  System.out.println(cid);
				 int id=Integer.parseInt(cid);
				  System.out.println("inside product details1222222222222222222222222222222222222222");
			List<Product> list= pdao.getFilterProducts(id);
			  System.out.println("inside product details123333333333333333333333333333333333");
				ModelAndView m = new ModelAndView("Productdetailslist");
				m.addObject("list", list);
			m.addObject("hi");
				  System.out.println("inside product details12444444444444444444444444444");
			 	  return m;
				  
			  

			}
		

		 
}
