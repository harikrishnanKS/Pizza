package com.pizza.entity;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class ItemComponent {

	private long ItemComponentId;
	private long pizzaId;
	private long toppingId;
	private double price;
	public ItemComponent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemComponent(long itemComponentId, long pizzaId, long toppingId, double price) {
		super();
		ItemComponentId = itemComponentId;
		this.pizzaId = pizzaId;
		this.toppingId = toppingId;
		this.price = price;
	}
	public long getItemComponentId() {
		return ItemComponentId;
	}
	public void setItemComponentId(long itemComponentId) {
		ItemComponentId = itemComponentId;
	}
	public long getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(long pizzaId) {
		this.pizzaId = pizzaId;
	}
	public long getToppingId() {
		return toppingId;
	}
	public void setToppingId(long toppingId) {
		this.toppingId = toppingId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ItemComponent [ItemComponentId=" + ItemComponentId + ", pizzaId=" + pizzaId + ", toppingId=" + toppingId
				+ ", price=" + price + "]";
	}
	
	
	
}
