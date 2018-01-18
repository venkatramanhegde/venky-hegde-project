<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Login Form</title>

<script>
function validateForm()
{
	
var username=document.formLogin.j_username.value;
var passwrd=document.formLogin.j_password.value;

if(username==null ||username=="")
	{
	alert("Name cant be left blank");
	return false;
	}
else if(passwrod.length<6)
	{
	alert("Password must be atleast 6 character long");
	return false;
	}
}

</script>

</head>

<body style="background-color:white ">
<jsp:include page="header.jsp" />
<b><h2 align="center" style="color:MediumBlue ">Login Form</h2></b> 

<div class="container" style="padding:50px 0">
	
	<div class="l" style="background-color:white ">
	<c:url var="loginUrl" value="/spring_security_check" />
	
		<form id="login-form" name="formLogin" action="${loginUrl}"  method="post" class="text-left" onsubmit="return validateForm()">
			<div class="login-form-main-message"></div>
			<div class="main-login-form">
				<div class="login-group">
					<div class="form-group">
						<label for="username" class="sr-only" style="color:green">USERNAME</label>
						<input type="text" class="form-control" id="username" name="username" placeholder="enter username" >
					</div>
					<div class="form-group">
						<label for="password" class="sr-only" style="color:green">PASSWORD</label>
						<input type="password" class="form-control" id="password" name="password" placeholder="enter password">
					</div>

				</div>
				
				<div align="center">
				<input type="submit" name="submit" value="LOGIN" />
				</div>
			</div>
			 <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
			
		</form>
		</div>
		</div>
<jsp:include page="footer.jsp" />

</body>
</html>