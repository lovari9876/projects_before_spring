<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="q8.*, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>
table, tr, td {
	border: 2px solid green;
	border-collapse: collapse;
}
</style>

</head>
<body>

	<table>
		<tr>
			<td>ENAME</td>
			<td>HIREDATE</td>
			<td>COMM</td>
		</tr>

		<%
			CommissionDAO commissionDAO = new CommissionDAO();
			ArrayList<CommissionDTO> dtos = commissionDAO.commissionSelect();
					
			for (int i = 0; i < dtos.size(); i++) {
				CommissionDTO dto = dtos.get(i);
				
				out.println("<tr>");
				out.println("<td>");
				out.println(dto.getName());
				out.println("</td>");
				out.println("<td>");
				out.println(dto.getHiredate());
				out.println("</td>");
				out.println("<td>");
				out.println(dto.getCommission());
				out.println("</td>");
				out.println("</tr>");
			}
		%>

	</table>

</body>
</html>