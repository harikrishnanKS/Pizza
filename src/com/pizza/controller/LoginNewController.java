package com.pizza.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.dao.CustomerDaoImpl;
import com.pizza.dao.PizzaDao;
import com.pizza.dao.PizzaOrderDAO;
import com.pizza.dao.ToppingDAO;
import com.pizza.entity.CartItem;
import com.pizza.entity.Customer;
import com.pizza.entity.ItemComponent;
import com.pizza.entity.Pizza;
import com.pizza.entity.Toppings;
@Controller
public class LoginNewController {
	
	@Autowired
	private Customer customer;
	@Autowired
	private PizzaOrderDAO pDao;
	@Autowired
	private CartItem Item;
	@Autowired
	private ItemComponent itemComponent;
	@Autowired
	private PizzaDao pizzaDao;
	
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
    private  CustomerDaoImpl impl;
	@Autowired
	private ToppingDAO toppingDao;
	
	@RequestMapping("/")
	public ModelAndView init(){
		
		mdlView.addObject("modelData","");
		mdlView.setViewName("index");
		return mdlView;
	}
	@RequestMapping("/register")
	public ModelAndView onRegister()
	{
		mdlView.addObject("command",customer);
		mdlView.setViewName("register");
		return mdlView;
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView submitRegister(@ModelAttribute("cust")Customer obj)
	{
		customer=impl.add(obj);
		if(customer==null)
		{
			mdlView.addObject("msg","Registration failed");
			mdlView.setViewName("register");
		}
		else
		{
		mdlView.addObject("cust",customer);
		
		mdlView.setViewName("index");
		}
		return mdlView;
		
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("userName")String userName,
			                   @RequestParam("passWord")String passWord,HttpSession session)
	{
		Customer cust=impl.checkValidation(userName, passWord);
		if(cust==null)
		{
			mdlView.addObject("errormsg","invalid credentials");
			mdlView.setViewName("index1");
			
		}
		
		else
		{
			session.setAttribute("customer", cust);

			List<Pizza> pizzas=pizzaDao.findAll();
			List<Toppings> toppings= toppingDao.findAll();
               List<String> sizes=pDao.getSizes();     
               

			
			
			session.setAttribute("pizzas", pizzas);
			session.setAttribute("toppings", toppings);
			session.setAttribute("sizes", sizes);
			
			mdlView.addObject("command", Item);
			mdlView.setViewName("home");
			
			HashMap<Customer,List<CartItem>> items=new HashMap<Customer,List<CartItem>>();
			List<CartItem> list=new ArrayList<CartItem>();
			items.put(cust, list);
			session.setAttribute("items", items);
		}
		
		return mdlView;
	
		
}

}
