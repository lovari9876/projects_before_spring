<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:forward page="chap12_forward_param.jsp">
		<jsp:param name="id" value="abcdef" />
		<jsp:param name="pw" value="1234" />
	</jsp:forward>	
	
</body>
</html>