<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>
table, td {
	/* td�� ������ border�� �� �ٱ��� ���̺��׵θ��� �����. */
	border-style: solid;
	border-color: #ffa500;
}

h1, tr, td {
	color: rgb(106, 90, 205);
}
</style>
</head>

<body>
	<h1>������ ���</h1>

	<table>
		<%-- 
		<%
		// ���� �� ��..����� �Ф�
			out.println("<tr>");

			// �� ǥ��
			for (int i = 2; i <= 9; i++) {
				out.println("<td>" + i + "��</td>");
			}
			out.println("</tr>");

			// tr�� �̿��ؼ� ���η� ���� ��Ÿ���� �ϹǷ� j�� ���� ���� i�� ���ƾ� ��!!
			for (int j = 1; j <= 9; j++) {
				out.println("<tr>");
				for (int i = 2; i <= 9; i++) {
					out.println("<td>" + i + " X " + j + " = " + (i * j) + "</td>");
				}
				out.println("</tr>");
			}
		%> --%>

		<%
			// �ܲ�..
			// ���� 1,2,3... ������ �����ϹǷ� a*b�϶� b�� ���� for������ ������. 
			for (int i = 0; i < 10; i++) {
				out.println("<tr>");

				// a�� �����µ�, i=0�� ��, �� ù°�ٿ��� ���� ǥ�����ش�.
				for (int j = 2; j < 10; j++) {
					if (i == 0) {
						out.println("<td>" + j + "��</td>");
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