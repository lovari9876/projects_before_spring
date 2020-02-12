<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>request_send</title>
</head>
<body>

	<%!int age;%>

	<%
		// 인터넷에서 넘어온 모든 text는 string 즉, 문자열이므로
		// 숫자로 쓰려면 int로 바꿔줘야 해
		String str = request.getParameter("age");
		age = Integer.parseInt(str);

		if (age >= 20)
			// response 객체의 URL 이동하는 sendRedirect() 메소드 사용
			// url주소는 String location
			response.sendRedirect("pass.jsp?age=" + age);
		else
			response.sendRedirect("ng.jsp?age=" + age);
	%>

</body>
</html>