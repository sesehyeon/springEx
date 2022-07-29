package com.care.re.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.re.DAO.MemberDAO;
import com.care.re.DTO.MemberDTO;

@Service
public class MemberService {
	
	@Autowired MemberDAO dao;
	public MemberService() {
		System.out.println("서비스 생성");
	}
	public void register(MemberDTO dto) {
		dao.register(dto);
	}
	public void list(Model model) {
		ArrayList<MemberDTO> list=dao.list();
		model.addAttribute("list",list);
	}
	public void info(String id,Model model) {
		//select*from table where id=id 로 치면 됨
		ArrayList<MemberDTO> list=dao.list();
		for(MemberDTO dto:list) {
			if(dto.getId().equals(id)) {
				model.addAttribute("dto",dto);
				break;
				//이러면 한명에 해당되는 정보를 가져올 수 있음
			}
		}
		
	}
	
	public int loginCheck(MemberDTO dto) {
		ArrayList<MemberDTO> list=dao.list();
		for(MemberDTO d:list) {
			if(d.getId().equals(dto.getId())) {
				if(d.getPwd().equals(dto.getPwd())) {
					//사용자가 넘겨준 비밀번호와 dto에 저장되어있는 비밀번호가 같은지 
					return 0; //모두 일치한다
				}
				return 1;//비밀번호가 틀렸다
			}
		}
		return -1;//아이디가 없다
	}

	
}
