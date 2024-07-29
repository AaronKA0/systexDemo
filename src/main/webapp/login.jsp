<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/style/myStyle.css" />
</head>
<body>
	<form:form method="POST" action="${ cp }/updateStudent">
		<table>
			<tr>
				<td><form:label path="account">帳號</form:label></td>
				<td><form:input path="account"/></td>
			</tr>
			<tr>
				<td><form:label path="password">密碼</form:label></td>
				<td><form:input path="password"/></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="登入">
				</td>
			</tr>
		</table>
	</form:form>
	
	<a href="index.jsp">回首頁</a>
</body>
</html>