<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home</title>
<meta name="keywords"
	content="free template,  ecommerce, online shopping, store" />
<meta name="description"
	content="Floral Shop is free website template for ecommerce or online shopping websites. Products, Shopping Cart, FAQs and Checkout pages are included." />
<link href="../css/templatemo_style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="../css/orman.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="../css/nivo-slider.css" type="text/css"
	media="screen" />

<link rel="stylesheet" type="text/css" href="../css/ddsmoothmenu.css" />

<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/ddsmoothmenu.js"></script>
<script type="text/javascript">
	ddsmoothmenu.init({
		mainmenuid : "templatemo_menu", //menu DIV id
		orientation : 'h', //Horizontal or vertical menu: Set to "h" or "v"
		classname : 'ddsmoothmenu', //class added to menu's outer DIV
		//customtheme: ["#1c5a80", "#18374a"],
		contentsource : "markup" //"markup" or ["container_id", "path_to_menu_file"]
	})

	function clearText(field) {
		if (field.defaultValue == field.value)
			field.value = '';
		else if (field.value == '')
			field.value = field.defaultValue;
	}
</script>

<link rel="stylesheet" href="../css/slimbox2.css" type="text/css"
	media="screen" />
<script type="text/JavaScript" src="../js/slimbox2.js"></script>


</head>

<body>

	<div id="templatemo_wrapper_h">
		<div id="templatemo_header_wh">
			<div id="templatemo_header" class="header_home">
				<div id="site_title">
					<a href="/" rel="nofollow">Free CSS
						Templates</a>
				</div>
				<div id="templatemo_menu" class="ddsmoothmenu">
					<ul>
						<li><a href="/" class="selected">首页</a></li>
						<li><a href="/about">关于</a></li>
						<li><a href="/page/products">花种</a>
						</li>
						<li><a href="/checkout">付款</a></li>
						<li><a href="/contact">相关</a></li>
						<li><a href="faqs.jsp">联系</a></li>
					</ul>
					<div id="templatemo_search">
						<form action="#" method="get">
							<input type="text" value="Site Search" name="keyword"
								id="keyword" title="keyword" onfocus="clearText(this)"
								onblur="clearText(this)" class="txt_field" /> <input
								type="submit" name="Search" value="" alt="Search"
								id="searchbutton" title="Search" class="sub_btn" />
						</form>
					</div>
					<br style="clear: left" />
				</div>
          
				<div class="slider-wrapper theme-orman">
					<div class="ribbon"></div>
					<div id="slider" class="nivoSlider">
					<c:forEach items="${AdvList}" var="adv" begin="0" end="3">
						<img src="${adv.image }" alt="" id="advPic"/> 
					</c:forEach>	
					</div>
					<div id="htmlcaption" class="nivo-html-caption">
						<strong>Example</strong> caption with <a
							href="http://sc.chinaz.com" rel="nofollow">a credit link</a> for
						<em>this slider</em>.
					</div>
				</div>
				<script type="text/javascript" src="../js/jquery-1.6.1.min.js"></script>
				<script type="text/javascript" src="../js/jquery.nivo.slider.pack.js"></script>
				<script type="text/javascript">
					$(window).load(function() {
						$('#slider').nivoSlider({
							controlNav : false
						});
					});
				</script>
			</div>
			<!-- END of header -->
		</div>
		<!-- END of header wrapper -->
		<div id="templatemo_main_wrapper">
			<div id="templatemo_main">
				<div id="sidebar" class="left">
					<div class="sidebar_box">
						<span class="bottom"></span>
						<h3>Categories</h3>
						<div class="content">
							<ul class="sidebar_list">
							   <jsp:include page="common/formLogin.jsp" />
							</ul>
						</div>
					</div>
					<div class="sidebar_box">
						<span class="bottom"></span>
						<h3>Weekly Special</h3>
						<div class="content special">
							<img src="../images/templatemo_image_01.jpg" alt="Flowers" /> <a
								href="#">Citrus Burst Bouquet</a>
							<p>
								Price: <span class="price normal_price">$160</span>&nbsp;&nbsp;
								<span class="price special_price">$100</span>
							</p>
						</div>
					</div>
				</div>

				<div id="content" class="right">

					<h2>Welcome to Floral Shop</h2>
					<p>
						Floral Shop is a free template provided by <a
							href="http://sc.chinaz.com" rel="nofollow">templatemo</a>. Sed in
						suscipit risus, eget consectetur justo. Praesent lacinia, nisi
						quis commodo consectetur, diam magna laoreet felis, a pulvinar
						mauris enim in felis. Phasellus in mauris velit. In pellentesque
						massa in nisl auctor pellentesque. Donec fermentum convallis
						purus, id luctus nulla tempus in. Aliquam diam nibh, consectetur
						quis fringilla facilisis, egestas sed odio. Validate <a
							href="http://sc.chinaz.com/??check?uri=referer" rel="nofollow"><strong>XHTML</strong></a>
						&amp; <a href="http://sc.chinaz.com/??css-validator/check/referer"
							rel="nofollow"><strong>CSS</strong></a>.
					</p>
					<c:forEach items="${pageFlower}" var="f" begin="0" end="7">
						<div class="product_box">
							<a href="/productdetail/${f.flowerid}"><img src="${f.image}"
								alt="floral set 1" id="picImgs" /></a>
							<p>${f.flowername}</p>
							<p>花语：${f.flowerlanguage}</p>
							<p class="product_price">${f.flowerprice}元</p>
							<p class="add_to_cart">
								<a href="/productdetail/${f.flowerid}">Detail</a> <a
									href="/shopCart/${f.flowerid}">Add to Cart</a>
							</p>
						</div>
					</c:forEach>
					<div class="blank_box">
						<a href="#"><img src="../images/free_shipping.jpg"
							alt="Free Shipping" /></a>
					</div>
				</div>
				<div class="cleaner"></div>
			</div>
			<!-- END of main -->
		</div>
		<!-- END of main wrapper -->

		<div id="templatemo_footer_wrapper">
			<div id="templatemo_footer">

				<div class="footer_right">
					<p>
						Copyright &copy; 2017.Company name All rights reserved.<a
							target="_blank" href="classpath:index.jsp">毕业设计</a>
					</p>
				</div>
				<div class="cleaner"></div>
			</div>
			<!-- END of footer -->
		</div>
		<!-- END of footer wrapper -->
	</div>

</body>
<script type='text/javascript' src='../js/logging.js'></script>
</html>