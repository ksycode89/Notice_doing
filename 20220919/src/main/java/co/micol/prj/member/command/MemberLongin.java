package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.common.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVo;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class MemberLongin implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse reponse) {
		MemberService dao = new MemberServiceImpl();
		
		HttpSession session = request.getSession();//session 호출
		
		
		MemberVo vo = new MemberVo();
		vo.setMemberId(request.getParameter("memberId"));
		vo.setMemberPassword(request.getParameter("memberPassword"));
		
		System.out.println("memberLogin : "+vo);
		vo= dao.memberSelect(vo);
		//id랑 password만 보냈는데 name이 없으면 실패한것
		if(vo !=null) {
			session.setAttribute("id", vo.getMemberId());
			session.setAttribute("author", vo.getMemberAuthor());
			session.setAttribute("name", vo.getMemberName());
			request.setAttribute("message", vo.getMemberName()+"님 환영합니다.");
			
		}else {
			//실패전달
			request.setAttribute("message", "입력을 잘못하였습니다.");
			
			
		}
		
		return "member/memberMessage";
	}

}
