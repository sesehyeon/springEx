<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>모든 회원 보기 페이지</h3>
<br>
<hr>

<a href="join">회원가입</a>
<a href="list">모든 회원 정보 보기</a>
<a href="index">로그인</a>
<hr>
size:${list.size() }
<br>

<table border="1">
<tr>

	<td>이름</td><td>아이디</td><td>비밀번호</td><td>생년월일</td><td>주소</td><td>전화번호</td>

</tr>
<c:if test="${list.size()==0 }">
<tr>
	<th colspan="5">데이터가 없습니다.</th>
</tr>
</c:if>
<c:forEach var="dto" items="${list }">
	<tr>
	
		<th><a href="info?id=${dto.id }">${dto.name }</a></th><th>${dto.id }</th><th>${dto.pwd}</th><th>${dto.birth }</th><th>${dto.addr }</th><th>${dto.tel }</th>
	
	</tr>

</c:forEach>

</table>







</body>
</html>