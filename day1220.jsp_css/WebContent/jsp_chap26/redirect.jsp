<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<hr>
	<%
	request.setAttribute("id", "abcdeffff");
	request.setAttribute("pw", "123");
	
	response.sendRedirect("RequestObj");
	%>
</body>
</html>