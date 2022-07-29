<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>개인정보 입니다.</h3>
	<hr>
	id:${dto.id }<br>
	pwd:${dto.pwd }<br>
	name:${dto.name }<br>
	addr:${dto.addr }<br>
	tel:${dto.tel }<br>
	birth:${dto.birth }<br>
	<a href="list">목록이동</a>
</body>
</html>