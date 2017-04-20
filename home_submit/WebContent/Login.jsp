<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">  
<head>  
    <meta charset="UTF-8">  
    <title>Login</title>  
    <link rel="stylesheet" type="text/css" href="<%= basePath %>resources/css/Login.css"/>  
</head>  
<body>  
    <div id="login">  
        <h1>学生登录</h1>  
        <form method="post">  
            <input type="text" required="required" placeholder="学号" name="u"></input>  
            <input type="password" required="required" placeholder="密码" name="p"></input>
            <a href="">学生注册</a>  
            <button class="but" type="submit">登录</button>  
        </form>  
    </div>  
</body>  
</html>  