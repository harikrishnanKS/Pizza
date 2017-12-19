package com.pizza.entity;


import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Item {

	private long itemId;
	private long pizzaId;
	private Set<ItemComponent> itemComponent;
	private double size;
	private double price;
	private int quantity;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(long itemId, long pizzaId, Set<ItemComponent> itemComponent, double size, double price, int quantity) {
		super();
		this.itemId = itemId;
		this.pizzaId = pizzaId;
		this.itemComponent = itemComponent;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public long getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(long pizzaId) {
		this.pizzaId = pizzaId;
	}
	public Set<ItemComponent> getItemComponent() {
		return itemComponent;
	}
	public void setItemComponent(Set<ItemComponent> itemComponent) {
		this.itemComponent = itemComponent;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", pizzaId=" + pizzaId + ", itemComponent=" + itemComponent + ", size=" + size
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
