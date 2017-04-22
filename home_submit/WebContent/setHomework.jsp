<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
java.util.Date currentTime = new java.util.Date();//得到当前系统时间
String str_date1 = formatter.format(currentTime); //将日期时间格式化 
char[] arr = str_date1.toCharArray();
arr[10] = 'T';
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>作业布置</title>
<link rel="stylesheet" type="text/css" href="<%= basePath %>resources/css/setHomework.css"/>
<link rel="stylesheet" type="text/css" href="<%= basePath %>resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="<%= basePath %>resources/css/all.css"/>
</head>
<body>
<img alt="" src="<%= basePath%>resources/images/setHomework.png" style="position:absolute;left:0px;top:0px;width:100%;height:100%;z-Index:-1; border:1px solid blue">
<div class="current" style="background-color:#c0c0c0;width:auto;height:34px;border: 1px solid #ccc;-webkit-box-shadow: 1px 1px 4px rgba(0,0,0, 0.1);-webkit-border-bottom-right-radius: 60px 5px;">当前位置：<a href="javascript:void(0)" style="color:#6E6E6E;">学生管理</a> &gt; 学生信息列表</div>
<div class="fillall">
	<div class="setForm">
		<form accept-charset="UTF-8" action="" class="file-commit-form manifest-commit-form js-file-commit-form js-manifest-commit-form" method="post">
			<div class="commit-form position-relative p-3 mb-2 border rounded-1">
				<h3 style="font-size:25px;">布置作业</h3>
				<label for="commit-summary-input" class="d-none"></label>
				<input id="commit-summary-input" name="name" type="text" class="form-control input-block input-contrast js-new-blob-commit-summary" placeholder="输入作业名称" autocomplete="off" />
				<label for="commit-description-textarea" class="d-none"></label>
				<textarea id="commit-description-textarea" name="description" class="form-control input-block input-contrast comment-form-textarea js-quick-submit" placeholder="添加作业描述(不超过200字)" style="resize:none;height:100px;" maxlength="200""></textarea>
				<label for="commit-datestart-input" class="d-none"></label>
				<input id="commit-datestart-input" name="start_time" type="datetime-local" class="form-control input-block input-contrast js-new-blob-commit-summary" value="<%= arr %>" min="<%= arr %>"/>
				<label for="commit-dateend-input" class="d-none"></label>
				<input id="commit-dateend-input" name="end_time" type="datetime-local" class="form-control input-block input-contrast js-new-blob-commit-summary" value="<%= arr %>" min="<%= arr %>"/>
			</div>
			<button type="submit" class="btn btn-primary js-blob-submit" data-edit-text="Commit changes" data-pull-text="Propose changes">作业布置提交</button>
			<a href="" class="btn btn-danger">取消</a>
		</form>
	</div>
	<div class="setForm_ribbon"></div>
</div>
</body>
</html>