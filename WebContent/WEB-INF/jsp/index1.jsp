<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<body style="background-image: url('resources/images/back1.jpg'); background-size: cover;">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
div.heading{
font-variant:normal;
color:green;
text-align:center;
}
div.RegisterLink
{
}


form {
   
}

input[type=text], input[type=password] {
    width: 80%;
    padding: 5px 6px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    
}

input[type=submit]:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}

</style>
<body>
<h1 style="color:white; text-align: center;">Online pizza Delivery</h1>
<div class="heading">
<h1>  </h1>
</div>
<div class="LoginForm">
<form action="login" method="post">
<table>
<tr>
<td>


<label><span style="color:white">USER NAME:</span></label></td>
<td><input type="text" name="userName"></td>

<td> 
<label><span style="color:white">PASSWORD:</span></label></td>
<td><input type="password" name="passWord"></td>
<td><input type="submit" value="login"></td>
</tr>
</table>



</form>
</div>

<div class="RegisterLink">
<br>
<br>
<br>

<a href="register"><span style="color:white">New User</span></a>
</div>
<div>
${cust}
${errormsg}
</div>
</body>
</html>