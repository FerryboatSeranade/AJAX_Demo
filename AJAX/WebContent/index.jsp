<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function judge(){
			var xmlhttp;
			if(window.XMLHttpRequest){
				xmlhttp=new XMLHttpRequest();
			}else{
				xmlhttp=new ActiveXObject("microsoft.XMLHTTP");
			}
			var userName=document.getElementsByName("userName")[0].value;
			var password=document.getElementsByName("password")[0].value;
			
			xmlhttp.onreadystatechange=function(){
				if (xmlhttp.readyState==4 && xmlhttp.status==200){
					//提供返回内容的场所
					document.getElementById("span").innerHTML=xmlhttp.responseText;
			    }
			}
			//提交请求
			xmlhttp.open("post","login.do?userName="+userName+"&password="+password,false);
			xmlhttp.send("aaaaaaaaa");
		}
	</script>
</head>
<body>
	<form method="post" action="login.do">
		用户名：<input type="text" name="userName">
		密码：<input type="password" name="password">
		<p><span id="span"></span></p>
		<input type="button" value="提交" onclick="judge()">
	</form>
	
</body>
</html>