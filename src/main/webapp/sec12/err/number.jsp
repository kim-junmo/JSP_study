<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//num이라는 파라미터가 없어서 null로 처리되고, null을 숫자로 변환시 오류발생.(예외)
	int num = Integer.parseInt(request.getParameter("num"));

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쇼핑몰 중심 jsp입니다.</h1>
</body>
</html>