package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;
import co.micol.prj.serviceImpl.NoticeServiceImpl;
import co.micol.prj.serviceNotice.NoticeService;
import co.micol.prj.serviceNotice.NoticeVO;

public class NoticeSelect implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse reponse) {
		//공지 상세보기
		NoticeService dao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		
		vo.setNoticeId(Integer.valueOf(request.getParameter("id")));
		
		vo = dao.noticeSelect(vo);
		
		if(vo != null) {
			dao.noticeHitUpdate(vo.getNoticeId());
			request.setAttribute("vo", vo);
		}
		return "notice/noticeSelect";
	}

}
