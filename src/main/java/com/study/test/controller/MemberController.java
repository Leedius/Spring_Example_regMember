package com.study.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.test.vo.MemberDetailVO;
import com.study.test.vo.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	//첫페이지
	@GetMapping("/")
	public String start() {
		return "index";
	}
	
	//회원가입 페이지로 이동
	@GetMapping("/regmemberForm")
	public String regMemberForm() {
		return "reg_member_form";
	}
	
	//회원 상세 정보 입력페이지로 이동
	@PostMapping("/regMember")
	public String regMember(MemberVO memberVO) {
		System.out.println(memberVO);
		return "reg_member_detail_form";
	}
	
	//회원 상세 정보 페이지로 이동
	//커맨드 객체는 자동으로 html로 전달
	//이때 넘어가는 이름을 정해주지 않으면 
	//클래스명에서 앞 글자만 소문자로 바뀐 이름으로 넘어 감.
	@PostMapping("/regMemberDetail")
	public String regMemberDetail(MemberDetailVO memberDetailVO, MemberVO memberVO) {
		System.out.println(memberDetailVO);
		return "member_info";
	}
}
