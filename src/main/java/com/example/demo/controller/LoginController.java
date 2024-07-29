package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Member;
import com.example.demo.model.MemberRepository;

@Controller
public class LoginController {
	
	@Autowired
	private MemberRepository memberRepository;
	
//	@Autowired
//	private MemberService memberService;
	
	@GetMapping("/")
	public String index() {
		return "/login";
	}	

	@PostMapping("/login")
	public String getMember(@RequestParam String username, @RequestParam String password, Model model) {
		Member member = memberRepository.findByUsername(username);
		if(member == null) {
			model.addAttribute("errorMsg", "無此帳號!!");
			return "/login";
		}
		if(!(member.getPassword().equals(password))) {
			model.addAttribute("errorMsg", "帳號密碼錯誤，請重新輸入");
			return "/login";
		}
		
		model.addAttribute("member", member);
		return "/successLogin";
	}
	
}
