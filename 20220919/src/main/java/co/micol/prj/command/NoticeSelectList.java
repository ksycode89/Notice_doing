package co.micol.prj.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;
import co.micol.prj.serviceImpl.NoticeServiceImpl;
import co.micol.prj.serviceNotice.NoticeService;
import co.micol.prj.serviceNotice.NoticeVO;

public class NoticeSelectList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse reponse) {
		System.out.println("commandSelectList");
		
		NoticeService dao = new NoticeServiceImpl();
		
		List<NoticeVO> list = new ArrayList<NoticeVO>();
		list = dao.noticeSelectList();
		
		request.setAttribute("notices", list);
		
		return "notice/noticeSelectList";
	}

}
