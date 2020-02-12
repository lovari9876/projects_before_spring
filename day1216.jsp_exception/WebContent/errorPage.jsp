<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ page isErrorPage="true"%>
<%
	response.setStatus(200);
	// status code가 200이면 정상 
	// error 발생했는데 정상이라고 상태 지정한 후  만들어둔 에러페이지 띄운다.
	// 웹 브라우저의 error page가 뜨면 resource가 다 드러나니까!!
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	에러 발생
	<br />
	<%=exception.getMessage()%>
</body>
</html>