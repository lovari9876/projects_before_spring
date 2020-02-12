<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>현재시각</title>

<style>
	h3, div {
		font-weight:bold;
	}
</style>
</head>
<body>
	<h3>날짜/시간 출력</h3>

	<%@ page
		import="java.time.*, java.time.format.*, java.util.Date, java.text.SimpleDateFormat"%>

	<%-- 
	//time 패키지 시도는 실패...
	<%
		out.print("<b>현재 날짜 : " + LocalDate.now() + "</b><br>");
	%> --%>

	<div>
		현재 날짜 :
		<%
		Date todayTime = new Date();
		SimpleDateFormat day = new SimpleDateFormat("yyyy/MM/dd");
		out.println(day.format(todayTime));
	%>
	</div>

	<div>
		현재 시간 :
		<%
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		out.println(time.format(todayTime));
	%>
	</div>

</body>
</html>