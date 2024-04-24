<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    


<%
	//스크립트 릿(Script let)
	//스크립트 릿은 선언문과 다르게 작성된 순서대로 코드가 진행이 되어 순서를 지켜야 한다.
	String age = request.getParameter("age");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 릿</title>
</head>
<body>
	<h1>jsp파일에 자바코드 삽입하는 방법2 - 스크립트 릿</h1>
	<h1>안녕하세요 <%=name %>님!!</h1>
	<h1>나이는 <%=age %>살입니다!</h1>
</body>
</html>

<%!
//선언문, 클래스 레벨에 삽입된다. 그래서 아래에 작성해도 상관이 없다.
	String name = "이순신";
	public String getName() {return name;}
%>

