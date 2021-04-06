package kr.hs.survey.member.repository;

import kr.hs.survey.member.model.MemberVO;

public interface IMemberMapper {
	
	void addMember(MemberVO member);
	void deleteMember(MemberVO member);

}
