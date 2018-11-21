<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title> Check Out, Web Store</title>
<meta name="keywords" content="free template,  ecommerce, online shopping, store" />
<meta name="description" content=" Check Out, free template for ecommerce websites." />
<link href="../css/templatemo_style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="../css/orman.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../css/nivo-slider.css" type="text/css" media="screen" />

<link rel="stylesheet" type="text/css" href="../css/ddsmoothmenu.css" />

<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/ddsmoothmenu.js"></script>

<script type="text/javascript">

ddsmoothmenu.init({
	mainmenuid: "templatemo_menu", //menu DIV id
	orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
	classname: 'ddsmoothmenu', //class added to menu's outer DIV
	//customtheme: ["#1c5a80", "#18374a"],
	contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
})

function clearText(field)
{
    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;
}

</script>

</head>

<body>

<div id="templatemo_wrapper_sp">
<div id="templatemo_header_wsp">
	<div id="templatemo_header" class="header_subpage">
    	<div id="site_title"><a href="/" rel="nofollow">Free CSS Templates</a></div>
        <div id="templatemo_menu" class="ddsmoothmenu">
            <ul>
                <li><a href="/">首页</a></li>
                <li><a href="/about">关于</a></li>
                <li><a href="/page/products">花种</a>
                    
                </li>
                <li><a href="/checkout" class="selected">付款</a></li>
                <li><a href="/contact">相关</a></li>
                <li><a href="faqs.jsp">联系</a></li>
            </ul>
            <div id="templatemo_search">
                <form action="#" method="get">
                  	<input type="text" value="Site Search" name="keyword" id="keyword" title="keyword" 
                  			onfocus="clearText(this)" onblur="clearText(this)" class="txt_field" />
                  	<input type="submit" name="Search" value="" alt="Search" id="searchbutton" title="Search" class="sub_btn" />
                </form>
            </div>
            <br style="clear: left" />
        </div> 
</div> <!-- END of header wrapper -->
<div id="templatemo_main_wrapper">
<div id="templatemo_main">
	<div id="sidebar" class="left">
    	<div class="sidebar_box"><span class="bottom"></span>
            <h3>Categories</h3>   
            <div class="content"> 
                <ul class="sidebar_list">
                  <jsp:include page="common/formLogin.jsp" />
                </ul>
            </div>
        </div>
        <div class="sidebar_box"><span class="bottom"></span>
            <h3>Weekly Special</h3>   
            <div class="content special"> 
                <img src="../images/templatemo_image_01.jpg" alt="Flowers" />
                <a href="#">Citrus Burst Bouquet</a>
                <p>
                	Price:
                    <span class="price normal_price">$160</span>&nbsp;&nbsp;
                    <span class="price special_price">$100</span>
                </p>
            </div>
        </div>
    </div>
    
    <div id="content" class="right">
    	<h2>Checkout</h2>
        
		<h3>BILLING DETAILS</h3>
          <form action="/order/create" method="post">
            <div class="content_half left form_field">     
				<p>用户昵称：</p>
                <p>${sessionScope.get('userLogin').username}</p> 
                <input type="hidden" value="${sessionScope.get('userLogin').username}" name="username"/>
                <p>地址:</p>
      			 <input name="address" type="text" id="address" maxlength="40" />
                 <p>  城市:</p> 
               <input name="city" type="text" id="city" maxlength="40" /> 
                 <p>国籍:</p>
                <input name="country" type="text" id="country" maxlength="40" />
            </div>
            
            <div class="content_half right form_field">
            	<p>Email:</p>
			  <p>${sessionScope.get('userLogin').email}</p> 
			  <input type="hidden" value="${sessionScope.get('userLogin').email}" name="email"/>
                Phone:<br />
                <input name="phone" type="text" id="phone" maxlength="40" />
                <span>Please, specify your reachable phone number to call you for a verification.</span>
            </div>
          <c:set var="totalprice" value="0"></c:set>
          <c:set var="number" value="0"></c:set>
           <c:forEach items="${Itemcart}" var="cart" varStatus="status">
               <c:set var="totalprice"  value="${ (cart.flowerprice * cart.num)}"/>
               <%-- <c:set var="number"  value="${ number + cart.num}"/> --%>
               <input type="hidden" name="orderitemsLists[${status.index}].flowername" value="${cart.flowername }"/>  
               <input type="hidden" name="orderitemsLists[${status.index}].number" value="${cart.num}"/>  
               <input type="hidden" name="orderitemsLists[${status.index}].totalprice" value="${totalprice}"/>     
            </c:forEach>
            <div class="cleaner h40"></div>
            
			<p><input type="submit" value="付款"/>
            </form>
            <div class="blank_box">
        	    <a href="#"><img src="../images/free_shipping.jpg" alt="Free Shipping" /></a>
        	</div>    
        
    </div>
    
    <div class="cleaner"></div>
</div> <!-- END of main -->
</div> <!-- END of main wrapper -->

<div id="templatemo_footer_wrapper">
<div id="templatemo_footer">
	<div class="footer_left">
    	<a href="#"><img src="../images/1311260370_paypal-straight.png" alt="Paypal" /></a>
        <a href="#"><img src="../images/1311260374_mastercard-straight.png" alt="Master" /></a>
        <a href="#"><img src="../images/1311260374_visa-straight.png" alt="Visa" /></a>
    </div>
	<div class="footer_right">
		<p>
						Copyright &copy; 2017.Company name All rights reserved.<a
							target="_blank" href="classpath:index.jsp">毕业设计</a>
		</p>
	</div>
    <div class="cleaner"></div>
</div> <!-- END of footer -->
</div> <!-- END of footer wrapper -->
</div>

</body>
<script type='text/javascript' src='../js/logging.js'></script>
</html>