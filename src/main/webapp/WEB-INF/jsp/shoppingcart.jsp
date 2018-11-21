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
<title> Shopping Cart</title>
<meta name="keywords" content="free template, shopping cart, floral, ecommerce, online, store" />
<meta name="description" content="Floral, Shopping Cart, free template for ecommerce websites." />
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
                <li><a href="/checkout">付款</a></li>
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
    	<h2>Shopping Cart</h2>
		<table width="700" border="0" cellpadding="5" cellspacing="0">
          	<tr bgcolor="#395015">
                <th width="168" align="left">样式</th> 
                <th width="188" align="left">花名</th> 
                <th width="60" align="center">数量</th> 
                <th width="80" align="right">单价</th> 
                <th width="80" align="right">总价</th> 
                <th width="64"> 操作</th>
          	</tr>
          	<c:set var="totalPrice" value="0"></c:set>
          	<c:forEach items="${Itemcart}" var="cart">
          	<c:set var="totalPrice"  value="${ totalPrice + (cart.flowerprice * cart.num)}"/>
            <tr bgcolor="#41581B">
                <td><img src="${cart.image}" id="picImgs" /></td>
                <td>${cart.flowername }</td> 
                <td align="center">
                <div class="num1" data-bind="">
		           <a href="javascript:void(0);" class="decrement" clstag="clickcart|keycount|xincart|diminish1" id="decrement">-</a>
		           <input type="text" class="text1" flowerprice="${cart.flowerprice}" flowerid="${cart.flowerid}" value="${cart.num }" id="buttonNum" />
		           <a href="javascript:void(0);" class="increment" clstag="clickcart|keycount|xincart|add1" id="increment">+</a>
		         </div>
                <td align="right">${cart.flowerprice}元</td> 
                <td align="right">${cart.flowerprice * cart.num }</td>
                <td align="center"> <a href="/cart/delete/${cart.flowerid }"><img src="../images/remove.png" alt="remove" /><br />Remove</a> </td>
            </tr>
            </c:forEach>
            <tr bgcolor="#41581B">
                <td colspan="3">Have you modified item quantities? Please <a href="/cart/check"><strong>Update</strong></a> the Cart.&nbsp;&nbsp;</td>
                <td align="right">总计:</td>
                 <td align="right">
                  <span class="totalSkuPrice">${totalPrice}元</span>
                 
                </td>
                <td> </td>
            </tr>
            
        </table>
		<div class="cleaner h20"></div>
        <div class="right"><a href="/checkout" class="button">checkout</a></div>
        <div class="cleaner h20"></div>
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
							target="_blank" href="/">毕业设计</a>
					</p>
	</div>
    <div class="cleaner"></div>
</div> <!-- END of footer -->
</div> <!-- END of footer wrapper -->
</div>

</body>
<script type='text/javascript' src='../js/logging.js'></script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
<script>
var TTCart = {
	load : function(){ // 加载购物车数据
		
	},itemNumChange : function(){
		$(".increment").click(function(){//＋
			var _thisInput = $(this).siblings("input");
			_thisInput.val(eval(_thisInput.val()) + 1);
			$.post("/add/"+_thisInput.attr("flowerid") + "?num=1",function(data){
				TTCart.refreshTotalPrice();
			});
		});
		$(".decrement").click(function(){//-
			var _thisInput = $(this).siblings("input");
			if(eval(_thisInput.val()) == 1){
				return ;
			}
			_thisInput.val(eval(_thisInput.val()) - 1);
			$.post("/add/"+_thisInput.attr("flowerid") + "?num=-1",function(data){
				TTCart.refreshTotalPrice();
			});
		});
		$(".num1 .text1").rnumber(1);//限制只能输入数字
		$(".num1 .text1").change(function(){
			var _thisInput = $(this);
			$.post("/update/"+_thisInput.attr("flowerid")+"/"+_thisInput.val(),function(data){
				TTCart.refreshTotalPrice();
			}); 
		}); 
	},
	refreshTotalPrice : function(){ //重新计算总价
		var total = 0;
		$(".num1 .text1").each(function(i,e){
			var _this = $(e);
			total += (eval(_this.attr("flowerprice")) * 10000 * eval(_this.val())) / 10000;
		});
		
	}
};

$(function(){
	TTCart.load();
	TTCart.itemNumChange();
});
</script>
</html>