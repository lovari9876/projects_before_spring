<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		// Enumeration은 iterator의 예전 버전이다..
		Enumeration enumeration = session.getAttributeNames();
		while (enumeration.hasMoreElements()) {
			String sName = enumeration.nextElement().toString();
			String sValue = (String) session.getAttribute(sName);

			if (sValue.equals("abcde"))
				out.println(sValue + "님 안녕하세요." + "<br />");
		}
	%>

	<a href="Logout.jsp">로그아웃</a>

</body>
</html>