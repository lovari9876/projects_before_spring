<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<!-- header ���� ����غ���! -->
	<%
	// jsp���� new ���ص� �ڵ����� ��������� ���� ��ü��
	// out, request.. ��
	out.println("����: " +request.getServerName() + "<br>");
	out.println("��Ʈ��ȣ: " +request.getServerPort() + "<br>");
	out.println("��û ���: " +request.getMethod() + "<br>");
	out.println("��������: " +request.getProtocol() + "<br>");
	out.println("URL: " +request.getRequestURL() + "<br>");
	out.println("URI: " +request.getRequestURI() + "<br>");
	
	// URI: uniform resource identifier(�ĺ���)
	// =-> contextPath�� ����
	
/* 	getContextPath() : �����ø����̼��� ���ؽ�Ʈ �н��� ����ϴ�.
	getMethod() : get��İ� post����� ������ �� �ֽ��ϴ�.
	getSession() : ���� ��ü�� ����ϴ�.
	getProtocol() : �ش� ���������� ����ϴ�.
	getRequestURL() : ��û URL�� ����ϴ�.
	getRequestURI() : ��û URI�� ����ϴ�.
	getQueryString() : ������Ʈ���� ����ϴ�.
 */
	%>
	
</body>
</html>