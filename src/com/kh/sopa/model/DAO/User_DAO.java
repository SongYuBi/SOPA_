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

//�������� ������ �׼��� ������Ʈ 
public class User_DAO {
	private ObjectInputStream oip = null;
	private ObjectOutputStream uoo = null;
	private ArrayList<User_VO> al;
	
	//���� ���
		public void userOutput(User_VO out) {
			
//			ObjectOutputStream uoo = null;
			al = new ArrayList();
			
			
			try {
				
				FileOutputStream fo = new FileOutputStream("User.txt", true);
				uoo = new ObjectOutputStream(fo);
				System.out.println(out);
				al.add(out);
				
				uoo.writeObject(out);
				
				for(int i = 0; i < al.size(); i++) {
				
					System.out.println(al.get(i) + "�ƿ�ǲ ����" + i);
				}
			
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
				
		
		}
		
		//���� �б�
		public void userInput(User_VO out) {
//			ObjectInputStream oip = null;
			
			
			try {
				oip = new ObjectInputStream(new FileInputStream("User.txt"));
				
				al = (ArrayList<User_VO>) oip.readObject();
				
				String read = (String) oip.readObject();
				
					System.out.println("�ҷ���");
					
					//list.add(i, al)
			
			} catch (FileNotFoundException e) {
				
				
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
			
						
		
		
		//ȸ�� ���̵� ã��
		

}
}