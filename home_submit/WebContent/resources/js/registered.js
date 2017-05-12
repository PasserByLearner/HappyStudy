var xmlhttp;
$(function(){
	//得到焦点
	$("#password").focus(function(){
		$("#left_hand").animate({
			left: "150",
			top: " -38"
		},{step: function(){
			if(parseInt($("#left_hand").css("left"))>140){
				$("#left_hand").attr("class","left_hand");
			}
		}}, 2000);
		$("#right_hand").animate({
			right: "-64",
			top: "-38px"
		},{step: function(){
			if(parseInt($("#right_hand").css("right"))> -70){
				$("#right_hand").attr("class","right_hand");
			}
		}}, 2000);
	});
	//失去焦点
	$("#password").blur(function(){
		$("#left_hand").attr("class","initial_left_hand");
		$("#left_hand").attr("style","left:100px;top:-12px;");
		$("#right_hand").attr("class","initial_right_hand");
		$("#right_hand").attr("style","right:-112px;top:-12px");
	});
	$("#password2").focus(function(){
		$("#left_hand").animate({
			left: "150",
			top: " -38"
		},{step: function(){
			if(parseInt($("#left_hand").css("left"))>140){
				$("#left_hand").attr("class","left_hand");
			}
		}}, 2000);
		$("#right_hand").animate({
			right: "-64",
			top: "-38px"
		},{step: function(){
			if(parseInt($("#right_hand").css("right"))> -70){
				$("#right_hand").attr("class","right_hand");
			}
		}}, 2000);
	});
	//失去焦点
	$("#password2").blur(function(){
		$("#left_hand").attr("class","initial_left_hand");
		$("#left_hand").attr("style","left:100px;top:-12px;");
		$("#right_hand").attr("class","initial_right_hand");
		$("#right_hand").attr("style","right:-112px;top:-12px");
	});
});

function loadXMLDoc(url,cfunc)
{

	if(window.XMLHttpRequest)
		{
			xmlhttp=new XMLHttpRequest();	
		}
	else
		{
			xmlhttp = new ActiveXobject("Microsoft.XMLHTTP");
		}
	xmlhttp.onreadystatechange=cfunc;
	xmlhttp.open("Get",url,true);
	xmlhttp.send(null);
}
function load()
{
	//alert("xxxx");


var user=document.getElementById('student_id').value
var pass=document.getElementById('password').value
var pass2=document.getElementById('password2').value
var sex=document.getElementById('sex').value
var classname=document.getElementById('classname').value
var name=document.getElementById('name').value

if(user==""){alert("用户名不能为空");return}
if(pass==""){alert("密码不能为空");return}
if(pass2==""||pass2!=pass){alert("两次密码不一样");return}
if(name==""){alert("姓名不能为空");return}
if(classname==""){alert("班级名不能为空");return}
if(sex==""){alert("性别");return}

alert(user+":"+pass);

	
	loadXMLDoc("register?student_id="+user+"&password="+pass+"&name="+name+"&classname="+classname+"&sex="+sex,load1);
}
	


function load1()
{
	if(xmlhttp.readyState == 4&&xmlhttp.status ==200)
		{
		alert('处理完毕');
		var flag = xmlhttp.responseXML.getElementsByTagName( 
		 "flag")[0].firstChild.nodeValue;
	
		alert( flag );
		if( flag == "false" ){
			alert( "该学号已注册" );
		}
		else{
			alert("登录成功");
			window.location.href="main.jsp";
		}
		}
}