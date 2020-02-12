<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- jsp: => 액션 태그 -->
<jsp:useBean id="student" class="edu.bit.ex.Student" scope="page" />
<% 
	// been 이용한 위 코드는 아래와 같다. id는 변수명.
	// Student student = new edu.bit.ex.Student();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- setters and getters -->
	<!-- student.setName("홍길동"); 한 것과 같다. 이미 생성된 setter함수 이용하는 것 -->
	<jsp:setProperty name="student" property="name" value="홍길동"/>
	<jsp:setProperty name="student" property="age" value="13"/>
	<jsp:setProperty name="student" property="grade" value="6"/>
	<jsp:setProperty name="student" property="studentNum" value="7"/>
	
	<!-- student.getName() 과 같다 -->
	이름: <jsp:setProperty name="student" property="name" /><br />
	나이: <jsp:setProperty name="student" property="age" /><br />
	학년: <jsp:setProperty name="student" property="grade" /><br />
	학번: <jsp:setProperty name="student" property="studentNum" /><br />

</body>
</html>
