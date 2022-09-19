<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<style type="text/css">
table {
	margin-top: 200px
}

</style>
</head>

<body>
	<div align="center">
		<div><jsp:include page="../menu/menu.jsp"></jsp:include> </div>

		<table border="1">
						<tr>
							<th>작성자</th>
							<td>
							${vo.noticeWriter }
							</td>
							<th>작성일자</th>
							<td>${vo.noticeDate}</td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="3">
							 ${vo.noticeTitle}
							</td>
						</tr>

						<tr style="width: 300px">
							<th>내용</th>
							<td colspan="3">
							${vo.noticeSubject }
							</td>
						</tr>

						<tr>
							<th>첨부파일</th>
							<td colspan="3">
							없음
							</td>
					</tr>
						<tr>
						<td>${name}</td>
						<td>${vo.noticeWriter}</td>
						</tr> 
						

					</table>
		<br>
		<br>
		<c:if test = "${vo.noticeWriter eq name }" >

		<button >수정</button>
		&ensp;
		<button>삭제</button>
		&ensp;
		</c:if>
		<button onclick="location.href='main.do'">돌아가기</button>
		&ensp;




	</div>
</body>
</html>