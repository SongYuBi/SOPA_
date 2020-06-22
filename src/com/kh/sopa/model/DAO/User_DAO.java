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
		
		//ȸ�� ���̵� ã��
		
		
		//ȸ�� ��й�ȣ ã��

}
