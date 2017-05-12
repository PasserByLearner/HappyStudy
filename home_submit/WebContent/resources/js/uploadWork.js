 function upload(){
    	var content = document.getElementById("keyword");
    	
    	xmlHttp = createXMLHttp();
    	//要给服务器发送数据
    	var url="search?keyword="+escape(content.value);
    	//true表示javascript脚本会在send（）之后继续执行，而不会等待来自服务器的响应
    	xmlHttp.open("GET",url,true);
    	xmlHttp.onreadystatechange = callback;
    	xmlHttp.send(null);
    	
    }
function createXMLHttp(){
	//大多数浏览器适用
	var xmlHttp;
	if(window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest();
	}
	//浏览器兼容性
	if(window.ActiveXObject){
	  xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	  if(!xmlHttp){
		  xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
	  }
	}
	return xmlHttp;
}
function callback(){
	if(xmlHttp.readyState == 4){
		if(xmlHttp.status == 200){
			//交互成功获得相应数据是文本格式
			var result = xmlHttp.responseText;
			var json = eval("("+result+")");
			//获得数据之后显示数据
			setContent(json);
		}
			
	}
}