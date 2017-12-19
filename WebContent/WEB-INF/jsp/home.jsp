<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body style="margin-left: 25px;margin-right: 25px;margin-top: 10px">
<a href="reserve">RESERVE SEATS</a>
<div class="row">
<div class="col-sm-9">${customer.customerName}</div>
<div class="col-sm-3" style="float:right;">
	<form action="proceedToCheckOut" method="post">
		<input type="submit" value="Proceed To CheckOut">
	</form>

</div>
</div>
	
	<%-- 
	<c:forEach items="${sessionScope.pizzas}" var="pizza">


					<form action="addToCart" method="post" >
				
				
				<c:out value="${ pizza.pizzaName}"></c:out>
				<br> Price:Rs.
				<c:out value="${ pizza.basePrice}/- "></c:out>
				<br>
				<div class="row">
					<div class="col-sm-1">
						small <br> <input type="radio" name="size" value="small">
						<br> + Rs.0/-
					</div>
					<div class="col-sm-1">
						Medium <br> <input type="radio" name="size" value="medium">
						<br> + Rs.25/-
					</div>
					<div class="col-sm-1">
						Large <br> <input type="radio" name="size" value="large">
						<br> + Rs.50/-
					</div>
				</div>	
				
				
				
					<c:forEach items="${sessionScope.toppings}" var="topping">
						<br>${topping.toppingName}:
						<input type="checkbox" name="${topping.toppingId}">+ Rs.${topping.price}/-
					</c:forEach>
				
			</form>
			
			
			 <form:form action="addToCart" method="post" modelAttribute="item" >
				
				
				<c:out value="${ pizza.pizzaName}"></c:out><br> 
				Price:Rs.<c:out value="${ pizza.basePrice}/- "></c:out>
				<form:radiobuttons path="size" items="${sessionScope.toppings}"></form:radiobuttons>
				<form:checkboxes path="toppings" itemLabel="x" itemValue="1" items="${sessionScope.toppings}"></form:checkboxes>
				
				
			</form:form>
			 
			 --%>

	<%-- <form:form action="addToCart" method="post">

			<form:hidden path="pizzaId" value="${pizza.pizzaId}" />
			<c:out value="${ pizza.pizzaName}"></c:out>
			<br> Price:Rs.
				<c:out value="${ pizza.basePrice}/- "></c:out>
			<br>
			<div class="row">
				<div class="col-sm-1">
					small <br>
					<form:radiobutton path="size" value="small"></form:radiobutton>
					<br> + Rs.0/-
				</div>
				<div class="col-sm-1">
					Medium <br>
					<form:radiobutton path="size" value="medium"></form:radiobutton>
					<br> + Rs.25/-
				</div>
				<div class="col-sm-1">
					Large <br>
					<form:radiobutton path="size" value="large"></form:radiobutton>
					<br> + Rs.50/-
				</div>
			</div>



			<c:forEach items="${sessionScope.toppings}" var="topping">
				<br>${topping.toppingName}:
				<form:checkbox value="${topping.toppingId}" path="toppings" />
				
			</c:forEach>
			<form:input path="quantity" />
			<input type="submit" value="AddToCart">
		</form:form>	  --%>
<div class="row">

	<c:forEach items="${sessionScope.pizzas}" var="pizza">
		<div class="col-lg-6"
		 style="float:left;
		 border-style: solid;
		 border-color: coral;
		 padding-left: 5px;padding-top: 10px">
			
			
			<form:form action="addToCart" method="post">

				<form:hidden path="pizzaId" value="${pizza.pizzaId}" />
				<c:out value="${ pizza.pizzaName}"></c:out>
				<br>
				<img alt="pizza1" src="${pizza.pizzaUrl}" height="200px" width="200">
				<br>
				<br> Price:Rs.
				<c:out value="${ pizza.price}/- "></c:out>
				<br>

				<%-- 	<form:radiobutton path="size"  items="${sessionScope.sizes}"/> --%>

				<div class="row">
					<div class="col-sm-2">
						small <br>
						<form:radiobutton path="size" value="0"></form:radiobutton>
						<br> + Rs.0/-
					</div>
					<div class="col-sm-2">
						Medium <br>
						<form:radiobutton path="size" value="25"></form:radiobutton>
						<br> + Rs.25/-
					</div>
					<div class="col-sm-2">
						Large <br>
						<form:radiobutton path="size" value="50"></form:radiobutton>
						<br> + Rs.50/-
					</div>
				</div>


				<c:forEach items="${sessionScope.toppings}" var="topping">
					<br>${topping.toppingName}:
				<form:checkbox value="${topping.toppingId}" path="toppings" />${topping.price}
				
			</c:forEach>
			<div style="float:right;">
			Qty:<form:input path="quantity" type="number" value="1" min="1"
					max="100" />
			<input type="submit" value="AddToCart">
			</div>
				
			</form:form>



		</div>
	</c:forEach>
</div>

</body>
</html>