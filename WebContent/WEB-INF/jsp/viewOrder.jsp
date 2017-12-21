<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="resources/css/styles.css" type="text/css" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<header style="background-image: url('resources/images/header1.jpg')">
   <h1 style="color:white">Pizza Hut</h1>
</header>
 
<body>
 
<br>
<br>
<br>
<br>
<h1>Your Order</h1>
<table>
<c:forEach items="${orderList}" var="order">
<tr>
<td><h5>Order ID:</h5></td>
<th>Image</th>
<th>Pizza name</th>
<th>Total</th>
<th>Quantity</th>
</tr>
<tr>
 
<td><h5></h5>
<c:out value="${order.orderId}"></c:out></</td>
<td><img alt="image" src="${order.pizza.pizzaUrl}"
height="100px" width="100px"></td>
<td><c:out value="${order.pizza.pizzaName}"></c:out></td>
<td style="text-align: center;"><c:out
value="${order.grandTotal}"></c:out></td>
<td style="text-align: center;"><c:out
value="${order.quantity}"></c:out></td>
 
</tr>
</c:forEach>
</table>
<h5>
Grand total: Rs.
<c:out value="${totalAmount}"></c:out>
</h5>
<form action="cancel" method="post">
<input name="getId" type="number" min=1 />
<button type="submit">Cancel Order</button>
</form>
</body>
</html>