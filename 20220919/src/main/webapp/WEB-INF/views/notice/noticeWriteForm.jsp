<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<jsp:include page="../menu/menu.jsp"></jsp:include></div>

		<div>
			<h1>공지사항 등록</h1>
		</div>

		<div>
			<form id="frm" action="noticeInsert.do" method="POST">
				<div>
					<table border="1">
						<tr>
							<th>작성자</th>
							<td>
								<input type="text" id="noticeWriter" name="noticeWriter" required="required" value="${name} "  readonly="readonly">
							</td>
							<th>작성일자</th>
							<td><input type="date" id="noticeDate" name="noticeDate" required="required"></td>
						</tr>
						
						<tr>
							<th>제목</th>
							<td colspan="3">
							<input type="text" id="noticeTitle" name="noticeTitle" required="required">
							</td>
						</tr>

						<tr>
							<th>내용</th>
							<td colspan="3">
							<textarea rows="10" cols="80" id="noticeSubject" name="noticeSubject" ></textarea>
							</td>
						</tr>

						<tr>
							<th>첨부파일</th>
							<td colspan="3">
							<input type="file" id="file" name="file">
							</td>
						</tr>
						
						

					</table>
					<div>
						<input type="submit" value="등록"> &emsp;
						<input type="reset" value="취소"> &emsp;
						<input type="button" value="목록" onclick="location.href='noticeSelectList.do'"> &emsp;
						
					</div>
				</div>
			</form>
		</div>


	</div>
</body>
</html>