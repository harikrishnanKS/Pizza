<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/style.css" rel="stylesheet" type="text/css">
<title>Checkout</title>
</head>
<body
style="background-image: url('resources/images/pizza.jpg'); background-size: cover;">


<h1 class="title">Your Bill...</h1>


<a href="logout"><input type="submit" value="Logout  "
style="color: white; background-color: navy; font-weight: bold; float: right;"></a>
<br>
<br>
<table class="checkout" cellpadding="20">
<tr class="check">
<th>Pizza name</th>
<th>Toppings</th>
<th>Extra for size</th>
<th>Total</th>
<th>Quantity</th>
</tr>

<c:forEach items="${allItems}" var="items">
<tr>
<c:forEach items="${pizzas}" var="pizza">
<c:if test="${pizza.pizzaId eq items.pizzaId}">

<td><c:out value="${pizza.pizzaName}"></c:out></td>
<td width="40px"><c:forEach items="${items.toppings}"
var="topping">
<c:forEach items="${toppings}" var="top">
<c:if test="${top.toppingId eq topping}">
*<c:out value="${top.toppingName}" />


</c:if>

</c:forEach>

</c:forEach></td>


</c:if>
</c:forEach>

<td><c:out value="${items.size}"></c:out></td>
<td><c:out value="${items.total}"></c:out></td>
<td><c:out value="${items.quantity}"></c:out></td>
</tr>
</c:forEach>



</table>
<br>
<br>
<strong style="color: darkcyan; font-size: 30px;">Total :
${sessionScope.gTotal}/-</strong>
<br>
<br>

<form action="confirm" method="post">


<input align='center' type="submit" value="Confirm"
style="color: white; background-color: navy; font-weight: bold;" />
</form>
<br>
<br>
<a href="reserve"><input type="submit" value="Reserve a Seat "
style="color: white; background-color: navy; font-weight: bold;"></a>






</body>
</html>






