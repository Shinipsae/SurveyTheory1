package kr.hs.survey.member.service;

import kr.hs.survey.member.model.MemberVO;

public interface IMemberService {

	void addMember(MemberVO member) throws Exception; // ȸ������
	void deleteMember(MemberVO member) throws Exception; // ȸ��Ż�� 
}
