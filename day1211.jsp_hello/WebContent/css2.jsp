<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>css2</title>
	
	<style>
		/* CSS를 div영역에 적용하겠다는!! 선택자(selector) */
		* {
			font-size: large;
		}
		ul,p { 
			color: #FFD800; /* 글씨 노란색 */
			font-size: middle;
			/* 위에서 크기 지정하고서 아래에서 같은 구역을 다시 지정하면, 아래쪽이 최종으로 적용됨 */
		}
		p {
			background-color: #ff6347; /* red */
			font-weight: bold; /* <b>와 같음 */
		}	
		h1 {
			text-decoration: underline;
		}	
		
	</style>
	</head>

	<body>
		<h1>oo 주식회사</h1>
		
		<ul>
			<li>회사소개</li>
			<li>제품소개</li>
			<li>고객센터</li>
			<li>공지사항</li>
		</ul>
		
		<p>우리 회사는 50년 전통의 뛰어난 기술을 가진 좋은 회사 입니다.</p>
		
		<p>서울시 oo구 oo동</p>
		
	</body>
</html>