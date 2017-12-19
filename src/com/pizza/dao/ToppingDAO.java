package com.pizza.dao;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pizza.entity.Toppings;
import com.pizza.ifaces.GenericDao;
;

@Repository
public class ToppingDAO implements GenericDao<Toppings> {

	
	@Autowired
	private HibernateTemplate template;
	
	
	
	@Autowired
	private Toppings topping;
	
	
	public Toppings add(Toppings t) {
		// TODO Auto-generated method stub
		return null;
	}

	public long update(Toppings t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public long delete(Toppings t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Toppings findById(long key) {
		topping=(Toppings) template.get(Toppings.class,key);
		return topping;
	}

	public List<Toppings> findAll() {
		List<Toppings> toppings=null;
		toppings=template.loadAll(Toppings.class);
		return toppings;
	}

	

}
