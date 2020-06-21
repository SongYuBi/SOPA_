package com.kh.sopa.model.DAO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//유저관련 데이터 액세스 오브젝트 
public class User_DAO {
	
	//회원 가입 객체 생성
	
		public static void userOutput() {
			
			FileOutputStream user_file_out = null;
			ObjectOutputStream user_object_out;
			
			
			try {
				user_file_out = new FileOutputStream("User.txt");
				user_object_out = new ObjectOutputStream(user_file_out);
				
				user_object_out.writeObject(user_object_out);
				
				List<String> userList = new ArrayList<String>();
				user_object_out.writeObject(userList);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
		}
		
		
		
		//회원 아이디 찾기
		
		
		//회원 비밀번호 찾기

}
