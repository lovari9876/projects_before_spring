<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ page isErrorPage="true"%>
<%
	response.setStatus(200);
	// status code�� 200�̸� ���� 
	// error �߻��ߴµ� �����̶�� ���� ������ ��  ������ ���������� ����.
	// �� �������� error page�� �߸� resource�� �� �巯���ϱ�!!
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	���� �߻�
	<br />
	<%=exception.getMessage()%>
</body>
</html>