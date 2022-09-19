package co.micol.prj.serviceNotice;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeVO {
	private int noticeId ;
	private String noticeWriter ;
	private String noticeTitle;
	private String  noticeSubject ;
	private Date noticeDate ;
	private String noticeAttech ;
	private String noticeAttechDir ;
	private String noticeHit ;
	
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeWriter() {
		return noticeWriter;
	}
	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeSubject() {
		return noticeSubject;
	}
	public void setNoticeSubject(String noticeSubject) {
		this.noticeSubject = noticeSubject;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	public String getNoticeAttech() {
		return noticeAttech;
	}
	public void setNoticeAttech(String noticeAttech) {
		this.noticeAttech = noticeAttech;
	}
	public String getNoticeAttechDir() {
		return noticeAttechDir;
	}
	public void setNoticeAttechDir(String noticeAttechDir) {
		this.noticeAttechDir = noticeAttechDir;
	}
	public String getNoticeHit() {
		return noticeHit;
	}
	public void setNoticeHit(String noticeHit) {
		this.noticeHit = noticeHit;
	}
	@Override
	public String toString() {
		return "NoticeVO [noticeId=" + noticeId + ", noticeWriter=" + noticeWriter + ", noticeTitle=" + noticeTitle
				+ ", noticeSubject=" + noticeSubject + ", noticeDate=" + noticeDate + ", noticeAttech=" + noticeAttech
				+ ", noticeAttechDir=" + noticeAttechDir + ", noticeHit=" + noticeHit + "]";
	}
	
	
	
}
