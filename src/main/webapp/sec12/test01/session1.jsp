<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = (String) session.getAttribute("name");
	session.setAttribute("address", "서울시 노원구 이젠빌딩");
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 내장객체</title>
</head>
<body>
	이름은 <%=name %>입니다.<br>
	<a href="session2.jsp">두번째 페이지로 이동</a>
</body>
</html>