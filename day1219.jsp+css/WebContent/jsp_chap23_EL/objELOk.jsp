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
	���̵�:
	<%=id%><br> ��й�ȣ:
	<%=pw%><br>

	<hr />
	<!-- get parameter�� el��~~~ -->
	���̵�: ${param.id }
	<br> ��й�ȣ: ${param.pw }
	<br> ���̵�: ${param["id"] }
	<br> ��й�ȣ: ${param["pw"] }
	<br>
	<hr>

	applicationScope: ${applicationScope.application_name }
	<br> sessionScope: ${sessionScope.session_name}
	<br> pageContextScope: ${pageContextScope.pageContext_name}
	<br> requestScope: ${requestScope.request_name}
	<br>

	<hr>
	context �ʱ�ȭ �Ķ����(context-param)// web.xml(��������) ���� ������ param-value ���
	<br> ${initParam.con_name }
	<br> ${initParam.con_id }
	<br> ${initParam.con_pw}
	<br>


</body>
</html>