<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mobile collection store</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
  <script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="./resources/css/Details.css" rel="stylesheet" type="text/css"/>
  <link href="./resources/css/adding.css" rel="stylesheet" type="text/css"/>
  <script>
function sum() {
      var txtFirstNumberValue = document.getElementById('txt1').value;
      var txtSecondNumberValue = document.getElementById('txt2').value;
      var result = parseInt(txtFirstNumberValue) * parseInt(txtSecondNumberValue);
      if (!isNaN(result)) {
         document.getElementById('txt3').value = result;
      }
}
</script>
 
  
  
  
 <style>.carousel-inner > .item > img { width:100%; height:350px; } 
                       h2
						    {
						      color: green;
						    }
 </style>
 <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet"/>
</head>
<br>
</head>

<body style="background-color:white  ">
	
	<%--  <jsp:include page="header.jsp" /> --%>	
	<div class="container-fluid">		
			<div class="col-md-12 product-info">
					<ul id="myTab" class="nav nav-tabs nav_tabs">
						
						<h2>DESCRIPTION </h2>
						
						<!-- <li><a href="#service-three" data-toggle="tab">REVIEWS</a></li> --> 
					<p>	Samsung Galaxy J7 Prime has a metal body and a 5.5-inch 2.5D glass display that comes with 1920x1080 pixels resolution and Gorilla Glass 4. 
						It is powered by a 1.6 GHz octa-core processor,
						 which is paired with 3GB RAM and 32GB internal storage.
						 An expandable storage slot is there for a micro SD card of up-to 256 GB capacity. 
						The smartphone runs on Android 6.0 Marshmallow operating system and also offers a fingerprint scanner, which is integrated into the home button. 
						The Galaxy J7 Prime has a 3300 mAh battery and comes with S Bike mode.
						 To activate S Bike mode, all you have to do is attach an NFC tag,
						 which comes bundled with the phone, with your bike (like on the petrol tank)</p>
					</ul>
				
					
				</div>
				<hr>
				
    <div class="container-fluid">
    <div class="content-wrapper">	
		<div class="item-container">	
			<div class="container">	
				<div class="col-md-12">
					<div class="product col-md-3 service-image-left">
                    <br>
                    <br>
						<center>
<img id="item-display" src="src/main/webapp/images/sammblpic.jpg${product.p_image}" alt="" width="150" height="150"></img>
						</center>
					</div>
					 <h2> SPECIFICATION</h2>	
				<p>	 OS 	Android
RAM 	3 GB
Item Weight	145 g
Product Dimensions	15.3 x 4.9 x 8.4 cm
Batteries:	1 Lithium ion batteries required. (included)
Item model number	Galaxy J7 Prime
Wireless communication technologies 	Bluetooth, WiFi Hotspot
Connectivity technologies 	WiFi, EGDE, 4G LTE, 3G
Special features 	Dual SIM, E-mail
Other camera features 	8MP
Form factor	Touchscreen Phone
Weight 	145 Grams
Colour 	Gold
Battery Power Rating 	330
Whats in the box 	Handset, Battery, Charger and User Manual </p>
				</div>
					
					<hr>
					<div class="btn-group cart">
						<input type="submit" class="btn btn-success" value="ADDCART"/>
						
					</div>
					</form>
					<div class="btn-group wishlist">
					<a href="Viewcart">
						  <button type="button" class="btn btn-danger">View Cart </button>
					</a>
                                      </div>
                                      <div>In Stock</div>	
				</div>
				<div class="col-md-7">
				<div class="product-title">${product.p_name}</div>
				
					<div class="product-rating"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star-o"></i> </div>
					<hr>
					<form action="productdetails">
				
					<input type="hidden"  name="prodid" value="${product.p_id}"  onkeyup="sum();"/><br>
					ProductPrice:
					<input type="text" id="txt1" name="prodprice" value="${product.p_price}" readonly onkeyup="sum();"/><br>
					ProductQuantity:<input type="text" id="txt2" name="prodquantity" value="" onkeyup="sum();"/>
					
					TotalPrice:<input type="text"  id="txt3" name="pricetot" value=""/>
					</div>
					
			</div> 
		<!-- <h2> REVIEWS </h2> -->
			</div>
		</div>
		
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	
		<!-- <li><a href="#service-three" data-toggle="tab">REVIEWS</a></li>  -->
		<p>   </p>
	<jsp:include page="footer.jsp" />

</body>
</html>