<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<title>Insert title here</title>
</head>
<body>
<form action="viewReserved" >
Reserved Seats
<table>
<tr>
<th>Reservation Id</th>
<th>No of seats booked</th>
<th>Date</th>

</tr>
<c:forEach items="${customerReservation}" var="reservation">
<tr>

<td><c:out value="${reservation.reservationId}" /></td>
<td><c:out value="${reservation.numberOfSeats}" /></td>
<td><c:out value="${reservation.date}" /></td>
   
</tr>
</c:forEach>
</table>

</form>
<div style="align:center"><a href="login1" class="btn btn-primary btn-lg">Go Back to login page!</a></div>
 

</body>
</html>
>