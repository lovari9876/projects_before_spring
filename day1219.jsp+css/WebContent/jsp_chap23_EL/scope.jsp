<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- �������� ��ȿ ����(����) scope�� ���� ���尴ü-->
	<!-- 1.page(pageContext): �ϳ��� jsp ������ �������� ��ü�� �����ϴ� ����  -->
	<!-- 2.request: forward �Ǵ� include�� ����ϸ�, request ��û ��ü�� ����, ���� ������ ��ü ���� -->
	<!-- 3.session: ���� �����ϱ�� ������ �ð� �� -->
	<!-- 4.application: ���� application ������ ��û�Ǵ� ���������� ���� ��ü�� ���� -->

	<%
		pageContext.setAttribute("name", "���");
		request.setAttribute("id", "lalala");
	%>

	<h2>����� ���� ����غ���</h2>
	request:
	<%=request.getAttribute("id")%>
	<br /> pageContext:
	<%=pageContext.getAttribute("name")%><br>

	<a href="req_page_next.jsp">�̵��ϱ�</a>
	<br> �ּҴ� �ٲ��� �����鼭 �ٷ� �̵��ϴ� �׼��±�:
	<br>forward<jsp:forward page="req_page_next.jsp" />
</body>
</html>