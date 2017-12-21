package com.pizza.entity;

import java.util.Arrays;

public class OrderedItems 
{
private long orderId;
private long orderedItemId;
private Pizza pizza;
private Toppings toppings;
private long[] toppingsId;
private int quantity;
private double size;
private double grandTotal;
 
public OrderedItems() {
super();
// TODO Auto-generated constructor stub
}


 

public OrderedItems(long orderId, long orderedItemId, Pizza pizza, Toppings toppings, long[] toppingsId,
int quantity, double size, double grandTotal) {
super();
this.orderId = orderId;
this.orderedItemId = orderedItemId;
this.pizza = pizza;
this.toppings = toppings;
this.toppingsId = toppingsId;
this.quantity = quantity;
this.size = size;
this.grandTotal = grandTotal;
}




public long getOrderedItemId() {
return orderedItemId;
}

public void setOrderedItemId(long orderedItemId) {
this.orderedItemId = orderedItemId;
}

public Pizza getPizza() {
return pizza;
}

public void setPizza(Pizza pizza) {
this.pizza = pizza;
}

public Toppings getToppings() {
return toppings;
}

public void setToppings(Toppings toppings) {
this.toppings = toppings;
}

public long[] getToppingsId() {
return toppingsId;
}

public void setToppingsId(long[] toppingsId) {
this.toppingsId = toppingsId;
}

public int getQuantity() {
return quantity;
}

public void setQuantity(int quantity) {
this.quantity = quantity;
}

public double getSize() {
return size;
}

public void setSize(double size) {
this.size = size;
}

public double getGrandTotal() {
return grandTotal;
}

public void setGrandTotal(double grandTotal) {
this.grandTotal = grandTotal;
}


public long getOrderId() {
return orderId;
}


public void setOrderId(long orderId) {
this.orderId = orderId;
}




@Override
public String toString() {
return "OrderedItems [orderId=" + orderId + ", orderedItemId=" + orderedItemId + ", pizza=" + pizza
+ ", toppings=" + toppings + ", toppingsId=" + Arrays.toString(toppingsId) + ", quantity=" + quantity
+ ", size=" + size + ", grandTotal=" + grandTotal + "]";
}

 
 
 
}
