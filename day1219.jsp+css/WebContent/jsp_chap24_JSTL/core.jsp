<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- prefix �� ���λ�� c: �� ���ڴ�! -->
<!-- URI stands for uniform resource identifier and URL stands for uniform resource locator. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL ex</title>
</head>
<body>
	<!-- set�� ���� ����!  -->
	<h3>var vatName = varValue;</h3>
	<c:set var="vatName" value="varValue" />
	vatName:
	<!-- out�� ����̴� -->
	<c:out value="${vatName }" />
	<br>

	<h3>var num = 100;</h3>
	<c:set var="num" value="100" />
	num:
	<!-- out�� ����̴� -->
	<c:out value="${num }" />
	<br>

	<br>
	<h3>�������Ŵ� remove: �ƿ� ������ ��������~ null�� �ƴ϶� �����</h3>
	<c:remove var="num" />
	<c:out value="${vatName }" />
	<br>
	<c:out value="${num }" />
	<br>
	<hr>

	<h3>catch: try-catch�� catch�� �ϴ� ���� ó���� ���ش�</h3>
	<c:catch var="error">
		<%=2 / 0%>
		<!-- error �߻� -->
	</c:catch>
	<br />
	<h3>catch�� error ���� ����</h3>
	<c:out value="${ error}" />
	<hr>

	<h3>if: test�� ���� true �϶� text ���</h3>
	<c:if test="${1+2==3 }">
		1+2=3
	</c:if>

	<c:if test="${1+2!=3 }">
		1+2=3
	</c:if>
	<hr>

	<h3>forEach: print var between begin and end / step�� ��� ����</h3>
	<c:forEach var="feach" begin="0" end="30" step="2">
		${feach } 
	</c:forEach>
	<hr>
	
	<h3>choose: switch�� if-else�� ȥ���� ����! </h3>
	<c:choose>
		<c:when test="${1>0 }">
			1�� 0���� ũ��<br>
		</c:when>
		<c:when test="${2>0 }">
			2�� 0���� ũ��<br>
		</c:when>
		<c:otherwise>
			�ظ��ϸ� ũ��.
		</c:otherwise>
	</c:choose>

</body>
</html>