package com.kh.sopa.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Sign_Up extends JFrame{
	private Login_Panel lp;
	private JPanel contentPane;
	
	public Sign_Up() {
		super();
		JPanel contentPane;
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		
		//sopa 라벨
		
		//sopa 계정을 만들어요 라벨
		
		//아이디 입력창
		
		//비밀번호 입력창
		
		//비밀번호 확인 입력창
		
		//전화번호 입력창
		
		//뒤로가기 버튼
		
		//회원가기 버튼
		
		//회원 가입 패널
		
		//패널 합치기
	
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
