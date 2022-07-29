package com.care.re.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.care.re.DTO.MemberDTO;
import com.care.re.service.MemberService;

@Controller
public class MemberController {
	@Autowired MemberService ms;
	
	@GetMapping("**")
	
	public String index() {
		return "index";
	}
	@GetMapping("login")
	public String login() {
		return "login";
	}
	@GetMapping("join")
	public String join() {
		return "join";
	}
	
	@GetMapping("list")
	public String list(Model model) {
		ms.list(model);
		return "list";
	}
	@PostMapping("join")
	public String join_next(MemberDTO dto) {
		ms.register(dto);
		return "index";
		
	}
	@GetMapping("info")
	public String info(String id,Model model) {
		System.out.println("id:"+id);
		ms.info(id, model);
		
		
		return "info";
		
	}
//	@RequestMapping("login")
//	public String result(HttpServletRequest req,RedirectAttributes rs) {
//		MemberDTO dto=new MemberDTO();
//		String id=req.getParameter("id");
//		if(id.equals(dto.getId())) {
//			rs.addFlashAttribute("re","로그인 성공");
//			return "redirect:wel";
//		}
//		return"loginNO";
//	}
	
	@GetMapping("wel")
	public String wel(String id,Model model) {
		
		ms.info(id, model);
		return "wel";
	}
	
	@GetMapping("loginNO")
	public String no() {
		return "loginNO";
	}
	@PostMapping("loginCheck")
	public String loginCheck(MemberDTO dto,RedirectAttributes rs) {
		int result=ms.loginCheck(dto);
		if(result==0) {
			System.out.println("로그인 성공");
			return"redirect:wel?id="+dto.getId();
			
		}else if(result!=0) {
			System.out.println("로그인 실패");
			rs.addFlashAttribute("result",result);
		}
		return"redirect:index";
	}
	
	@PostMapping("/test/login")
	public String register() {
		return "register";
	}
	
	
}
