package com.kh.sopa.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Find_Pwd extends JFrame{
	private JPanel contentPane;
	private Login_Panel lp;
	
	public Find_Pwd() {
		super();
		JPanel contentPane;
		setTitle("비밀번호 찾기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//sopa 라벨
		JLabel sopa = new JLabel("S.O.P.A");
		sopa.setBounds(390, 250, 124, 78);
		sopa.setFont(new Font("바탕", Font.ITALIC, 10));
		
		
		//비밀번호를 바꾸고 싶어요 라벨
		JLabel text = new JLabel("비밀번호를 바꾸고 싶어요");
		text.setBounds(390, 300, 124, 78);
		sopa.setFont(new Font("바탕", Font.ITALIC, 10));
		
		
		//아이디 입력창
		JTextField user_id = new JTextField(10);
		user_id.setBounds(390, 420, 124, 78);
		user_id.setFont(new Font("바탕", Font.ITALIC, 10));
		
		
		//전화번호 입력창
		JTextField user_phone = new JTextField(10);
		user_phone.setBounds(390, 460, 124, 78);
		user_phone.setFont(new Font("바탕", Font.ITALIC, 10));
		
		
		//뒤로가요 버튼
		JButton back = new JButton("뒤로가기");
		back.setBounds(390, 500, 124, 78);
		sopa.setFont(new Font("바탕", Font.ITALIC, 10));
		back.addMouseListener(new MouseAdapter() {
			
			// 1.클릭 -> 로그인 화면
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				lp = new Login_Panel();
				
				super.mouseClicked(arg0);
			}
		});
		
		
		//확인 버튼
		JButton check = new JButton("확인");
		check.setBounds(600, 500, 124, 78);
		check.setFont(new Font("바탕", Font.ITALIC, 10));
		check.addMouseListener(new MouseAdapter() {
			
			
			//1. 아이디 동일 여부 체크 
			//1-1. 없음 : 아이디 없다 띄움
			//1-2. 있음 : 전화번호 체크
			//2. 전화번호 동일 여부 체크
			//2-1. 없음 : 전화번호 다르다 띄움
			//2-2. 있음 : 비번 수정 혹은 새로운 비번 띄우기
			//3. 로그인으로 돌아가기
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {


				lp = new Login_Panel();
				super.mouseClicked(arg0);
			}
		});

		
		//비밀번호 찾기 패널
		JPanel find_pwd = new JPanel();
		find_pwd.setBounds(0, 0, 1024, 768);
		find_pwd.setBackground(new Color(252, 228, 167));  
		find_pwd.setLayout(null);
		
		
		//합치기
		super.add(find_pwd);
		find_pwd.add(sopa);
		find_pwd.add(text);
		find_pwd.add(user_id);
		find_pwd.add(user_phone);
		find_pwd.add(back);
		find_pwd.add(check);
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
}
}
