<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div><jsp:include page="../menu/menu.jsp"></jsp:include></div>
		<div>
			<h1>공지사항 목록</h1>
		</div>
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일자</th>
						<th>첨부파일</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${empty notices}">
						<tr>
							<td colspan=6 align="center">게시글 존재하지않음</td>
						</tr>
					</c:if>
					<c:if test= "${not empty notices }">
						<c:forEach items="${notices}" var="n">
						<tr id="info" onclick = "select('${n.noticeId}')">
						<td>${n.noticeId }</td>
						<td>${n.noticeTitle }</td>
						<td>${n.noticeWriter }</td>
						<td>${n.noticeDate }</td>
						<td>${n.noticeAttech }</td>
						<td>${n.noticeHit }</td>
						</tr>	
						</c:forEach>
					</c:if>
					
				</tbody>
			</table>
		</div>
		<form  id="frm"  method="post">
		 <input type = "hidden" id="id" name = "id">
		 <c:if test = "${not empty id }">
		 <button type="button" onclick="location.href='noticeWriteForm.do'">글쓰기</button>
		 </c:if>
		</form>
		
		
	</div>
<script type="text/javascript">
	function select(id) {
	console.log("select method")
	 frm.id.value=id
	 frm.action = "noticeSelect.do";
	 frm.submit();
	}

</script>


</body>
</html>