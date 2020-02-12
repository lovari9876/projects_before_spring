<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- list.jsp 자체를 외워야 함!! 달달 외워!!! -->
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>히트</td>
		</tr>
		<!-- MODEL2에서는 jsp파일 내에서 객체 생성해서 받아오거나 하지않고 -->
		<!-- 이미 생성된 객체나 데이터만 받아오는것!! -->
		<!-- ArrayList dtos를 list라는 파라미터에 담아서 가져왔음 -->
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.bId}</td>
				<td>${dto.bName}</td>
				<td><c:forEach begin="1" end="${dto.bIndent}">↳</c:forEach>
				<!-- 댓글은 - 한번, 대댓글은 --, 대대댓글은 --- 처럼 for문 돌려서 - 표시! -->
					<a href="content_view.do?bId=${dto.bId}">${dto.bTitle}</a></td>
				<!-- doGet으로 받는다! 왜? 상세 주소 나오자나.. 글고 method지정 없으면 default 고고 -->
				<td>${dto.bDate}</td>
				<td>${dto.bHit}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="write_view.do">글작성</a></td>
		</tr>
	</table>

</body>
</html>