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
		<!-- �������� �۹�ȣ�� bId���� ����� -->
		<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td>��ȣ</td>
				<td>${content_view.bId}</td>
			</tr>
			<tr>
				<td>��Ʈ(��ȸ��)</td>
				<td>${content_view.bHit}</td>
			</tr>
			<tr>
				<td>�̸�</td>
				<td><input type="text" name="bName"
					value="${content_view.bName}"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="bTitle"
					value="${content_view.bTitle}"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><textarea name="bContent" rows="10" cols="20">${content_view.bContent}</textarea></td>
			</tr>
			<tr>
				<!-- ���� ������ ���� �׳� �ٷ� ���⼭ ������ �� �ִ� -->
				<td colspan="2"><input type="submit" value="����"> <!-- entity: <>���� reserved character! -->
					<!-- &nbsp�� ���� �̴�. --> &nbsp;&nbsp; <a href="list.do">��Ϻ���</a>
					&nbsp;&nbsp; <a href="reply_view.do?bId=${content_view.bId}">���</a>
					&nbsp;&nbsp; <a href="delete.do?bId=${content_view.bId}">����</a></td>
				<!-- get������� <a �����۸�ũ> ����ϸ�, ? �ڿ� name=value ��������  -->
				<!-- �Ķ���� ���� �ݵ�� �������־�� �Ķ���Ͱ� ���޵ȴ�!! �̰� ���̴� null�ȴ� -->
			</tr>
		</table>
	</form>
</body>
</html>