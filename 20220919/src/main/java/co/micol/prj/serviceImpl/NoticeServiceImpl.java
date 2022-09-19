package co.micol.prj.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.common.DataSource;
import co.micol.prj.mapper.NoticeMapper;
import co.micol.prj.serviceNotice.NoticeService;
import co.micol.prj.serviceNotice.NoticeVO;

public class NoticeServiceImpl implements NoticeService {
	private SqlSession sql = DataSource.getInstance().openSession(true);
	private NoticeMapper map = sql.getMapper(NoticeMapper.class);
	
	@Override
	public List<NoticeVO> noticeSelectList() {
		System.out.println("impl");
		return map.noticeSelectList();
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		//noticeHitUpdate(vo.getNoticeId());
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		return map.noticeUpdate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		return map.noticeDelete(vo);
	}

	@Override
	public void noticeHitUpdate(int id) {
		map.noticeHitUpdate(id);
		
	}

	@Override
	public List<NoticeVO> noticeSearchList(String key, String val) {
	
		return map.noticeSearchList(key, val);
	}

}
