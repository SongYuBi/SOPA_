package com.kh.sopa.model.DAO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//�������� ������ �׼��� ������Ʈ 
public class User_DAO {
	
	//ȸ�� ���� ��ü ����
	
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
		
		
		
		//ȸ�� ���̵� ã��
		
		
		//ȸ�� ��й�ȣ ã��

}
