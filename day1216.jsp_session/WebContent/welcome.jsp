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
		// Enumeration�� iterator�� ���� �����̴�..
		Enumeration enumeration = session.getAttributeNames();
		while (enumeration.hasMoreElements()) {
			String sName = enumeration.nextElement().toString();
			String sValue = (String) session.getAttribute(sName);

			if (sValue.equals("abcde"))
				out.println(sValue + "�� �ȳ��ϼ���." + "<br />");
		}
	%>

	<a href="Logout.jsp">�α׾ƿ�</a>

</body>
</html>