<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//http://localhost:9090/sec12/hello4.jsp?age=100
	/*
	String age = request.getParameter("age");
	*/
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주석문 연습</title>
</head>
<body>
	<h1>주석문 예제입니다!!</h1>
	<%--<%=Integer.parseInt(age) +10 %> --%>
	
	<!-- <%=10%> -->
	<%-- <%=10%> --%>
	<!-- <!-- <%=10%> --> : 10이라는 값은 웹페이지에서는 안보이지만 톰캣에서는 이를 해석을 먼저해 실행하고 난 뒤 주석 처리가 되어 안보이게 된다. -->
	<!-- <%-- <%=10%> --%> : 이는 jsp에서 사용되는 주석이기 때문에 위와는 반대로 주석처리가 되어 해석이 안된다.-->
</body>
</html>