<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>
table, td, tr {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 2px;
}

table {
	background-color: green;
}
</style>

</head>
<body>
	<!-- 구구단 출력을 jstl 및 el을 활용하여 출력하시오. style 테이블 바탕색 green. -->

	<table>
		<c:forEach var="j" begin="1" end="9" step="1">
			<tr>
				<c:forEach var="i" begin="2" end="9" step="1">
					<td>${i}*${j}=${i*j}</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>

	<table>
		<c:forEach var="j" begin="1" end="9" step="1">
			<tr>
				<c:forEach var="i" begin="2" end="9" step="2">
					<td>${i}*${j}=${i*j}</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>

	<table>
		<c:forEach var="j" begin="1" end="9" step="1">
			<tr>
				<c:forEach var="i" begin="2" end="9" step="1">
					<c:if test="${i%2==0}">
						<td>${i}*${j}=${i*j}</td>
					</c:if>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>

	<table>
		<c:forEach var="j" begin="0" end="9" step="1">
			<tr>
				<c:forEach var="i" begin="2" end="9" step="1">
					<c:choose>
						<c:when test="${j==0}">
							<td>${i}단</td>
						</c:when>
						<c:otherwise>
							<td>${i}*${j}=${i*j}</td>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>

</body>
</html>