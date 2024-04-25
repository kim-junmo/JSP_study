<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setCharacterEncoding("utf-8");
%>

<!-- JSTL Core태그 라이브러리 변수 선언 문법-->
<c:set var="id" value="hong" scope="page" />
<c:set var="pwd" value="1234" scope="page" />
<%-- <c:set var="name" value="${'홍길동' }" scope="page" />  --%>
<c:set var="age" value="${22 }" scope="page"></c:set>
<c:set var="height" value="${177 }" scope="page" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- when절은 단독으로 사용할 수 없으면 choose문과 같이 사용해야된다. 마치 switch-case문처럼 --%>

<c:choose>
<%-- <c:when test="${name == null }"> --%>
<c:when test="${empty name }"> <!-- name이 null이거나 빈문자열인지 체크 -->
	<h3>name변수가 존재하지 않습니다.</h3>
</c:when>
<c:otherwise>
아이디 : ${id } <br>
비밀번호 : ${pwd } <br>
이름 : ${name } <br>
나이 : ${age } <br>
키 : ${height } <br>
</c:otherwise>
</c:choose>

</body>
</html>