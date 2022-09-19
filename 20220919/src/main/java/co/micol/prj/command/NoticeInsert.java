package co.micol.prj.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;
import co.micol.prj.serviceImpl.NoticeServiceImpl;
import co.micol.prj.serviceNotice.NoticeService;
import co.micol.prj.serviceNotice.NoticeVO;

public class NoticeInsert implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse reponse) {
		
		String viewPage = "notice/noticeError";
		NoticeService dao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setNoticeWriter(request.getParameter("noticeWriter"));
		vo.setNoticeDate(Date.valueOf(request.getParameter("noticeDate")));
		vo.setNoticeTitle(request.getParameter("noticeTitle"));
		vo.setNoticeSubject(request.getParameter("noticeSubject"));
		System.out.println("noticeInsert : "+vo);
//		System.out.println("impl insert"+request.getParameter("noticeDate"));
		//첨부파일은 여기에서 처리해야함 
		int n = dao.noticeInsert(vo);
		if(n!=0) {
			viewPage = "noticeSelectList.do";
		}else {
			request.setAttribute("message", "등록실패");
		}
			
		System.out.println("impl insert : "+viewPage);
		return viewPage;
	}
	}


