package co.micol.prj.mapper;

import java.util.List;

import co.micol.prj.member.service.MemberVo;

public interface MemberMapper {
	
	List<MemberVo> memberSelectList();
	MemberVo memberSelect(MemberVo vo);
	int memberInsert(MemberVo vo);
	int memberUpdate(MemberVo vo);
	int memberDelete(MemberVo vo);
	boolean IsIdCheck(String id);
	
	
}
