<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="circle" class="edu.bit.ex.Circle" scope="page" />

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:setProperty name="circle" property="r" />
	<!-- form page의 요청한 name과 set할 property가 같으면 value입력 안하고 자동 저장 -->
	원의 넓이는: <jsp:getProperty name="circle" property="area"/>
	
</body>
</html>