<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%! /* for variable declaration */
	int i = 10;
	String str = "abc";
	
	private int sum(int a, int b) {
		return a+b;
	}	
	%>
	
	<!-- for expression as out.print -->
	<%= i %><br>
	<%= str %><br />
	<%= sum(1,5) %>
</body>
</html>