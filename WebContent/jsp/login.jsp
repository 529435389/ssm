<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>登陆测试</title>
<script src="<%=request.getContextPath() %>/static/js/jQuery.js"></script>
<script type="text/javascript">
function doLogin(){
	$.ajax({
		data:"username="+$("#username").val()+"&pwd="+$("#pwd").val(),
		dataType:"json",
		url:"<%=request.getContextPath() %>/user/doLogin",
		success:function(v){
			if(v.status=="0"){
				alert("登陆失败");
			}else{
				alert("登陆成功");
				window.location.href="";
			}
		}
	});
}
</script>
</head>
<body>
<input id="username" />
<input id="pwd" />
<button onclick="doLogin()">提交</button>
</body>
</html>