package com.kh.sopa.model.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.Iterator;

import com.kh.sopa.controller.LoginController;
import com.kh.sopa.model.vo.User_VO;
import com.kh.sopa.view.Find_Id;
import com.kh.sopa.view.Find_Pwd;
import com.kh.sopa.view.Sign_Up;




//�������� ������ �׼��� ������Ʈ 
public class User_DAO {

	private Sign_Up su;
	private User_VO uu;
	private LoginController lc;
	private Find_Id fi;
	
	

		//ȸ�� ���Կ� ������ ����
		public void userOutput(User_VO uv) {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			
			String nid;
			String npw;
			String npn;
			
			nid = uv.getUser_id();
			npw = uv.getUser_pw();
			npn = uv.getUser_phone_number();
			ArrayList<User_VO> write = new ArrayList ();	
			write.add(new User_VO(nid, npw, npn, 0, 0, 0, 0, 0, 0));
			
			System.out.println(write + "�� ��Ȯ��");
			
			try {
				
				fos = new FileOutputStream("User.txt", true);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(write);
							
				for(int i = 0; i < write.size(); i++) {
					System.out.println(write.get(i).getUser_id() + "  " + write.get(i).getUser_pw() + "  " + write.get(i).getUser_phone_number() + "  " + write.size() + "Ȯ��");
					System.out.println("������");
				}
				oos.flush();
				fos.flush();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(oos != null) {
					if(fos != null) {
					try {
						oos.close();
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
		
		//���� �б�
		public void userInput(User_VO uv) {
			FileInputStream fis = null;
			ObjectInputStream ois = null;

			try {
				fis = new FileInputStream("User.txt");
				ois = new ObjectInputStream(fis);
				
				ArrayList<User_VO> read  = (ArrayList<User_VO>)ois.readObject();

					for(int i = 0; i < read.size(); i++) {
						System.out.println(read.get(i).getUser_id() + read.get(i).getUser_pw() + read.get(i).getUser_phone_number() + "Ȯ��");
						System.out.println("������");
					}
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				if(ois != null) {
					try {
						ois.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
			//���̵� ã��
			public void findId(User_VO uv) {
				FileInputStream fis = null;
				ObjectInputStream ois = null;
				ArrayList<User_VO> read = null;
				
				String fineNum; //�޾ƿ� ��ȣ ��
				
				
				try {
					fis = new FileInputStream("User.txt");
					ois = new ObjectInputStream(fis);
					
					read  = (ArrayList<User_VO>)ois.readObject();
					for(int i = 0; i < read.size(); i ++) {
					
						System.out.println(read.get(i).getUser_phone_number() + "/n" + "Ȯ��");
						System.out.println("������");
					
						
						String get;
						get = fi.getText();
						String find;
						find = read.get(i).getUser_phone_number();
						String fid;
						fid = read.get(i).getUser_id();
						
						
						if(get.equals(find)) {
							JOptionPane.showMessageDialog(null, "���̵�� " + fid, "ID�� ã�ҽ��ϴ�.", JOptionPane.INFORMATION_MESSAGE);
							System.out.println("�־" + fid);
						}
						if(!get.equals(find)) {
							System.out.println("�����");
							JOptionPane.showMessageDialog(null, "���� ���̵� �����ϴ�.", "ID�� �����ϴ�.", JOptionPane.ERROR_MESSAGE);
						}
						}
					
						//�ߺ� �� ã��
					
						
						
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} finally {
					if(ois != null) {
						try {
							ois.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
}
			
			//��й�ȣ ã��
			
			public void findPw() {
				FileInputStream fis;
				ObjectInputStream ois;
				ArrayList<User_VO> read;
				
				try {
					fis = new FileInputStream("User.txt");
					ois = new ObjectInputStream(fis);
					
					try {
						 read = (ArrayList<User_VO>) ois.readObject();
						
						for(int i = 0; i < read.size(); i++) {
						System.out.println(read.get(i).getUser_id() + " " + read.get(i).getUser_pw() + " " + read.get(i).getUser_phone_number());
						
						String getId;
						String getPhone;
						String findPw;
						
					
						Find_Pwd fp = null;
						getId = fp.getId();
						getPhone = fp.getPhone();
						
						String dataId;
						dataId =  read.get(i).getUser_id();
						String dataPhone;
						dataPhone = read.get(i).getUser_phone_number();
						String dataPw;
						dataPw = read.get(i).getUser_pw();
						
						if(getId.equals(dataId)){
							if(getPhone.equals(dataPhone)) {
								JOptionPane.showMessageDialog(null, "ã���ô� ��й�ȣ�� "+dataPw, "��й�ȣ ã��", JOptionPane.INFORMATION_MESSAGE);
								System.out.println("�� ����" + dataPw);
							} else {
								JOptionPane.showMessageDialog(null, "��ȭ��ȣ�� �ٸ��ϴ�.", "��й�ȣ ����", JOptionPane.ERROR_MESSAGE);
								System.out.println("������ �ٸ�");
							}
						} else  {
							JOptionPane.showMessageDialog(null, "���̵� �ٸ��ϴ�.", "��й�ȣ ����", JOptionPane.ERROR_MESSAGE);
							System.out.println("���̵� �ٸ�");
						}
						
						}
					
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} 
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			}
}