
package com.pizza.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pizza.entity.Customer;
import com.pizza.ifaces.GenericDao;
import com.pizza.entity.Customer;
@Repository
public class CustomerDaoImpl implements GenericDao<Customer> {
	
	@Autowired
	private HibernateTemplate template;
	
	@Autowired
	private  Customer customer;
	
	

	public Customer add(Customer t) {
		// TODO Auto-generated method stub
		
		
		long key=(Long) template.save(t);
		Customer obj=null;
		if(key>0)
		{
			obj=t;
		}
		return obj;
	}

	public long update(Customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public Customer checkValidation(String userName,String passWord)
	{
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class); 
		criteria.add(Restrictions.eq("userName", userName)); 
		criteria.add(Restrictions.eq("passWord", passWord));
		List<Customer> customers=(List<Customer>) template.findByCriteria(criteria);
		Customer obj=null;
		for(Customer c:customers){
			 obj=c;
		}
		//System.out.println(user.toString());
		return obj;
	}

	@Override
	public Customer findById(long key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long delete(Customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
