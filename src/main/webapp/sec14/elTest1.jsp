<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어(Expression Language)에서 사용되는 데이터들</title>
</head>
<body>
	<h1>표현언어(EL)로 여러가지 데이터 출력하기</h1>
	<h1>
		\${100 }: ${100 }<br>
		\${"안녕하세요"}: ${"안녕하세요"}<br>
		\${10 + 1}: ${10 + 1}<br>
		\${"10" + 1 }: ${"10" + 1 }<br>
		<%-- \${null + 10 }: ${null + 10 }<br> --%>
		<%-- \${"안녕" + 11 }: ${"안녕" + 11 }<br> 에러가 발생하여 주석을 달았음 --%>
		<%-- \${"hello" + "world" }: ${"hello" + "world"}<br> 에러가 발생하여 주석을 달았음 --%>
		<%-- 문자열과 숫자, 문자열과 문자열은 더할 수 없다 -> 오류발생 --%>
	</h1>
</body>
</html>