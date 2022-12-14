package co.micol.prj.member.service;

import lombok.Data;

@Data
public class MemberVo {

	private String  memberId;
	private String  memberPassword;
	private String  memberName; 
	private String  memberTel;
	private String  memberAuthor;
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	public String getMemberAuthor() {
		return memberAuthor;
	}
	public void setMemberAuthor(String memberAuthor) {
		this.memberAuthor = memberAuthor;
	}
	@Override
	public String toString() {
		return "MemberVo [memberId=" + memberId + ", memberPassword=" + memberPassword + ", memberName=" + memberName
				+ ", memberTel=" + memberTel + ", memberAuthor=" + memberAuthor + "]";
	}
	
	
	
}
