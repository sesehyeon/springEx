<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입 페이지</h3>
<br>
<hr>

<a href="join">회원가입</a>
<a href="list">모든 회원 정보 보기</a>
<a href="index">로그인</a>
<hr>
<table border="1">
 <tr>

<form action="join" method="post">
  <tr>
	<td>
	이름
	</td>

	<td>
	<input type="text" name="name" size="20" placeholder="이름"><br>
	</td>

  </tr>

<tr>
	<td>
	아이디
	</td>
	<td>
	<input type="text" name="id" size="20" placeholder="id"><br>
	</td>
</tr>
<tr>
	<td>
	비밀번호
	</td>
	<td>
	<input type="password" name="pwd" size="20" placeholder="pass"><br>
	</td>
</tr>

<tr>

	<td>
	생일
	</td>
	<td>
	<input type="text" name="birth" size="20" placeholder="yy-mm-dd"><br>
	</td>
</tr>

<tr>

	<td>
	주소
	</td>
	<td>
	<input type="text" name="addr" size="20" placeholder="시/구 까지만 입력"><br>
	</td>
</tr>

<tr>

	<td>
	전화번호
	</td>
	<td>
	<input type="text" name="tel" size="20" placeholder="010-1234-1234"><br>
	</td>
</tr>

<tr>
	<td colspan="5">
	<input type="submit" value="회원가입">
	</td>
</tr>

    </form>
  </tr>
</table>

</body>
</html>