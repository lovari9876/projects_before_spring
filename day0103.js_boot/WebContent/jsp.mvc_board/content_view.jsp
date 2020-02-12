<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="modify.do" method="post">
		<input type="hidden" name="bId" value="${content_view.bId}">
		<!-- 유저에게 글번호가 bId임을 숨기기 -->
		<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td>번호</td>
				<td>${content_view.bId}</td>
			</tr>
			<tr>
				<td>히트(조회수)</td>
				<td>${content_view.bHit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="bName"
					value="${content_view.bName}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bTitle"
					value="${content_view.bTitle}"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="bContent" rows="10" cols="20">${content_view.bContent}</textarea></td>
			</tr>
			<tr>
				<!-- 수정 페이지 없이 그냥 바로 여기서 수정할 수 있다 -->
				<td colspan="2"><input type="submit" value="수정"> <!-- entity: <>없는 reserved character! -->
					<!-- &nbsp는 띄어쓰기 이다. --> &nbsp;&nbsp; <a href="list.do">목록보기</a>
					&nbsp;&nbsp; <a href="reply_view.do?bId=${content_view.bId}">댓글</a>
					&nbsp;&nbsp; <a href="delete.do?bId=${content_view.bId}">삭제</a></td>
				<!-- get방식으로 <a 하이퍼링크> 사용하면, ? 뒤에 name=value 형식으로  -->
				<!-- 파라미터 값을 반드시 지정해주어야 파라미터가 전달된다!! 이거 없이는 null된다 -->
			</tr>
		</table>
	</form>
</body>
</html>