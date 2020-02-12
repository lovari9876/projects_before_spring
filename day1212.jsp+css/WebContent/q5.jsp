<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>짝수or홀수</title>

<style>
	table, td {
		border: 1px solid black;
	}
</style>

</head>

<body>
	<h3>
		<b>1~10까지 홀수 짝수 여부 출력</b>
	</h3>

	<table>
		<%
			for (int i = 0; i <= 10; i++) {
				out.println("<tr>");
				out.println("<td>" + i + "</td>");
				if (i % 2 == 0) {
					out.println("<td>짝수입니다.</td>");
				} else {
					out.println("<td>홀수입니다.</td>");
				}
				out.println("</tr>");
			}
		%>
	</table>

</body>
</html>