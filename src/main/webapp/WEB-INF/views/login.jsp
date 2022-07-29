<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="loginCheck">
	<table border="1">
		<tr>
			<td>id</td>
		
		
			<td><input type="text" name="id" size="20" placeholder="id"></td>
		</tr>
		<tr>
			<td>pass</td>
		
		
			<td><input type="password" name="pwd" size="20" placeholder="password"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="login" ><a href="join">회원가입</a>
		<a href="list">모든 회원 보기</a></td>
		
		</tr>
	</table>

</form>

</body>
</html>