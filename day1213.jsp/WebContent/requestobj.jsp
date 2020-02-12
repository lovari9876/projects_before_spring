<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<!-- header 정보 출력해보기! -->
	<%
	// jsp에서 new 안해도 자동으로 만들어지는 내장 객체들
	// out, request.. 등
	out.println("서버: " +request.getServerName() + "<br>");
	out.println("포트번호: " +request.getServerPort() + "<br>");
	out.println("요청 방식: " +request.getMethod() + "<br>");
	out.println("프로토콜: " +request.getProtocol() + "<br>");
	out.println("URL: " +request.getRequestURL() + "<br>");
	out.println("URI: " +request.getRequestURI() + "<br>");
	
	// URI: uniform resource identifier(식별자)
	// =-> contextPath만 나옴
	
/* 	getContextPath() : 웹어플리케이션의 컨텍스트 패스를 얻습니다.
	getMethod() : get방식과 post방식을 구분할 수 있습니다.
	getSession() : 세션 객체를 얻습니다.
	getProtocol() : 해당 프로토콜을 얻습니다.
	getRequestURL() : 요청 URL를 얻습니다.
	getRequestURI() : 요청 URI를 얻습니다.
	getQueryString() : 쿼리스트링을 얻습니다.
 */
	%>
	
</body>
</html>