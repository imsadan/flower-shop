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
<title>Products, Online Shopping</title>
<meta name="keywords"
	content="free template,  ecommerce, online shopping, store" />
<meta name="description"
	content=" Products, free website template for ecommerce shopping websites." />
<link href="../css/templatemo_style.css" rel="stylesheet"
	type="text/css" />

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


</head>

<body>

	<div id="templatemo_wrapper_sp">
		<div id="templatemo_header_wsp">
			<div id="templatemo_header" class="header_subpage">
				<div id="site_title">
					<a href="/" rel="nofollow">Free CSS Templates</a>
				</div>
				<div id="templatemo_menu" class="ddsmoothmenu">
					<ul>
						<li><a href="/">首页</a></li>
						<li><a href="/about">关于</a></li>
						<li><a href="/page/products" class="selected">花种</a>
						</li>
						<li><a href="/checkout">付款</a></li>
						<li><a href="/contact">相关</a></li>
						<li><a href="/faqs">联系</a></li>
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
									<img src="../images/templatemo_image_01.jpg" alt="Flowers" />
									<a href="#">Citrus Burst Bouquet</a>
									<p>
										Price: <span class="price normal_price">$160</span>&nbsp;&nbsp;
										<span class="price special_price">$100</span>
									</p>
								</div>
							</div>
						</div>

						<div id="content" class="right">
							<h2>Products</h2>
							<p>
								Cras aliquam, mi nec imperdiet volutpat, ligula est consequat
								odio, eu auctor urna augue eu quam. Lorem ipsum dolor sit amet,
								consectetur adipiscing elit. Duis bibendum nec nunc ac
								hendrerit. Morbi lacinia placerat diam sit amet fringilla.
								Integer accumsan suscipit suscipit. Mauris non nunc sit amet
								turpis pharetra mattis. Validate 
							</p>
							<!-- <h5><p>点击首页可显示查看列表</p></h5> -->
							<c:forEach items="${requestScope.pagemsg.lists}" var="f">				
									<div class="product_box">
										<a href="/productdetail/${f.flowerid}"><img
											src="${f.image}" alt="floral set 1" id="picImgs" /></a>
										<p>${f.flowername}</p>
										<p>花语：${f.flowerlanguage}</p>
										<p class="product_price">${f.flowerprice}元</p>
										<p class="add_to_cart">
											<a href="/productdetail/${f.flowerid}">Detail</a> <a
												href="/shopCart/${f.flowerid}">Add to Cart</a>
										</p>
									</div>
								</c:forEach>
								<center>
								 <table border="0" cellspacing="0" cellpadding="0" width="900px">
									<tr>
										<td class="td2"><span>第${requestScope.pagemsg.currPage }/
												${requestScope.pagemsg.totalPage}页</span>&nbsp;&nbsp; <span>总记录数：${requestScope.pagemsg.totalCount }&nbsp;&nbsp;每页显示:${requestScope.pagemsg.pageSize}</span>&nbsp;&nbsp;
											<span> <c:if
													test="${requestScope.pagemsg.currPage != 1}">
													<a
														href="${pageContext.request.contextPath }/page/products?currentPage=1">[首页]</a>&nbsp;&nbsp;
                                                    <a
														href="${pageContext.request.contextPath }/page/products?currentPage=${requestScope.pagemsg.currPage-1}">[上一页]</a>&nbsp;&nbsp;
                                                   </c:if> <c:if
													test="${requestScope.pagemsg.currPage != requestScope.pagemsg.totalPage}">
													<a
														href="${pageContext.request.contextPath }/page/products?currentPage=${requestScope.pagemsg.currPage+1}">[下一页]</a>&nbsp;&nbsp;
           <a
														href="${pageContext.request.contextPath }/page/products?currentPage=${requestScope.pagemsg.totalPage}">[尾页]</a>&nbsp;&nbsp;
       </c:if>
										</span></td>
									</tr>
								</table>
								</center>						
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
							<div class="footer_left">
								<a href="#"><img
									src="../images/1311260370_paypal-straight.png" alt="Paypal" /></a>
								<a href="#"><img
									src="../images/1311260374_mastercard-straight.png" alt="Master" /></a>
								<a href="#"><img
									src="../images/1311260374_visa-straight.png" alt="Visa" /></a>
							</div>
							<div class="footer_right">
								<p>
						Copyright &copy; 2017.Company name All rights reserved.<a
							target="_blank" href="/">毕业设计</a>
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
<div style="display:none">
</div>
</html>