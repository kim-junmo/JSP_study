<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>바교연산자</title>
</head>
<body>
	<h2>여러가지 비교연산자</h2>
	<h3>
		\${10 == 10 }: ${10 == 10 }<br>
		\${10 eq 10 }: ${10 eq 10 }<br>
		\${"hello" == "hello" } : ${"hello" == "hello" }<br>
		\${"hello" eq "hello" } : ${"hello" eq "hello" }<br>
		
		\${20 != 10 }: ${20 != 10 }<br> <%-- 같지 않다 --%>
		<%-- \${20 ne 10 }: ${20 ne 10 }<br> 오류 표시가 나지만 정상 작동한다. --%>
		\${"hello" != "apple" }: ${"hello" != "apple" }<br>
		<%-- \${"hello" ne "apple" }: ${"hello" ne "apple" } --%>
		\${10 < 10 }: ${10 < 10 }<br>
	</h3>
</body>
</html>