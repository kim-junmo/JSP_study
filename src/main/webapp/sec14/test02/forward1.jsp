<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	//request객체는 요청이 종료되면 정보가 소멸이 된다.
	//member1.jsp 파일이 종료되면 아래 아이디와 비밀번호는 소멸된다.
	request.setAttribute("id", "hong");
	request.setAttribute("pwd", "1234");
	
	//session객체는 세션이 종료가 되면 정보가 소멸이 된다.
	//예> 로그아웃(강제적으로 세션을 종료), 사이트를 30분 재접속하지 않으면 세션이 자동소멸된다.
	session.setAttribute("name", "홍길동");
	session.setAttribute("email", "hong@test.com");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="member1.jsp"></jsp:forward>
</body>
</html>