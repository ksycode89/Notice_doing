<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
		<jsp:include page="../menu/menu.jsp"></jsp:include>
		
		<div> <h1>로그인</h1></div>
		<div>
			<form action="memberLogin.do" method="post">
			<div>
				<table border="1">
				<tr>
				  <th>아이디</th>
				  <td>
				  <input type="text" id="memberId" name="memberId" required="required">
				  </td>
				</tr>
				<tr>
				  <th>패스워드</th>
				  <td>
				   <input type="password"  id="memberPassword" name="memberPassword" required="required">
				  </td>
				</tr>
				</table>
				<div></div>
				<div>
					<input type = "submit" value = "로그인">
					<input type = "reset" value = "취소">
					
				</div>
			</div>
			</form>
		</div>
		
		</div>
	</div>
</body>
</html>