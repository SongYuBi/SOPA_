package com.kh.sopa.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.kh.sopa.model.DAO.User_DAO;
import com.kh.sopa.model.vo.User_VO;
import com.kh.sopa.view.Find_Id;
import com.kh.sopa.view.Find_Pwd;
import com.kh.sopa.view.Login_Panel;
import com.kh.sopa.view.Sign_Up;

public class LoginController {
	private User_VO uv;
	private User_DAO ud;
	private Login_Panel lp;
	private Sign_Up su;
	private Find_Id fi;
	private Find_Pwd fp;

		

	//회원 가입 객체 생성
	public void user_make(User_VO vo) {

		 ud = new User_DAO();
		 ud.userOutput(vo);
		//기록조회
		}
	
	
	//아이디 찾기
	public void fine_user(User_VO vo) {
		String num;
		ud.userInput(null);
		
		num = vo.getUser_phone_number();
		
		System.out.println(num);
		
		
		
		System.out.println(ud);
		
//		if(fp == num) {
//			System.out.println("같음");
//			System.out.println(ud);//ud로 반환
//		} else if (fp != num) {
//			System.out.println("다름");
//		}
		
		
	
	
	}
	
	
	
	//회원 비밀번호 찾기

}
