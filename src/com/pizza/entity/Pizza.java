
package com.pizza.entity;

import org.springframework.stereotype.Component;

@Component
public class Pizza {

private long pizzaId;
private String pizzaName;
private double price;
private String type;
private String pizzaUrl;
 

public Pizza() {
super();
 
}


public Pizza(long pizzaId, String pizzaName, double price, String type, String pizzaUrl) {
super();
this.pizzaId = pizzaId;
this.pizzaName = pizzaName;
this.price = price;
this.type = type;
this.pizzaUrl = pizzaUrl;
}


public long getPizzaId() {
return pizzaId;
}


public void setPizzaId(long pizzaId) {
this.pizzaId = pizzaId;
}


public String getPizzaName() {
return pizzaName;
}


public void setPizzaName(String pizzaName) {
this.pizzaName = pizzaName;
}


public double getPrice() {
return price;
}


public void setPrice(double price) {
this.price = price;
}


public String getType() {
return type;
}


public void setType(String type) {
this.type = type;
}


public String getPizzaUrl() {
return pizzaUrl;
}


public void setPizzaUrl(String pizzaUrl) {
this.pizzaUrl = pizzaUrl;
}


@Override
public String toString() {
return "Pizza [pizzaId=" + pizzaId + ", pizzaName=" + pizzaName + ", price=" + price + ", type=" + type
+ ", pizzaUrl=" + pizzaUrl + "]";
}

 
 
}

