<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <title>Insert title here</title> -->
<title>REGISTRAION PAGE</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      height:200px;
  }
  
 

 
  @media (max-width: 400px) {
    .carousel-caption {
      display: none; 
    }
  }
  
 form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password],input[type=email],input[type=number] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 30%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 12px 0 12px 0;
}


.container {
    padding: 8px;
}

span.psw {
    float: right;
    padding-top: 8px;
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
</head>
<body style="background-color:Maroon  ">
<%-- <jsp:include page="index.jsp" /> --%>


<form action="success">

  <div class="container-fluid">
  
  
  


 <label><b> id </b></label>
  <input type="number" placeholder="Enter id" name="id" required="required">
<!--  <input> type="number"  placeholder="Enter Id" Id="Id" required="required"> -->
    <label><b>name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required="required">
     <label><b>password</b></label>
    <input type="password" placeholder="Enter Password" name="password" maxlength="10" title="enter valid password" required="required" >
      <label><b>email</b></label>
    <input type="email" placeholder="Enter email" name="email" required="required" >
    
  <!--    <label><b>age</b></label>
    <input type="number" placeholder="Enter Age" age="age"  pattern="[18-99]" title="enter age between 18-99" required="required" >
    -->
	  <label><b> rol </b></label>
  <input type="text" placeholder="Enter roll number" name="rol" required="required">
 < label><b>adress</b></label><br>
    <textarea rows="4" cols="112" name="adress"></textarea>
  	
     <label><b>phone</b></label>
      <input type="text" placeholder="Enter Phone-Number" name="phone" maxlength="16" pattern="/^+91(7\d|8\d|9\d)\d{9}$/" title="enter valid number" required="required">
      
     <button type="submit">Login</button>
      
  </div>
</form>
<br/>
<br/>
<br/>
<br/>
<jsp:include page="footer.jsp" />

</body>
</html>