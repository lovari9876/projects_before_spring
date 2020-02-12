<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>response</title>
</head>
<body>

	<!-- 
	
	앞에서 살펴본 요청관련 메소드 보다 실제 많이 쓰이는 메소드는 parameter와 관련된 메소드들 입니다.
	Jsp페이지를 제작하는 목적이 데이터 값을 전송하기 위해서 이므로, parameter 관련 메소드는 중요 합니다.

	getParameter(String name) : name에 해당하는 파라미터 값을 구함.
	getParameterNames() : 모든 파라미터 이름을 구함.
	getParameterValues(String name) : name에 해당하는 파라미터값들을 구함.
	
	-->

	<%!/* 변수 선언!!!은 꼭 !붙여야 함 */
	String name, id, pw, major, protocol;
	String[] hobbys;
	%>

	<%
		request.setCharacterEncoding("utf-8");
	// 크롬은 euc-kr지원안하고 utf-8쓰니까 utf-8로 해줄 것!

		name = request.getParameter("name");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		major = request.getParameter("major");
		protocol = request.getParameter("protocol");

		hobbys = request.getParameterValues("hobby");
	%>

	이름:
	<%=name%><br /> 아이디:
	<%=id%><br /> 비밀번호:
	<%=pw%><br /> 취미:
	<%=Arrays.toString(hobbys)%><br /> 전공:
	<%=major%><br />
</body>
</html>