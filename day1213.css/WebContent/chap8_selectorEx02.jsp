<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>
#content {
width:300px;
}

ul li {
list-style-type: none;
border: 1px solid #cccccc;
padding: 10px; 
background-color: #efefef;
font-weight: bold;
font-size: 20px;
}

ul li a {
color: #000000;
}

ul li:nth-child(2n+1) {
background-color: #de9393;
}

ul li:first-child, ul li:last-child {
background-color: yellow;
}

/* 모서리 둥글게 만들기: 왼쪽 상단부터 시계방향으로~~ */
ul li:first-child {
border-radius: 10px 10px 0 0;
}

ul li:last-child {
border-radius: 0 0 10px 10px;
}
</style>
</head>

<body>
	<div id="content">
		<ul>
		<%
		for (int i=1; i<=8; i++)
			out.println("<li><a href=\"#\">menu"+ i +"</a></li>");	
		%>	
		</ul>
	</div>
</body>
</html>