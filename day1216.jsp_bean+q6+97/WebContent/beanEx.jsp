<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- jsp: => �׼� �±� -->
<jsp:useBean id="student" class="edu.bit.ex.Student" scope="page" />
<% 
	// been �̿��� �� �ڵ�� �Ʒ��� ����. id�� ������.
	// Student student = new edu.bit.ex.Student();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- setters and getters -->
	<!-- student.setName("ȫ�浿"); �� �Ͱ� ����. �̹� ������ setter�Լ� �̿��ϴ� �� -->
	<jsp:setProperty name="student" property="name" value="ȫ�浿"/>
	<jsp:setProperty name="student" property="age" value="13"/>
	<jsp:setProperty name="student" property="grade" value="6"/>
	<jsp:setProperty name="student" property="studentNum" value="7"/>
	
	<!-- student.getName() �� ���� -->
	�̸�: <jsp:setProperty name="student" property="name" /><br />
	����: <jsp:setProperty name="student" property="age" /><br />
	�г�: <jsp:setProperty name="student" property="grade" /><br />
	�й�: <jsp:setProperty name="student" property="studentNum" /><br />

</body>
</html>
