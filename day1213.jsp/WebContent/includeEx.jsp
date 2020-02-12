<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>include.jsp 페이지 입니다.</h1>
	<br>
	
	<%-- 페이지 삽입!! include 지시자를 통해 다른 jsp파일을 삽입 가능.
	삽입된 페이지는 해당 파일이 가진 내용을 같은 페이지 내에서! 출력한다. --%>
	<%@ include file="include01.jsp"%>
	<h1>다시 include.jsp 페이지 입니다.</h1>

</body>
</html>