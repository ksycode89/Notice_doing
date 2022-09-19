package co.micol.prj.member.serviceImpl;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.common.DataSource;
import co.micol.prj.mapper.MemberMapper;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVo;



public class MemberServiceImpl implements MemberService {
	
	private SqlSession sql = DataSource.getInstance().openSession(true);
    private MemberMapper map = sql.getMapper(MemberMapper.class);

	
	@Override
	public List<MemberVo> memberSelectList() {
		System.out.println(map.memberSelectList());
		return map.memberSelectList();
	}

	@Override
	public MemberVo memberSelect(MemberVo vo) {
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVo vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVo vo) {
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVo vo) {
		return map.memberDelete(vo);
	}

	@Override
	public boolean IsIdCheck(String id) {
		return map.IsIdCheck(id);
	}

}
