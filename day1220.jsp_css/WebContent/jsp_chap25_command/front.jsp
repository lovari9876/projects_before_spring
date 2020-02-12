<!-- url pattern 중 확장자 패턴 예제!! -->

<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="insert.do">insert</a>
	<hr />

	<a href="http://Localhost:8282<%=request.getContextPath()%>/update.do">update</a>
	<hr>

	<a
		href="http://Localhost:8282/day1220.jsp+css/jsp_chap25_command/select.do">select</a>
	<hr>

	<a href="<%=request.getContextPath()%>/delete.do">delete</a>
</body>
</html>