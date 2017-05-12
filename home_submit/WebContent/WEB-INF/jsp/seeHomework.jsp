<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<%= basePath %>resources/css/seeHomework.css"/>
<title>查看作业</title>
</head>
<body>
<img alt="" src="<%= basePath%>resources/images/seeHomework.jpg" style="position:absolute;left:0px;top:0px;width:100%;height:100%;z-Index:-1; border:1px solid blue">
	<div class="dt">
		<div class="dt1">
			<table width="600" cellspacing="1" cellpadding="1">
				<tbody>
					<tr>
						<td>作业名称:<span>${homework.name}</span></td>
					</tr>
					<tr>
						<td>开始时间:<span><fmt:formatDate value="${homework.start_time}" pattern="yyyy/MM/dd HH:mm:ss"/></span></td>
					</tr>
					<tr>
						<td>结束时间:<span><fmt:formatDate value="${homework.end_time}" pattern="yyyy/MM/dd HH:mm:ss"/></span></td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="dt2">
			<ul>
				<a href="upload.jsp"><li>上交作业</li></a>
				<a href="#"><li>返回</li></a>
			</ul>
		</div>
		<div class="dt3">
			<p class="setp">作业详情:</p>
			<p>${homework.description}</p>
		</div>
		<div class="dt_corner_lf"></div>
		<div class="dt_corner_rf"></div>
		<div class="dt_ribbon"></div>
	</div>
</body>
</html>