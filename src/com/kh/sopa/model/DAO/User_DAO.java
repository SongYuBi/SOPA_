package com.kh.sopa.model.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.kh.sopa.model.vo.User_VO;

//유저관련 데이터 액세스 오브젝트 
public class User_DAO {
	
	//회원 가입 객체 생성
	
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
	
	//파일 읽기
	public ArrayList<User_VO> userInput() {
		ObjectInputStream oip = null;
		ArrayList<User_VO> list = null;
		
		try {
			oip = new ObjectInputStream(new FileInputStream("User.dat"));
			
			list = (ArrayList<User_VO>)oip.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("에러");
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
		
		//회원 아이디 찾기
		
		
		//회원 비밀번호 찾기

}
