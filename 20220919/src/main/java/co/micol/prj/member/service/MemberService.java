package co.micol.prj.member.service;

import java.util.List;

public interface MemberService {
	
	List<MemberVo> memberSelectList();
	
	MemberVo memberSelect(MemberVo vo);
	
	int memberInsert(MemberVo vo);
	
	int memberUpdate(MemberVo vo);
	int memberDelete(MemberVo vo);
	
	boolean IsIdCheck(String id);
	
	
	
	
		
	
}
