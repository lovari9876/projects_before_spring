<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>
table, td {
	/* td가 없으면 border가 맨 바깥의 테이블테두리만 생긴다. */
	border-style: solid;
	border-color: #ffa500;
}

h1, tr, td {
	color: rgb(106, 90, 205);
}
</style>
</head>

<body>
	<h1>구구단 출력</h1>

	<table>
		<%-- 
		<%
		// 내가 한 것..어설프셈 ㅠㅠ
			out.println("<tr>");

			// 단 표시
			for (int i = 2; i <= 9; i++) {
				out.println("<td>" + i + "단</td>");
			}
			out.println("</tr>");

			// tr을 이용해서 가로로 행을 나타내야 하므로 j가 먼저 돌고 i가 돌아야 함!!
			for (int j = 1; j <= 9; j++) {
				out.println("<tr>");
				for (int i = 2; i <= 9; i++) {
					out.println("<td>" + i + " X " + j + " = " + (i * j) + "</td>");
				}
				out.println("</tr>");
			}
		%> --%>

		<%
			// 쌤꺼..
			// 열이 1,2,3... 순으로 증가하므로 a*b일때 b를 먼저 for문으로 돌린다. 
			for (int i = 0; i < 10; i++) {
				out.println("<tr>");

				// a를 돌리는데, i=0일 때, 즉 첫째줄에는 단을 표시해준다.
				for (int j = 2; j < 10; j++) {
					if (i == 0) {
						out.println("<td>" + j + "단</td>");
					} else {
						out.println("<td>" + j + " X " + i + " = " + (i * j) + "</td>");
					}
				}
				out.println("</tr>");
			}
		%>
	</table>
</body>
</html>