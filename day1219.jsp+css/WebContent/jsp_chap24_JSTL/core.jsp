<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- prefix 즉 접두사로 c: 을 쓰겠다! -->
<!-- URI stands for uniform resource identifier and URL stands for uniform resource locator. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL ex</title>
</head>
<body>
	<!-- set은 변수 선언!  -->
	<h3>var vatName = varValue;</h3>
	<c:set var="vatName" value="varValue" />
	vatName:
	<!-- out은 출력이다 -->
	<c:out value="${vatName }" />
	<br>

	<h3>var num = 100;</h3>
	<c:set var="num" value="100" />
	num:
	<!-- out은 출력이다 -->
	<c:out value="${num }" />
	<br>

	<br>
	<h3>변수제거는 remove: 아예 변수를 지워버림~ null이 아니라 사라져</h3>
	<c:remove var="num" />
	<c:out value="${vatName }" />
	<br>
	<c:out value="${num }" />
	<br>
	<hr>

	<h3>catch: try-catch의 catch가 하는 에러 처리를 해준다</h3>
	<c:catch var="error">
		<%=2 / 0%>
		<!-- error 발생 -->
	</c:catch>
	<br />
	<h3>catch한 error 구문 실행</h3>
	<c:out value="${ error}" />
	<hr>

	<h3>if: test의 값이 true 일때 text 출력</h3>
	<c:if test="${1+2==3 }">
		1+2=3
	</c:if>

	<c:if test="${1+2!=3 }">
		1+2=3
	</c:if>
	<hr>

	<h3>forEach: print var between begin and end / step은 출력 간격</h3>
	<c:forEach var="feach" begin="0" end="30" step="2">
		${feach } 
	</c:forEach>
	<hr>
	
	<h3>choose: switch와 if-else를 혼합한 형태! </h3>
	<c:choose>
		<c:when test="${1>0 }">
			1은 0보다 크다<br>
		</c:when>
		<c:when test="${2>0 }">
			2도 0보다 크다<br>
		</c:when>
		<c:otherwise>
			왠만하면 크다.
		</c:otherwise>
	</c:choose>

</body>
</html>