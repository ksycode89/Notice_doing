package co.micol.prj.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.Main;
import co.micol.prj.command.NoticeInsert;
import co.micol.prj.command.NoticeSelect;
import co.micol.prj.command.NoticeSelectList;
import co.micol.prj.command.NoticeWriteForm;
import co.micol.prj.common.Command;
import co.micol.prj.member.command.MemberLogout;
import co.micol.prj.member.command.MemberLongin;
import co.micol.prj.member.command.MemberLonginForm;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  static HashMap<String, Command> map = new HashMap<String,Command>();
	public FrontController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		map.put("/main.do", new Main());
		map.put("/noticeSelectList.do", new NoticeSelectList());
		map.put("/noticeWriteForm.do", new NoticeWriteForm());
		map.put("/noticeInsert.do", new NoticeInsert());
		map.put("/noticeSelect.do", new NoticeSelect());
		map.put("/memberLonginForm.do", new MemberLonginForm());
		map.put("/memberLogin.do", new MemberLongin());
		map.put("/memberLogout.do", new MemberLogout());
		
	}

	

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath= request.getContextPath();
		String page = uri.substring(contextPath.length());
		
		System.out.println("page : "+page);
		Command command  = map.get(page);
		
		String viewPage = command.exec(request, response);
		
		System.out.println("커맨드아래 : "+viewPage);
		
		if(!viewPage.endsWith(".do")) {
			if(viewPage.startsWith("ajax:")) {
				response.setContentType("text/html; charset = utf-8");
				response.getWriter().append(viewPage.substring(5));
				return ;
			}else {
				viewPage = "/WEB-INF/views/"+viewPage+".jsp";
				
				System.out.println("front"+viewPage);
				
				RequestDispatcher dis = request.getRequestDispatcher(viewPage);
				dis.forward(request, response);
				
			}
		}else {
			response.sendRedirect(viewPage);
		}
		
	}

}
