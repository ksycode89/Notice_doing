package co.micol.prj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.micol.prj.serviceNotice.NoticeVO;

public interface NoticeMapper {
	List<NoticeVO> noticeSelectList();
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	//boolean IsIdCheck(NoticeVO id);
	
	void noticeHitUpdate(int id) ; //조회증가
	List<NoticeVO> noticeSearchList(@Param("key") String key ,@Param("val") String val);  //게시글 검색
	
}
