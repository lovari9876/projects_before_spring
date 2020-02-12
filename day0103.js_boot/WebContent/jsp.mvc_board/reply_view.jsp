<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="reply.do" method="post">
		<input type="hidden" name="bId" value="${reply_view.bId}"> <input
			type="hidden" name="bGroup" value="${reply_view.bGroup}"> <input
			type="hidden" name="bStep" value="${reply_view.bStep}"> <input
			type="hidden" name="bIndent" value="${reply_view.bIndent}">
		<table width="500" cellpadding="0" cellspacing="0" border="1">
			<!-- 입력받는게 아니라 그대로 가져오는 value들에 주의!! -->
			<tr>
				<td>번호</td>
				<td>${reply_view.bId}</td>
			</tr>
			<tr>
				<td>히트(조회수)</td>
				<td>${reply_view.bHit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="bName" value="${reply_view.bName}"
					size="50"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="bTitle"
					value="${reply_view.bTitle}" size="50"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="bContent" rows="10">${reply_view.bContent}</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="댓글 저장(답변)">
					<!-- entity: <>없는 reserved character! --> <!-- &nbsp는 띄어쓰기 이다. -->
					&nbsp;&nbsp; <a href="list.do">목록보기</a></td>
			</tr>
		</table>
	</form>
</body>
</html>