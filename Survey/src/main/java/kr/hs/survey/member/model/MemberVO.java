package kr.hs.survey.member.model;

public class MemberVO {
	
	private Integer userNo; // pk
	private String userId;
	private String userPw;
	
	public Integer getUserNo() {
		return userNo;
	}
	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

}
