<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="edu.bit.ex.chap20_connectionPool.*"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		MemberPoolDAO memberPoolDAO = new MemberPoolDAO();
		ArrayList<MemberDTO> dtos = memberPoolDAO.memberSelect();

		for (int i = 0; i < dtos.size(); i++) {

			MemberDTO dto = dtos.get(i);
			String name = dto.getName();
			String id = dto.getId();
			String pw = dto.getPw();
			String phone = dto.getPhone1() + " - " + dto.getPhone2() + " - " + dto.getPhone3();
			String sex = dto.getSex();

			out.println("�̸�: " + name + ", ���̵�: " + id + ", ��й�ȣ: " + pw + ", ����ó: " + phone + ", ����: " + sex
					+ "<br />");
		}
	%>

</body>
</html>