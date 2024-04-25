<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	//스프링에서 다음과 같은 정보가 구성.
	List dataList = new ArrayList();
	dataList.add("hello");
	dataList.add("world");
	dataList.add("안녕하세요");

%>
<c:set var="list" value="<%=dataList %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반복문 실습</title>
</head>
<body>
<!-- 자바에서 공부하고 있는 for문을 생각하면 됨 -->
<!-- var= 변수 선언 begin= 변수 시작값 end=변수 종료값 step=변수 증가량 varStatus="loop" -->
<c:forEach var="i" begin="1" end="10" step="1" varStatus="loop"> 
	i = ${i	} &nbsp;&nbsp;&nbsp; 반복횟수: ${loop.count }<br>
</c:forEach>
<br>
<c:forEach var="i" begin="1" end="10" step="2">
	5 * ${i } = ${5 * i }<br>
</c:forEach>
<br>
<c:forEach items="${list }" var="date">
	${data }<br>
</c:forEach>
<br>
<c:set var="fruits" value="사과, 파인애플, 바나나, 망고, 귤" />
<c:forTokens items="${fruits }" delims="," var="token">
	${token }<br>
</c:forTokens>
</body>
</html>