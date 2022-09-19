package co.micol.prj.serviceNotice;

import java.util.List;

public interface NoticeService {
	
	List<NoticeVO> noticeSelectList();
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	//boolean IsIdCheck(NoticeVO id);
	
	void noticeHitUpdate(int id) ; //조회증가
	List<NoticeVO> noticeSearchList(String key ,String val);  //게시글 검색

}
