<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>chap12_main.jsp ������ �Դϴ�.</h1>

	<%-- 
	forward�� �ϸ� �ּҴ� main�״��, ������ sub�� ��ȯ
	<jsp:forward page="chap12_sub.jsp" /> --%>

	<% // sendRedirect�� �ϸ� String������ �ּҰ� �ٲ��!!
		response.sendRedirect("chap12_sub.jsp");
	%>
</body>
</html>