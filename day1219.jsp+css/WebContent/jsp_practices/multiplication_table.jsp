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
	<!-- ������ ����� jstl �� el�� Ȱ���Ͽ� ����Ͻÿ�. style ���̺� ������ green. -->

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
							<td>${i}��</td>
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