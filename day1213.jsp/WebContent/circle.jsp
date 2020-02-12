<%@ page import="edu.bit.ex.Circle"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
	Circle c = new Circle();
	%>
	원의 넓이는 <%= c.getCircleArea(10) %>
		
</body>
</html>