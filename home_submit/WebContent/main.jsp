<%@ page language="java" import="com.ll.bean.Student" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
out.println("登录成功");
out.println("用户名");


Student s = (Student)session.getAttribute("student");  
String name = s.getName();
out.println(name);
%>
</body>
</html>