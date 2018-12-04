<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="vo.Members"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library System_main</title>
</head>
<body>
	<table>
		<tr>
			<td>
				<%
					String id = (String) session.getAttribute("ID");
					if (id == null) {
				%> <a href="./loginForm.jsp">로그인</a> <a href="./joinForm.jsp">회원
					가입</a> <%
 	} else {
 %> <%=session.getAttribute("ID")%> &nbsp; <a href="memberLogout.lib">로그아웃</a>
				<%
					}
				%>
			</td>
		</tr>
		<tr>
			<td>
	</table>
</body>
</html>