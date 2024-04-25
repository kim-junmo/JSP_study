<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- ${pageContext.request.contextPath } : 
contextPath의 경로가 / or /webShop 인 경우 이경로를 읽어올때 사용하는 명령어 --%>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>

<c:url var="url1" value="/sec14/test01/member1.jsp">
	<c:param name="id" value="hong" />
	<c:param name="pwd" value="1234" />
	<c:param name="name" value="홍길동" />
	<c:param name="email" value="hong@nate.com" />
<%-- /sec14/test01/member1.jsp?id=hong&pwd=1234&name=홍길동&email=hong@nate.com --%>
</c:url>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href= "${contextPath}/sec14/test01/member1.jsp?id=hong&pwd=1234&name=홍길동&email=hong@nate.com">회원정보 출력</a>
<a href="${url1}">회원정보출력</a>
</body>
</html>