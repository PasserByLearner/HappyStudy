<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<HTML 
xmlns="http://www.w3.org/1999/xhtml">
<HEAD><META content="IE=11.0000" 
http-equiv="X-UA-Compatible">
 
<META http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<TITLE>注册页面</TITLE> 
<link rel="stylesheet" type="text/css" href="<%= basePath %>resources/css/2_0.css"/>
<SCRIPT src="<%= basePath %>resources/js/jquery-1.9.1.min.js" type="text/javascript"></SCRIPT>
 <STYLE>


</STYLE>
 <SCRIPT src="<%= basePath %>resources/js/registered.js" type="text/javascript"></SCRIPT>    

 
<META name="GENERATOR" content="MSHTML 11.00.9600.17496"></HEAD> 
<BODY>
 <DIV class="top_div2">
<h1>学生注册</h1>
</DIV>
<DIV style="background: rgb(255, 255, 255); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231); border-image: none; width: 400px; height: 310px; text-align: center;">
<DIV style="width: 165px; height: 150px; position: absolute;">
<DIV class="tou"></DIV>
<DIV class="initial_left_hand" id="left_hand"></DIV>
<DIV class="initial_right_hand" id="right_hand"></DIV></DIV>
<form name=" form2" action="register" method = "POST"></form>
<P style="padding: 30px 0px 10px; position: relative;"><SPAN 
class="u_logo"></SPAN>         <INPUT class="ipt" id = "student_id" type="number" placeholder="请输入用户名/学号" value=""> 
    </P>
<P style="padding: 0px 0px 10px; position: relative;"><SPAN class="p_logo"></SPAN>         
<INPUT class="ipt" id="password" type="password" placeholder="请输入密码" value="">   
  </P>
<P style="padding: 0px 0px 10px; position: relative;"><SPAN class="p_logo"></SPAN>         
<INPUT class="ipt" id="password2" type="password" placeholder="请再次输入密码" value="">   
  </P>
  <P style="padding: 0px 0px 10px; position: relative;"><SPAN class="p_logo"></SPAN>         
<INPUT class="ipt" id="name" type="text" placeholder="请输入姓名" value="">   
  </P>
  <P style="padding: 0px 0px 10px; position: relative;"><SPAN class="p_logo"></SPAN>         
<INPUT class="ipt" id="classname" type="text" placeholder="请输入班级" value="">   
  </P>
   <P style="padding: 0px 0px 10px; position: relative;"><SPAN class="p_logo"></SPAN>         
<INPUT class="ipt" id="sex" type="text" placeholder="请输入性别" value="">   
  </P>
<DIV style="height: 20px; line-height: 0px; margin-top: 20px; border-top-color: rgb(231, 231, 231); border-top-width: 1px; border-top-style: solid;">
<P style="margin: 0px 35px 0px 45px;">
           <SPAN style="float:center;"><A style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;" 
href="javascript:load()">注册</A> 
             
           </SPAN>         </P></DIV></DIV>
		  

</div></BODY></HTML>
