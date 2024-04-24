<%@page import="java.util.Date"%>
<%@page import="sec07.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="sec07.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, td, th {
  border: 1px solid;
}

table {
  width: 100%;
  border-collapse: collapse;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 정보 출력</h1>
<%
	MemberDAO dao = new MemberDAO();
	List<MemberVO> memberList = dao.listMembers();
%>

<table>
	<tr>
		<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입날짜</td>
	</tr>
<%
	for(int i=0; i<memberList.size();i++) {
		MemberVO vo = memberList.get(i);
		String id = vo.getId();
		String pwd = vo.getPwd();
		String name = vo.getName();
		String email = vo.getEmail();
		Date joinDate = vo.getJoinDate();

%>

<tr>
	<td><%=id %></td><td><%=pwd %></td><td><%=name %></td><td><%=email %></td><td><%=joinDate %></td>
</tr>
<%
	}
%>


</table>







</body>
</html>