package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.common.Command;

public class MemberLogout implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse reponse) {
	
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("name");
		session.invalidate();//session 완전삭제
		request.setAttribute("message", name+"잘가고 또 보자");
		
		return "member/memberMessage";
	}

}
