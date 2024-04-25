<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- prefix=""에 a,c,g 등 다양하게 들어갈 수 있지만 관례상 core의 c를 따서 c를 사용하는 것이 좋음 --%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setCharacterEncoding("utf-8");
%>
<%-- JSTL core 태그라이브러리 변수선언 문법 --%> 
<!-- set 변수선언, var: 변수 이름 지정, value : 변수 값 지점, scope: scope : 변수가 저장되는 영역 설정 -->
<!-- JSTL문법 안에 jsp문법을 사용할 수 있다. -->

<c:set var="id" value="hong" scope="page" />
<c:set var="pwd" value="1234" scope="page" />
<c:set var="name" value="${'홍길동' }" scope="page" />
<c:set var="age" value="${22 }" scope="page" />
<c:set var="height" value="${177 }" scope="page" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이디 : ${id } <br>
비밀번호 : ${pwd } <br>
이름 : ${name } <br>
나이 : ${age } <br>
키 : ${height } <br>
</body>
</html>