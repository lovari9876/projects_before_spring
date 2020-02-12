<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>chap12_main.jsp 페이지 입니다.</h1>

	<%-- 
	forward로 하면 주소는 main그대로, 내용은 sub를 반환
	<jsp:forward page="chap12_sub.jsp" /> --%>

	<% // sendRedirect로 하면 String값으로 주소가 바뀐다!!
		response.sendRedirect("chap12_sub.jsp");
	%>
</body>
</html>