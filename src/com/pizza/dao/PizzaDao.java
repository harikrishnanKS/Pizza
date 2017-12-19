package com.pizza.dao;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.orm.hibernate3.HibernateTemplate;
	import org.springframework.stereotype.Repository;

import com.pizza.entity.Pizza;
import com.pizza.entity.Toppings;
	@Repository
	public class PizzaDao {


		@Autowired
		private HibernateTemplate template;
		
		@Autowired
		private Pizza pizza;
		
		@Autowired
		private Toppings topping;
		
		
		public List<Pizza> getPizzas(){
			
			List<Pizza> pizzas=null;
			pizzas=template.loadAll(Pizza.class);
			
			
			return pizzas;
			
		}
		public List<Toppings> getToppings(){
			
			List<Toppings> toppings=null;
			toppings=template.loadAll(Toppings.class);
			return toppings;
		}
		
		
	
		public Pizza findById(long key) {
			pizza=(Pizza) template.get(Pizza.class,key);
			return pizza;
		}


		public List<Pizza> findAll() {
			List<Pizza> pizzas=null;
			pizzas=template.loadAll(Pizza.class);
			
			
			return pizzas;
		}
	}



