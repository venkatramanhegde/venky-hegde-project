<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    xmlns:th="http://www.thymeleaf.org">
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product page</title>
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
<body>
<form action="success3">

 <label><b> Product id </b></label>
  <input type="number" placeholder="Enter product id" name="Pid" required="required">
<!--  <input> type="number"  placeholder="Enter Id" Id="Id" required="required"> -->
<label><b>Product name</b></label>
    <input type="text" placeholder="Enter Product name" name="Pname" required="required">
    
<label><b>Product brand</b></label>
    <input type="text" placeholder="Enter Product brand" name="Pbrand" required="required">

<label><b>Product description</b></label>
    <input type="text" placeholder="Enter Product description" name="Pdesc" required="required">

<label><b>Product price</b></label>
    <input type="text" placeholder="Enter Product price" name="Pprice" required="required">
    <label><b>Product stock</b></label>
    <input type="text" placeholder="Enter Product stock" name="stock" required="required">
     <div class="form-group">
  <label class="col-md-4 control-label" for="pCategory" >Select Category</label>
  <div class="col-md-4">
    <select id="pCategory" class="form-control" name="pCategory">
      <c:forEach var="clist" items="${clist}">

                <option value="${clist.c_id}">${clist.c_name}</option>

            </c:forEach>
    </select>
  </div>
</div>
<br/>
<br/>
<div class="form-group">
  <label class="col-md-4 control-label" for="s_id" >Select Supplier</label>
  <div class="col-md-4">
    <select id="sid" class="form-control" name="pSuplier">
       <c:forEach var="slist" items="${slist}">

                <option value="${slist.s_id}">${slist.s_name}</option>
                 
                  </c:forEach>
                    </select>
  </div>
</div>
<br/>
<br/>
                  
                
    <div class="form-group">
      <label for="img">Upload Image:</label>
      <input type="file" id="img" name="file">
    </div>

<button type="submit">Submit</button>

</body>
</html>