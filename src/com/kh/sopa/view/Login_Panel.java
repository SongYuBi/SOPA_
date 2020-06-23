package com.kh.sopa.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.sopa.controller.ObjectIO;
import com.kh.sopa.model.vo.User_VO;
import com.kh.sopa.test.StandRoomPanelTest;
import com.kh.sopa.test.TestMainFrame;

public class Login_Panel extends JPanel{
	private JPanel contentPane;
	private JLabel sopa, id_label, pw_label;
	private JTextField login_id;
	private JPasswordField login_pw;
	private JButton login_quiz, sign_up, find_id, find_pw;
	JFrame mainFrame;
	JPanel thisPage;
	public Login_Panel() {}
	
	public Login_Panel(JFrame mf) {
		System.out.println("Log");
		this.mainFrame = mf;
//		mainFrame.setVisible(true);
		this.thisPage = this;
		
		//�α��� ������ �г�
		this.setBounds(0, 0, 1024, 768);
		this.setBackground(new Color(252, 228, 167));  
		this.setLayout(null);
		
		//�α��� â sopa ��
		sopa = new JLabel("S.O.P.A");
		sopa.setBounds(430, 100, 300, 200);
		sopa.setFont(new Font("����", Font.ITALIC, 50));
		this.add(sopa);
		
		// �α��� â ���̵� �Է� ��
		id_label = new JLabel("���̵� �Է�");
		id_label.setBounds(280, 350, 100, 50);
		id_label.setFont(new Font("����", Font.ITALIC, 12));
		this.add(id_label);
		
		//�α��� â ���̵� �Է� �г�
		login_id = new JTextField(20);
		login_id.setBounds(380, 350, 200, 40);
		login_id.setFont(new Font("����", Font.ITALIC, 12));
		this.add(login_id);
		
		
		//�α��� â ��й�ȣ �Է� ��
		pw_label = new JLabel("��й�ȣ �Է�");
		pw_label.setBounds(280, 400, 100, 50);
		pw_label.setFont(new Font("����", Font.ITALIC, 12));
		this.add(pw_label);
		
		
		//�α��� â ��й�ȣ �Է� �г�
		login_pw = new JPasswordField(20);
		login_pw.setBounds(380, 400, 200, 40);
		login_pw.setFont(new Font("����", Font.ITALIC, 12));
		this.add(login_pw);
		
	
		
		//�α��� â �α��� ��ư
		login_quiz = new JButton("�α���");
		login_quiz.setBounds(640, 340, 80, 120);
		this.add(login_quiz);
		login_quiz.addMouseListener(new MouseAdapter() {
			
			// 1.Ŭ�� -> ���
			// 2.Ŭ�� -> ���̵�, ��� üũ -> ��ü ��ȯ?
			@Override 
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("�α��� ��ư Ŭ��");
				
				// ���̵� ���� �߰��ؾ���. ���̵�� ���Ͽ��� ã�Ƽ�.
				
				ArrayList<User_VO> userList = new ObjectIO().UserReadToFile();
//				System.out.println(login_id.getText());
				
				String loginUser = login_id.getText();
				String userPw = login_pw.getText();
				
				boolean checkUser = false;
				for (int i = 0; i < userList.size(); i++) {
					if (loginUser.equals(userList.get(i).getUser_id())) {
						// ��й�ȣ üũ �߰��ؾ��� �� �Ŀ� true
						if (userPw.equals(userList.get(i).getUser_pw())) {
							System.out.println("��й�ȣ ��ġ");
							checkUser = true;
						}
						else {
							System.out.println("��й�ȣ ����ġ");
						}
						break;
					}
				}
				// �α��� ���� 
				if(checkUser) {
					System.out.println("�α��� ����");
					mainFrame.remove(thisPage);
					StandRoomPanelTest srpt = new StandRoomPanelTest(loginUser);
					mainFrame.add(srpt);
//					srpt.setVisible(true);
					mainFrame.repaint();
//					mainFrame.setVisible(true);
				}
				
				super.mouseClicked(arg0);
			}
		});
		
		//�α��� â ���̵� ã�� ��ư
		sign_up = new JButton("���̵� ã��");
		sign_up.setBounds(350, 500, 100, 20);
		sign_up.setFont(new Font("����", Font.ITALIC, 10));
		this.add(sign_up);
		sign_up.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ȸ������ �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Sign_Up su = new Sign_Up();

				super.mouseClicked(arg0);
			}
			
		});

		
		//�α��� â ���̵� ã�� ��ư
		find_id = new JButton("���̵� ã��");
		find_id.setBounds(450, 500, 100, 20);
		find_id.setFont(new Font("����", Font.ITALIC, 10));
		this.add(find_id);
		find_id.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ���̵� ã�� �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Find_Id fi = new Find_Id();
				
				super.mouseClicked(arg0);
			}
			
		});
	
		//�α��� â ��й�ȣ ã��
		find_pw = new JButton("��й�ȣ ã��");
		find_pw.setBounds(550, 500, 100, 20);
		find_pw.setFont(new Font("����", Font.ITALIC, 10));
		this.add(find_pw);
		find_pw.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ��й�ȣ ã�� �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Find_Pwd fp = new Find_Pwd();

				super.mouseClicked(arg0);
			}
		});
	}
	
	
//	public static void main(String[] args) {
//		JFrame f = new JFrame();
//		f.setTitle("�α��� ȭ�� �׽�Ʈ");
//		f.setSize(1024, 768);
//		f.add(new Login_Panel(f));
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setVisible(true);
//	}
}