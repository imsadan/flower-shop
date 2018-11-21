<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:choose>
	<c:when test="${not empty sessionScope.get('userLogin')}">
		<li>欢迎用户${sessionScope.get('userLogin').username}成功登录<a
			href="/user/exit">[退出]</a>|
		</li>
		<li id="headerLogout" class="headerLogout" style="display: list-item;"><a
			href="/checkout/${sessionScope.get('userLogin').uid}">我的订单</a>|</li>
	</c:when>
	<c:otherwise>
		<form id="formlogin" method="post" onsubmit="return false;">
			<p>
				用户名:<input type="text" name="username" id="loginname">
			</p>

			<p>
				&nbsp;&nbsp;&nbsp;密码:<input type="password" name="password"
					id="nloginpwd">
			</p>

			<p>
			<center>
				<input type="submit" value="登录" id="loginsubmit">
			</center>
			</p>
			<p>
				<a href="page/userRegist">无账号?点击进行注册</a>
			</p>
		</form>
	</c:otherwise>

</c:choose>
<script type="text/javascript">
/*      setTimeout(function () {
          if (!$("#loginname").val()) {
            $("#loginname").get(0).focus();
             }
         }, 0); */
         
  var redirectUrl = "${redirect}";      
  var LOGIN = {
			checkInput:function() {
				if ($("#loginname").val() == "") {
					alert("用户名不能为空");
					$("#loginname").focus();
					return false;
				}
				if ($("#nloginpwd").val() == "") {
					alert("密码不能为空");
					$("#nloginpwd").focus();
					return false;
				}
				return true;
			},doLogin:function() {
				$.post("/user/login", $("#formlogin").serialize(),function(data){
					if (data.status == 200) {
						alert("登录成功！");
						if (redirectUrl == "") {
							location.href = "http://localhost:8081";
						} else {
							location.href = redirectUrl;
						}
					} else {
						alert("登录失败，原因是：" + data.msg);
						$("#loginname").select();
					}
				});
			},
			login:function() {
				if (this.checkInput()) {
					this.doLogin();
				}
			}
		
	};
	$(function(){
		$("#loginsubmit").click(function(){
			LOGIN.login();
		});
	});
 </script>