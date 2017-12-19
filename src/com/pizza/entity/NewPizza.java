package com.pizza.entity;

import org.springframework.stereotype.Component;

@Component
public class NewPizza {
	private long pizzaId;
	private int totalSeats;
	private int availableSeats;
	public NewPizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewPizza(long pizzaId, int totalSeats, int availableSeats) {
		super();
		this.pizzaId = pizzaId;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
	}
	public long getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(long pizzaId) {
		this.pizzaId = pizzaId;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	@Override
	public String toString() {
		return "NewPizza [pizzaId=" + pizzaId + ", totalSeats=" + totalSeats + ", availableSeats=" + availableSeats
				+ "]";
	}
	

}
