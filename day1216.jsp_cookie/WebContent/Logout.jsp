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
		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getValue().equals("abcde")) {
					// id = abcde인 쿠키 삭제
					cookies[i].setMaxAge(0);
					response.addCookie(cookies[i]);
					// 유효시간 0초로 만들어 삭제하게끔 한 뒤, 응답으로 보내서 설정!
					// addCookie 해서 웹브라우저에 쿠키정보를 추가로 전송!
					// 다시 클라이언트에게 쿠키 보내주는것!
				}
			}
		}
		// response.sendRedirect("login.html");
		response.sendRedirect("cookieTest.jsp");
		
	%>

</body>
</html>