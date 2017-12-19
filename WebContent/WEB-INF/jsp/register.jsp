<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<link rel="stylesheet" href="resources/css/style.css" type="text/css" />
<body
	style="background-image: url('resources/images/back2.jpg'); background-size: cover;">

	<title>Insert title here</title>
</head>
<script>
function validateform(){  
  
var passWord=document.myform.passWord.value;  
  
var confirmPassword=document.myform.confirmPassword.value; 


  


if(passWord==confirmPassword){  
return true;  
}  
else{  
alert("password must be same!");  
return false;  
}
}  

</script>
<body>
<h1 style=color:white>Registration Details</h1>
<br>
<br>
	<form:form action="register" method="post"
		onsubmit="return validateform()">
		<table>
			<tr>
				<td><label><span style="color: white">Customer
							Name:</span></label></td>
				<td><form:input path="customerName" pattern="[a-zA-Z].{3,20}"
						title="4 to 20 characters" /></td>
			</tr>
			<tr>
				<td><label><span style="color: white">MobileNumer:</span></label></td>
				<td><form:input path="phoneNumber" pattern="[0-9]{10}"
						title="Enter a vaild mobile number" /></td>
			</tr>
			<tr>
				<td><label><span style="color: white">AddressLine1</span></label></td>
				<td><form:input path="address.addressLine1" /></td>
			</tr>
			<tr>
				<td><label><span style="color: white">AddressLine2</span></label></td>
				<td><form:input path="address.addressLine2" /></td>
			</tr>
			<tr>
				<td><label><span style="color: white">City:</span></label></td>
				<td><form:input path="address.city" /></td>
			</tr>
			<tr>
				
				<td><label><span style="color: white">PinCode:</span></label></td>
				<td><form:input path="address.pinCode" pattern="[0-9]{6}"
						title="Enter 6 digit pincode" /></td>
			</tr>
			<tr>
				<td><label><span style="color: white">UserName:</span></label></td>
				<td><form:input path="userName" pattern="[a-zA-Z].{3,10}"
						title="4 to 10 characters" /><br></td>
			</tr>
			<tr>
				<td><label><span style="color: white">PassWord:</span></label></td>
				<td><form:input path="passWord" /></td>
			</tr>
			<tr>
				<td><label><span style="color: white">Confirm
							PassWord:</span></label></td>
				<td><input type="password" name="confirmPassword"></td>
			</tr>
		</table>
		<div >
		<input type="submit" value="register">
		</div>

	</form:form>



</body>
</html>