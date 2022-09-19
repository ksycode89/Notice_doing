package co.micol.prj.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVo;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class MemberSelectList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse rsponse) {
		
		MemberService dao = new MemberServiceImpl();
		
		List<MemberVo> list = new ArrayList<MemberVo>();
//		MemberVo vo = new MemberVo();
		
		list = dao.memberSelectList();
		
		System.out.println("memberselect in Map"+list);
		
		request.setAttribute("members", list);
		
		
		
		return "member/memberSelectList";
	}

}
