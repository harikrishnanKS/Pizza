<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('resources/images/back3.jpg'); background-size: cover;">
<body>
<form:form action="reserve" method="post" commandName="ReservationCommand">
<label>Customer Id:</label>
${sessionScope.customer.customerId }
<br>

<label>Number Of seats</label>
<br>
<form:select path="numberOfSeats" items="${numberOfSeats}"/>
<br>
<label>Date:</label>
<br>
<form:input path="date" type="Date" min="${currentDate }"  value="${currentDate }"/>
<br>

<input type="submit" value="submit"/>

<label></label>


</form:form>


</body>
</html>