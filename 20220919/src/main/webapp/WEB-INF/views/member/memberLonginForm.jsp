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
		
		<div> <h1>�α���</h1></div>
		<div>
			<form action="memberLogin.do" method="post">
			<div>
				<table border="1">
				<tr>
				  <th>���̵�</th>
				  <td>
				  <input type="text" id="memberId" name="memberId" required="required">
				  </td>
				</tr>
				<tr>
				  <th>�н�����</th>
				  <td>
				   <input type="password"  id="memberPassword" name="memberPassword" required="required">
				  </td>
				</tr>
				</table>
				<div></div>
				<div>
					<input type = "submit" value = "�α���">
					<input type = "reset" value = "���">
					
				</div>
			</div>
			</form>
		</div>
		
		</div>
	</div>
</body>
</html>