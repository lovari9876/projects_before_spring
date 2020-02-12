<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	=> 페이지가 바뀌었을 때 객체의 scope확인해보기!<br><br>
	request:
	<%=request.getAttribute("id")%>
	<br /> pageContext:
	<%=pageContext.getAttribute("name")%><br>

</body>
</html>