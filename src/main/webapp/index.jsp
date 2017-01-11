<%@ page language="java"  contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
<h2>Hello World!</h2>
没有添加依赖之前只是一个普通的页面
<a href="${pageContext.request.contextPath}/login">hello
</a>
 <form action="login" method="post">
 用户名：<input name="username" type="text" /><br/>
 密码：<input name="password" type="password" /><br/>
 <input type="submit" value="提交" />
 </form>
</body>
</html>
