<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%!String id, pw;%>

	<%
		id = request.getParameter("id");
		pw = request.getParameter("pw");

		if (id.equals("abcde") && pw.equals("12345")) {
			// session�� ���尴ü
			session.setAttribute("id", id); // name, value

			
		} else {
			response.sendRedirect("login.html");
		}
	%>

</body>
</html>