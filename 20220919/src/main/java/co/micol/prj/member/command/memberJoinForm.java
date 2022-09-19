package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;

public class memberJoinForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse rsponse) {
		//맵버입력
		
		
		return "member/memberJoinForm";
	}

}
