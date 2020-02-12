<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- 데이터의 유효 범위(영역) scope에 따른 내장객체-->
	<!-- 1.page(pageContext): 하나의 jsp 페이지 내에서만 객체를 공유하는 영역  -->
	<!-- 2.request: forward 또는 include를 사용하면, request 요청 객체가 공유, 응답 전까지 객체 유지 -->
	<!-- 3.session: 세션 유지하기로 설정된 시간 내 -->
	<!-- 4.application: 같은 application 내에서 요청되는 페이지들은 같은 객체를 공유 -->

	<%
		pageContext.setAttribute("name", "라라");
		request.setAttribute("id", "lalala");
	%>

	<h2>저장된 정보 출력해보기</h2>
	request:
	<%=request.getAttribute("id")%>
	<br /> pageContext:
	<%=pageContext.getAttribute("name")%><br>

	<a href="req_page_next.jsp">이동하기</a>
	<br> 주소는 바뀌지 않으면서 바로 이동하는 액션태그:
	<br>forward<jsp:forward page="req_page_next.jsp" />
</body>
</html>