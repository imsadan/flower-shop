<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
  <head>
      <link type="text/css" rel="stylesheet" href="../css/style.css" />
      <script type="text/javascript" src="../js/jquery-1.6.4.js"></script>
    <title>注册页面</title>
    <style type="text/css">
       .nc{
          border:1px 
       }
       span{
          font-size:12px;
       }
       .change1{
            color:#aaa;
       }
       .change2{
            color:#000;
       }
       .change3{
           color:red;
       }
       .change4{
            color:green;
       }
    
    </style>
    
  </head>
  
  <body>
  <%
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.flushBuffer();
	%>
   <section class="container">
    <div class="login">
      <h1>VIP会员注册</h1>
      <form id="personRegForm" method="post" onsubmit="return false;" onsubmit="return sub('click')">
        <p>用户名:<input type="text" name="username" value="" id="regName">
        <span class="change1">请输入6-20位中文，英文或数字</span>
        <p>密码:<input type="password" name="password" value="" id="pwd">
        <span class="change1">请输入6-15位英文或数字</span>
        <p>确认密码:<input type="password" name="password2" value="" id="pwdRepeat">
        <span class="change1">重新输入密码</span>
        <p>邮箱:<input type="text" name="email" value="" id="email">
        <span class="change1">请输入邮箱</span></p>
      <p><center><input type="submit" name="submit" value="注册" onclick="REGISTER.reg();"/></center>
      </form>
     </div>
   </section>
<script>
/*        //获取下一个span                
      function getspan(obj){
         while(true){
           if(obj.nextSibling.nodeName!="SPAN"){
               obj=obj.nextSibling;
           }else
               return obj.nextSibling;
         }
      }
      //click是一个状态， 分清楚是单击提交按，还是失去焦点
      function check(obj,info,fun,click){
          var span=getspan(obj);
          //对焦
          obj.onfocus=function(){
              span.innerHTML=info;
              span.className="change2";
         }
     
          //失焦
          obj.onblur=function(){
              if(fun(this.value)){
                  span.innerHTML="输入正确";
                  span.className="change4";
              }else{
                  span.innerHTML=info;
                  span.className="change3";
              }
          
          }
          
          if(click=="click")
             obj.onblur();
      }
      
      //页面加载完自动调用
      onload=sub;

     //一个函数，可以使用onsubmit调用， 也可以使用onload调用
  function sub(click){
  
   var stat=true;
   
       var username=document.getElementsByName("username")[0];
	   var password1=document.getElementsByName("password")[0];
	   var password2=document.getElementsByName("password2")[0];
	   var email=document.getElementsByName("email")[0];
	   //obj为username
	   check(username,"请输入4-15位中文，英文或数字",function(val){
	      //此时的val就是输入的值，对应username
	      if(val.match(/^\S+$/) && val.length >=4 && val.length <=15){
	            return true;
	      }else{
	          stat=false;
	          return false;
	      }
	   
	   },click);
	   
	   check(password1, "密码必须在6-15位之间", function(val){
		if(val.match(/^\S+$/) && val.length >=6 && val.length <=15){
			return true;
		}else{
			stat=false;
			return false;
		}
	}, click);

	check(password2, "确定密码要和上面一致，规则也要相同", function(val){
		if(val.match(/^\S+$/) && val.length >=6 && val.length <=15 && val==password1.value){
			return true;
		}else{
			stat=false;
			return false;
		}
	}, click)

	
	check(email, "要按邮箱规则输入", function(val){
		if(val.match(/\w+@\w+\.\w/)){
			return true;
		}else{
			stat=false;
			return false;
		}
	}, click)
	
	
	return stat;
	
  }    */
    
 var REGISTER={
	param:{
			//单点登录系统的url
			surl:""
      },
		 inputcheck:function(){
				//不能为空检查
				if ($("#regName").val() == "") {
					alert("用户名不能为空");
					$("#regName").focus();
					return false;
				}
				if ($("#pwd").val() == "") {
					alert("密码不能为空");
					$("#pwd").focus();
					return false;
				}
				if ($("#email").val() == "") {
					alert("邮箱不能为空");
					$("#email").focus();
					return false;
				}
				//密码检查
				if ($("#pwd").val() != $("#pwdRepeat").val()) {
					alert("确认密码和密码不一致，请重新输入！");
					$("#pwdRepeat").select();
					$("#pwdRepeat").focus();
					return false;
				}
				return true;
		}, 
		beforeSubmit:function() {
				//检查用户是否已经被占用
				$.ajax({
	            	url : REGISTER.param.surl + "/user/check/"+escape($("#regName").val())+"/1?r=" + Math.random(),
	            	success : function(data) {
	            		if (data.data) {
	            			//检查是否存在
	            			$.ajax({
	            				url : REGISTER.param.surl + "/user/check/"+$("#email").val()+"/2?r=" + Math.random(),
				            	success : function(data) {
				            		if (data.data) {
					            		REGISTER.doSubmit();
				            		} else {
				            			alert("此邮箱已经被注册！");
				            			$("#email").select();
				            		}
				            	}
	            			});
	            		} else {
	            			alert("此用户名已经被占用，请选择其他用户名");
	            			$("#regName").select();
	            		}	
	            	}
				});
	            	
		},
		doSubmit:function() {
			$.post("/user/register",$("#personRegForm").serialize(), function(data){
				if(data.status == 200){
					alert('用户注册成功！');
					REGISTER.login();
				} else {
					alert("注册失败！");
				}
			});
		},
		login:function() {
			 location.href = "http://localhost:8081";
			 return false;
		},
		reg:function() {
				if (this.inputcheck()) {
				this.beforeSubmit();
			}
		}
	};
</script>    

  </body>
</html>