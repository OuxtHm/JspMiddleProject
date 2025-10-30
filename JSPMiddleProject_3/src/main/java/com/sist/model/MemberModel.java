package com.sist.model;

import java.util.*;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;
import com.sist.dao.*;
import com.sist.vo.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MemberModel {
	@RequestMapping("member/post.do")
	public String member_post(HttpServletRequest request, HttpServletResponse response) 
	{
		String dong = request.getParameter("dong");	// 요청값 받기
		List<ZipcodeVO> list = MemberDAO.postFindData(dong);	// 요청 처리
		request.setAttribute("list", list);	// 출력할 결과값 전송 -> JSON

		return "../member/post.jsp";
	}
}
