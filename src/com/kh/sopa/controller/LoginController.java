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

		

	//ȸ�� ���� ��ü ����
	public void user_make() {
		
		
		//�����ȸ
				ArrayList<User_VO> list = ud.userInput();
				//����Ȯ��
				if(list == null) {
					list = new ArrayList<User_VO>();
					
				}
				
				//�߰�
				list.add(uv);
				
				ud.userOutput(list);
				
		
		
	}
	
	
	
	
	//ȸ�� ���̵� ã��
	
	
	//ȸ�� ��й�ȣ ã��

}
