<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>여러가지 산술 연산자</h2>
	<h1>
		\${10 + 10 } : ${10 + 10 }<br>
		\${20 - 20 } : ${20 - 20 }<br>
		\${10 * 10 } : ${10 * 10 }<br>
		\${100 / 9 } : ${100 / 9 }<br>
		<%-- \${100 div 9 } : ${100 div 9 }<br> : 툴에서는 오류가 표시되지만, 실행은 된다.--%>
		\${100 % 9 } : ${100 % 9 }<br> <%-- 나머지 연산자 --%>
		\${100 mod 9 } : ${100 mod 9 }<br> <%-- 나머지 연산자 --%>
	</h1>
</body>
</html>