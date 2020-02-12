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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	%>
	아이디:
	<%=id%><br> 비밀번호:
	<%=pw%><br>

	<hr />
	<!-- get parameter를 el로~~~ -->
	아이디: ${param.id }
	<br> 비밀번호: ${param.pw }
	<br> 아이디: ${param["id"] }
	<br> 비밀번호: ${param["pw"] }
	<br>
	<hr>

	applicationScope: ${applicationScope.application_name }
	<br> sessionScope: ${sessionScope.session_name}
	<br> pageContextScope: ${pageContextScope.pageContext_name}
	<br> requestScope: ${requestScope.request_name}
	<br>

	<hr>
	context 초기화 파라미터(context-param)// web.xml(설정파일) 에서 설정한 param-value 출력
	<br> ${initParam.con_name }
	<br> ${initParam.con_id }
	<br> ${initParam.con_pw}
	<br>


</body>
</html>