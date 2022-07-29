package com.care.re.DAO;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.re.DTO.MemberDTO;

@Repository
public class MemberDAO {
	MemberDTO dto;
	private ArrayList<MemberDTO> list;
	
	public MemberDAO(){
		list=new ArrayList<MemberDTO>();
	}
	public void register(MemberDTO dto) {
		list.add(dto);
	}
	public ArrayList<MemberDTO> list(){
		return list;
	}

}
