<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>EL Ex</title>
</head>
<body>
	<!-- 실수, 정수, 문자열 모두 프린트 가능 -->
	${10}
	<br /> ${99.99}
	<br /> ${"ABC"}
	<br> ${'abc'}
	<br>
	<!-- 큰따옴표나 작은 따옴표나 상관없어~~ 
	하지만 문자열을 따옴표 안붙이고 쓰면, 출력 안돼!!! -->
	${true}
	<br><br />
	<!-- boolean형도 가능 -->
	
	
	${ 1+2 } <br>
	${ 1-2 } <br>
	${ 1*2 } <br>
	${ 1/2 } <br> <!-- 대박 사건: 정수끼리 연산이어도 값은 실수형 나와!! => 0.5 -->
	<!-- 내부적으로 데이터타입이 정수, 실수, 문자열, boolean 이런식으로 있고,  -->
	<!-- 자동 형변환 되는 것.. -->
	<br>
	
	${ 1>2 } <br>
	${ 1<2 } <br>
	<!-- return boolean -->
	
	${ (1>2) ? 1: 2 } <br> <!-- 삼항 연산자 가능! -->
	${ (1>2) || (1<2) } <br> <!-- 논리연산자도 지원! -->
	<br />
	
	<!-- 데이터의 유효 범위(영역) scope에 따른 내장객체-->
	<!-- 1.page(pageContext): 하나의 jsp 페이지 내에서만 객체를 공유하는 영역  -->
	<!-- 2.request: forward 또는 include를 사용하면, request 요청 객체가 공유  -->
	<!-- 3.session: 세션 유지하기로 설정된 시간 내 -->	
	<!-- 4.application: 같은 application 내에서 요청되는 페이지들은 같은 객체를 공유 -->
	
	
	<!-- use action tag... -->
	<!-- instance 생성, set property -->
	<!-- MemberInfo member = new MemberInfo(); -->
	<jsp:useBean id="member" class="day1219.jsp_chap23_EL.MemberInfo" scope="page"/>
	
	<!-- member.setName("라라"); ... -->
	<jsp:setProperty name="member" property="name" value="라라"/><br />
	<jsp:setProperty name="member" property="id" value="lala"/><br />
	<jsp:setProperty name="member" property="pw" value="1234"/><br />
		
	<!-- get property -->
	<!-- member.getName(); ... -->
	이름: <jsp:getProperty name="member" property="name"/><br />
	아이디: <jsp:getProperty name="member" property="id"/><br />
	비밀번호: <jsp:getProperty name="member" property="pw"/><br />
	<hr />
	
	<!-- EL로 property 얻어오기!! -->
	이름: ${member.name }<br>
	아이디: ${member.id }<br>
	비밀번호: ${member.pw }<br>
	
	
</body>
</html>