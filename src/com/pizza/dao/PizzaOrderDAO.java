package com.pizza.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pizza.entity.CartItem;
import com.pizza.entity.Customer;
import com.pizza.entity.Item;
import com.pizza.entity.ItemComponent;
import com.pizza.entity.Order;
import com.pizza.entity.Pizza;
import com.pizza.entity.Toppings;


@Repository
public class PizzaOrderDAO {
@Autowired
private Order order;
@Autowired
private HibernateTemplate template;
@Autowired
private Pizza pizza;
@Autowired
private Toppings topping;
@Autowired
private CustomerDaoImpl cDao;
@Autowired
private PizzaDao pizzaDao;
@Autowired
private ToppingDAO toppingDao;
public List<String> getSizes(){
List<String> sizes=new ArrayList<>();
sizes.add("small");
sizes.add("medium");
sizes.add("large");
return sizes;
}
public HashMap<Customer,List<CartItem>> addToCart(HashMap<Customer,List<CartItem>> items,CartItem item,Customer customerObj){
HashMap<Customer,List<CartItem>> cartItems=items;
List<CartItem> list=cartItems.get(customerObj);
Pizza pizzaObj=pizzaDao.findById(item.getPizzaId());
double total=pizzaObj.getPrice();
total=total+item.getSize();
for(int i:item.getToppings()){
Toppings t=toppingDao.findById(i);
total=total+t.getPrice();
}
total=total*item.getQuantity();
item.setTotal(total);
list.add(item);
cartItems.put(customerObj,list);
return cartItems;
}
public double calculateTotal(HashMap<Customer,List<CartItem>> items,Customer customerObj){
double gTotal=0.0;
List<CartItem> cartItems=items.get(customerObj);
for(CartItem cItem:cartItems){
gTotal=gTotal+cItem.getTotal();
}
return gTotal;
}
public boolean saveOrder(HashMap<Customer,List<CartItem>> items,Customer customerObj,double gTotal){
boolean status=false;
List<CartItem> list=items.get(customerObj);
HashSet<Item> cartItem=new HashSet<Item>();
Order order=new Order();
for(CartItem cItem:list){
Item item=new Item();
item.setPizzaId(cItem.getPizzaId());
item.setSize(cItem.getSize());
item.setPrice(cItem.getTotal());
item.setQuantity(cItem.getQuantity());
HashSet<ItemComponent> iComponent=new HashSet<ItemComponent>();
int [] noOfToppings=cItem.getToppings();
for(int i:noOfToppings){
ItemComponent ic=new ItemComponent();
ic.setToppingId((toppingDao.findById(i)).getToppingId()); 
ic.setPizzaId(cItem.getPizzaId());
iComponent.add(ic);
}
item.setItemComponent(iComponent);
cartItem.add(item);
}
Date d=new Date();
java.sql.Date orderDate=new java.sql.Date(d.getTime());
order.setCustomer(customerObj);
order.setItem(cartItem);
order.setOrderDate(orderDate);
order.setTotal(gTotal);

long key=(long) template.save(order);

System.out.println(order);
if(key>0) {
status=true;
}
return status;
}

}
