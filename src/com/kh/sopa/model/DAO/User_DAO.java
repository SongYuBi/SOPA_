package com.kh.sopa.model.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.sopa.model.vo.User_VO;

//�������� ������ �׼��� ������Ʈ 
public class User_DAO {
	
	//ȸ�� ���� ��ü ����
	
	public ArrayList<User_VO> userOutput(ArrayList<User_VO> out) {
		
		ObjectOutputStream uoo = null;
		
		
		
		try {
			uoo = new ObjectOutputStream(new FileOutputStream("User.tat"));
			
			uoo.writeObject(out);
			
			uoo.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				uoo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return out;
		
	
	}
	
	//���� �б�
	public ArrayList<User_VO> userInput() {
		ObjectInputStream oip = null;
		ArrayList<User_VO> list = null;
		
		try {
			oip = new ObjectInputStream(new FileInputStream("User.dat"));
			
			list = (ArrayList<User_VO>)oip.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("����");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(oip != null) {
				try {
					oip.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		return list;
		
	}
	public void insertUser(User_VO user) {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("User_Info"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try  {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public User_VO createUser() {
		User_VO vo = new User_VO();
		
		vo.setUser_id("user_text_id01");
		vo.setUser_pw("1234");
		vo.setUser_phone_number("010-2222-1111");
		vo.setUser_1st(1);
		vo.setUser_2nd(2);
		vo.setUser_3rd(3);
		vo.setUser_all_quiz(25);
		vo.setUser_correct_quiz(22);
		
		insertUser(vo);
		
		return vo;
	}
}
