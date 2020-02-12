<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>EL Ex</title>
</head>
<body>
	<!-- �Ǽ�, ����, ���ڿ� ��� ����Ʈ ���� -->
	${10}
	<br /> ${99.99}
	<br /> ${"ABC"}
	<br> ${'abc'}
	<br>
	<!-- ū����ǥ�� ���� ����ǥ�� �������~~ 
	������ ���ڿ��� ����ǥ �Ⱥ��̰� ����, ��� �ȵ�!!! -->
	${true}
	<br><br />
	<!-- boolean���� ���� -->
	
	
	${ 1+2 } <br>
	${ 1-2 } <br>
	${ 1*2 } <br>
	${ 1/2 } <br> <!-- ��� ���: �������� �����̾ ���� �Ǽ��� ����!! => 0.5 -->
	<!-- ���������� ������Ÿ���� ����, �Ǽ�, ���ڿ�, boolean �̷������� �ְ�,  -->
	<!-- �ڵ� ����ȯ �Ǵ� ��.. -->
	<br>
	
	${ 1>2 } <br>
	${ 1<2 } <br>
	<!-- return boolean -->
	
	${ (1>2) ? 1: 2 } <br> <!-- ���� ������ ����! -->
	${ (1>2) || (1<2) } <br> <!-- �������ڵ� ����! -->
	<br />
	
	<!-- �������� ��ȿ ����(����) scope�� ���� ���尴ü-->
	<!-- 1.page(pageContext): �ϳ��� jsp ������ �������� ��ü�� �����ϴ� ����  -->
	<!-- 2.request: forward �Ǵ� include�� ����ϸ�, request ��û ��ü�� ����  -->
	<!-- 3.session: ���� �����ϱ�� ������ �ð� �� -->	
	<!-- 4.application: ���� application ������ ��û�Ǵ� ���������� ���� ��ü�� ���� -->
	
	
	<!-- use action tag... -->
	<!-- instance ����, set property -->
	<!-- MemberInfo member = new MemberInfo(); -->
	<jsp:useBean id="member" class="day1219.jsp_chap23_EL.MemberInfo" scope="page"/>
	
	<!-- member.setName("���"); ... -->
	<jsp:setProperty name="member" property="name" value="���"/><br />
	<jsp:setProperty name="member" property="id" value="lala"/><br />
	<jsp:setProperty name="member" property="pw" value="1234"/><br />
		
	<!-- get property -->
	<!-- member.getName(); ... -->
	�̸�: <jsp:getProperty name="member" property="name"/><br />
	���̵�: <jsp:getProperty name="member" property="id"/><br />
	��й�ȣ: <jsp:getProperty name="member" property="pw"/><br />
	<hr />
	
	<!-- EL�� property ������!! -->
	�̸�: ${member.name }<br>
	���̵�: ${member.id }<br>
	��й�ȣ: ${member.pw }<br>
	
	
</body>
</html>