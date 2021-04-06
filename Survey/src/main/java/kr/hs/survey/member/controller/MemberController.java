package kr.hs.survey.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.hs.survey.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
}
