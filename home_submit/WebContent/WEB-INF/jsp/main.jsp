<%@ page language="java" import="com.ll.bean.Student" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>网站首页</title>
        <link rel="stylesheet" href="<%= basePath %>resources/css/normalize.css">
        <link rel="stylesheet" href="<%= basePath %>resources/css/font-awesome.css">
        <link rel="stylesheet" href="<%= basePath %>resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="<%= basePath %>resources/css/templatemo-style.css">
        <link rel="stylesheet" type="text/css" href="<%= basePath %>resources/css/seeHomework.css"/>
        <script src="<%= basePath %>resources/js/vendor/modernizr-2.6.2.min.js"></script>
<style type="text/css">

table {
    *border-collapse: collapse; /* IE7 and lower */
    border-spacing: 0;
    width: 100%;
    background-color: white;    
}

.bordered {
    border: solid #ccc 1px;
    -moz-border-radius: 6px;
    -webkit-border-radius: 6px;
    border-radius: 6px;
    -webkit-box-shadow: 0 1px 1px #ccc; 
    -moz-box-shadow: 0 1px 1px #ccc; 
    box-shadow: 0 1px 1px #ccc;         
}

.bordered tr:hover {
    background: #fbf8e9;
    -o-transition: all 0.1s ease-in-out;
    -webkit-transition: all 0.1s ease-in-out;
    -moz-transition: all 0.1s ease-in-out;
    -ms-transition: all 0.1s ease-in-out;
    transition: all 0.1s ease-in-out;     
}    
    
.bordered td, .bordered th {
    border-left: 1px solid #ccc;
    border-top: 1px solid #ccc;
    padding: 10px;
    text-align: left;    
}

.bordered th {
    background-color: #dce9f9;
    background-image: -webkit-gradient(linear, left top, left bottom, from(#ebf3fc), to(#dce9f9));
    background-image: -webkit-linear-gradient(top, #ebf3fc, #dce9f9);
    background-image:    -moz-linear-gradient(top, #ebf3fc, #dce9f9);
    background-image:     -ms-linear-gradient(top, #ebf3fc, #dce9f9);
    background-image:      -o-linear-gradient(top, #ebf3fc, #dce9f9);
    background-image:         linear-gradient(top, #ebf3fc, #dce9f9);
    -webkit-box-shadow: 0 1px 0 rgba(255,255,255,.8) inset; 
    -moz-box-shadow:0 1px 0 rgba(255,255,255,.8) inset;  
    box-shadow: 0 1px 0 rgba(255,255,255,.8) inset;        
    border-top: none;
    text-shadow: 0 1px 0 rgba(255,255,255,.5); 
}

.bordered td:first-child, .bordered th:first-child {
    border-left: none;
}

.bordered th:first-child {
    -moz-border-radius: 6px 0 0 0;
    -webkit-border-radius: 6px 0 0 0;
    border-radius: 6px 0 0 0;
}

.bordered th:last-child {
    -moz-border-radius: 0 6px 0 0;
    -webkit-border-radius: 0 6px 0 0;
    border-radius: 0 6px 0 0;
}

.bordered th:only-child{
    -moz-border-radius: 6px 6px 0 0;
    -webkit-border-radius: 6px 6px 0 0;
    border-radius: 6px 6px 0 0;
}

.bordered tr:last-child td:first-child {
    -moz-border-radius: 0 0 0 6px;
    -webkit-border-radius: 0 0 0 6px;
    border-radius: 0 0 0 6px;
}

.bordered tr:last-child td:last-child {
    -moz-border-radius: 0 0 6px 0;
    -webkit-border-radius: 0 0 6px 0;
    border-radius: 0 0 6px 0;
}


</style>
</head>
<body>
  
        <div class="responsive-header visible-xs visible-sm">
            <div class="container">
                <div class="row">
                    
                </div>
                <a href="#" class="toggle-menu"><i class="fa fa-bars"></i></a>
                <div class="main-navigation responsive-menu">
                    <ul class="navigation">
                        <li><a href="#top"><i class="fa fa-home"></i>Home</a></li>
                        <li><a href="#about"><i class="fa fa-user"></i>About Me</a></li>
                        <li><a href="#projects"><i class="fa fa-newspaper-o"></i>My Gallery</a></li>
                        <li><a href="#contact"><i class="fa fa-envelope"></i>Contact Me</a></li>
                    </ul>
                </div>
            </div>
        </div>
		
        <!-- SIDEBAR -->
        <div class="sidebar-menu hidden-xs hidden-sm">
            <div class="top-section">
                              <div class="profile-image">
                                <img src="<%= basePath %>resources/images/profile.jpg" alt="Volton">
                            </div>
                            <div class="profile-content">
                                <h3 class="profile-title">${sessionScope.name}</h3>
                                <p class="profile-description">${sessionScope.id}</p>
                            </div>
            </div> <!-- top-section -->
            <div class="main-navigation">
                <ul class="navigation">
                    <li><a href="#top"><i class="fa fa-globe"></i>Welcome</a></li>
                    <li><a href="#about"><i class="fa fa-pencil"></i>About Me</a></li>
                    <li><a href="#projects"><i class="fa fa-paperclip"></i>My Gallery</a></li>
                    <li><a href=""><i class="fa fa-link"></i>退出登录</a></li>
                </ul>
            </div> <!-- .main-navigation -->
            
        </div> <!-- .sidebar-menu -->
        
		<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >免费模板</a></div>
        	<!-- MAIN CONTENT -->
        <div class="banner-bg" id="top">
       <h2 style="color:white; margin-left:500px; font-size:35px;float: clear;">
                近期布置作业</h2>
<table class="bordered">
    <thead> 
    <tr>
        <th>编号</th>        
        <th>作业描述</th>
        <th>作业开始时间</th>
        <th>作业结束时间</th>
        <th>操作</th>
    </tr>
    </thead>
    <c:forEach items="${homeworkList}" var="homework" varStatus="status">
								   <tr>
									<td>${homework.homeWork_id}</td>
									<td>${homework.name}</td>
									<td>
     			    				<fmt:formatDate value="${homework.start_time}" pattern="yyyy-MM-dd HH:mm:ss"/>
     			    			     </td>
									<td>
     			    				<fmt:formatDate value="${homework.end_time}" pattern="yyyy-MM-dd HH:mm:ss"/>
     			    			    </td>
     			    			    <td>
     			    			    <a href="${basePath}SeeDetail.action?id=${homework.homeWork_id}">查看详情</a>
     			    			    </td>
								</tr>
	</c:forEach>
   </table>

     <div class="dt2">
			<ul>
				<a href="setHomework.jsp" ><li>布置作业</li></a>
				<a href="<%=basePath %>/servlet/ListFileServlet"><li>作业提交情况</li></a>
			</ul>
		</div>
      </div>

        
        
</body>
</html>