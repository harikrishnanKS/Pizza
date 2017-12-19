package com.pizza.entity;

import org.springframework.stereotype.Component;

@Component
public class Toppings {

private double price;
private String toppingName;
private long toppingId;
public Toppings() {
super();
// TODO Auto-generated constructor stub
}
public Toppings(double price, String toppingName, long toppingId) {
super();
this.price = price;
this.toppingName = toppingName;
this.toppingId = toppingId;
}
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;
}
public String getToppingName() {
return toppingName;
}
public void setToppingName(String toppingName) {
this.toppingName = toppingName;
}
public long getToppingId() {
return toppingId;
}
public void setToppingId(long toppingId) {
this.toppingId = toppingId;
}
@Override
public String toString() {
return "Toppings [price=" + price + ", toppingName=" + toppingName + ", toppingId=" + toppingId + "]";
}
}


