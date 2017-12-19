package com.pizza.entity;


	import java.util.Arrays;

	import org.springframework.stereotype.Controller;

	@Controller
	public class CartItem {

		
		private long  pizzaId;
		private int []toppings;
		private double size;
		
		private double total;
		private int quantity;
		public CartItem() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CartItem(long pizzaId, int[] toppings, double size, double total, int quantity) {
			super();
			this.pizzaId = pizzaId;
			this.toppings = toppings;
			this.size = size;
			this.total = total;
			this.quantity = quantity;
		}
		public long getPizzaId() {
			return pizzaId;
		}
		public void setPizzaId(long pizzaId) {
			this.pizzaId = pizzaId;
		}
		public int[] getToppings() {
			return toppings;
		}
		public void setToppings(int[] toppings) {
			this.toppings = toppings;
		}
		public double getSize() {
			return size;
		}
		public void setSize(double size) {
			this.size = size;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		@Override
		public String toString() {
			return "CartItem [pizzaId=" + pizzaId + ", toppings=" + Arrays.toString(toppings) + ", size=" + size
					+ ", total=" + total + ", quantity=" + quantity + "]";
		}
		
		
		
	}



