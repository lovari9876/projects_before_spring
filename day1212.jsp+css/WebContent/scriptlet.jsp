<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		<%
			int i = 0;
			while(true) {
				i++;
				out.println("2 * " + i + " = " + (2*i) + "<br/>");
		%>
			=============<br>		
		<%
			if(i >= 9) break;
		}
		%>
		
		<!-- 2 * 1 = 2 <br>
			===========<br>
			 2 * 2 = 4 <br>
			===========<br>
			이런식으로 html로 바뀌는 것 -->		
			
	</body>
</html>