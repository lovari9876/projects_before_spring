<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>join_result</title>

<style>
table, tr, td {
border: 1px solid black;
}

table {
width: 100px;
}

td {
text-align: center;
}

</style>

</head>

<body>
	<h3><b>작성하신 내용은 아래와 같습니다</b></h3>
	
	<% request.setCharacterEncoding("utf-8"); %>
	
	<%! String name, sex, id, address, tel, email;
	String[] hobbies;
	%>
	
	<%
	name = request.getParameter("name");
	sex = request.getParameter("sex");
	id = request.getParameter("id");
	address = request.getParameter("address");
	tel = request.getParameter("tel");
	email = request.getParameter("email");
	name = request.getParameter("name");
	hobbies = request.getParameterValues("hobby");
	
	out.println("이름 : " + name + "<br /><hr>");
	out.println("성별 : " + sex + "<br /><hr>");
	out.println("아이디 : " + id + "<br /><hr>");
	out.println("주소 : " + address + "<br /><hr>");
	out.println("전화번호 : " + tel + "<br /><hr>");
	out.println("이메일주소 : " + email + "<br /><hr>");
	
	if(hobbies == null) {
		out.println("취미 : <br />[선택한 취미가 없습니다.]");
	} else {
		out.println("취미 : <br><table>");
		for(String e : hobbies) {
			out.println("<tr><td>"+ e +"</td></tr>");
		}
		out.println("</table>");
	}	
	%>

</body>
</html>