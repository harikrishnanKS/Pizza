package com.pizza.entity;


import java.sql.Date;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Order {

	private long orderId;
	private Customer customer;
	private Set<Item> item;
	private Date orderDate;
	private double total;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(long orderId, Customer customer, Set<Item> item,Date orderDate ,double total) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.item = item;
		this.orderDate = orderDate;
		this.total = total;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Set<Item> getItem() {
		return item;
	}
	public void setItem(Set<Item> item) {
		this.item = item;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", item=" + item + ", orderDate=" +orderDate
				+ ", total=" + total + "]";
	}
	
	
	
}
