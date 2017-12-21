package com.pizza.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pizza.entity.Customer;
import com.pizza.entity.Item;
import com.pizza.entity.Order;
import com.pizza.entity.OrderedItems;
import com.pizza.ifaces.GenericDao;

@Repository
public class MyOrdersDao implements GenericDao<Order> {
@Autowired
private HibernateTemplate template;
@Autowired
private PizzaDao pizzaDao;
@Autowired
private ToppingDAO toppingDao;
@Autowired
private Order order;

@Override
public Order add(Order t) {
// TODO Auto-generated method stub
return null;
}

@Override
public Order findById(long t) {
// TODO Auto-generated method stub
return null;
}

@Override
public List<Order> findAll() {
List<Order> order = null;
order = (List<Order>) template.loadAll(Order.class);
return order;

}

@Override
public long update(Order t) {
// TODO Auto-generated method stub
return 0;
}

 
public void orderDelete(long key)
{

Order order=new Order();
order.setOrderId(key);
template.delete(order);
System.out.println("Deleted");
}
 
 
private Set<Long> orderId=new HashSet<Long>();
 
public List<OrderedItems> findOrderByCustomer(Customer orderedCustomer) 
{
long customerId = orderedCustomer.getCustomerId();
System.out.println("customer ID:" + orderedCustomer);
System.out.println("\n\nIN IMplimentation" + orderedCustomer);
 
Date orderedDate=new Date();
DetachedCriteria criteria = DetachedCriteria.forClass(Order.class);
criteria.add(Restrictions.eq("customer", orderedCustomer));
criteria.add(Restrictions.eq("orderDate", orderedDate));
 
List<Order> orderList = (List<Order>) template.findByCriteria(criteria);
System.out.println(orderList);
HashSet<Order> setOfOrders = new HashSet<Order>(orderList);
System.out.println(setOfOrders);
List<Order> listOfOrders = new ArrayList(setOfOrders);
List<OrderedItems> orderedItemsList = new ArrayList<OrderedItems>();
for (Order o : listOfOrders)
{
 
 
for (Item it : o.getItem()) 
{
OrderedItems ordered = new OrderedItems();
ordered.setOrderId(o.getOrderId());
ordered.setOrderedItemId(it.getItemId());
ordered.setPizza(pizzaDao.findById(it.getPizzaId()));
 
System.out.println(ordered.getPizza());
 
ordered.setSize(it.getSize());
ordered.setQuantity(it.getQuantity());
ordered.setGrandTotal(it.getPrice());
orderedItemsList.add(ordered);
}
}
System.out.println("In Order Dao:" + orderedItemsList);
return orderedItemsList;
}
public Set<Long> getOrderdId()
{
return orderId;
}
@Override
public long delete(Order t) {
// TODO Auto-generated method stub
return 0;
}

}
