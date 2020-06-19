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

public class Login_Panel extends JFrame{
	private JPanel contentPane;
	
	public Login_Panel() {
		super();
		JPanel contentPane;
		setTitle("로그인 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//로그인 창 sopa 라벨\
		JLabel sopa = new JLabel("S.O.P.A");
		sopa.setSize(500, 500);
		sopa.setLocation(100, 100);
		sopa.setFont(new Font("바탕", Font.ITALIC, 10));
		
		//로그인 창 아이디 입력 라벨
		JLabel id_label = new JLabel("아이디 입력");
		id_label.setSize(50, 30);
		id_label.setLocation(150, 90);
		id_label.setFont(new Font("바탕", Font.ITALIC, 5));
		
		//로그인 창 아이디 입력 패널
		JTextField login_id = new JTextField(20);
		login_id.setSize(50, 30);
		login_id.setLocation(220, 90);
		login_id.setFont(new Font("바탕", Font.ITALIC, 10));
		
		//로그인 창 비밀번호 입력 라벨
		JLabel pwd_label = new JLabel("비밀번호 입력");
		pwd_label.setSize(50, 30);
		pwd_label.setLocation(150, 120);
		pwd_label.setFont(new Font("바탕", Font.ITALIC, 5));
		
		//로그인 창 비밀번호 입력 패널
		JTextField login_pwd = new JTextField(20);
		login_pwd.setSize(50, 30);
		login_pwd.setLocation(220, 120);
		login_pwd.setFont(new Font("바탕", Font.ITALIC, 10));
		
		//로그인 창 로그인 버튼
		JButton login_quiz = new JButton("로그인");
		login_quiz.setSize(100, 50);
		login_quiz.setLocation(350, 100);
		login_quiz.addMouseListener(new MouseAdapter() {
			
			// 클릭 -> 대기실
			@Override 
			public void mouseClicked(MouseEvent arg0) {


				super.mouseClicked(arg0);
			}
		});
		
		//로그인 창 회원가입 버튼
		JButton sign_up = new JButton("비밀 번호 찾기");
		sign_up.setSize(50, 50);
		sign_up.setLocation(150, 500);
		sign_up.setFont(new Font("바탕", Font.ITALIC, 10));
		sign_up.addMouseListener(new MouseAdapter() { 
			
			//클릭 -> 회원가입 패널
			@Override
			public void mouseClicked(MouseEvent arg0) {


				super.mouseClicked(arg0);
			}
			
		});

		
		//로그인 창 아이디 찾기 버튼
		JButton find_id = new JButton("아이디 찾기");
		find_id.setSize(50, 50);
		find_id.setLocation(210, 500);
		find_id.setFont(new Font("바탕", Font.ITALIC, 10));
		find_id.addMouseListener(new MouseAdapter() { 
			
			//클릭 -> 아이디 찾기 패널
			@Override
			public void mouseClicked(MouseEvent arg0) {


				super.mouseClicked(arg0);
			}
			
		});
	
		//로그인 창 비밀번호 찾기
		JButton find_pwd = new JButton("비밀번호 찾기");
		find_pwd.setSize(50, 50);
		find_pwd.setLocation(260, 500);
		find_pwd.setFont(new Font("바탕", Font.ITALIC, 10));
		find_pwd.addMouseListener(new MouseAdapter() { 
			
			//클릭 -> 비밀번호 찾기 패널
			@Override
			public void mouseClicked(MouseEvent arg0) {


				super.mouseClicked(arg0);
			}
			
		});
		
		//로그인 페이지 패널
		JPanel login = new JPanel();
		login.setBounds(0, 0, 1024, 768);
		login.setBackground(new Color(252, 228, 167)); //rgb 넣어서 해봄 
		login.setLayout(null);
		
		
		//패널 합치기
		super.add(login);
		login.add(sopa);
		login.add(id_label);
		login.add(login_id);
		login.add(pwd_label);
		login.add(login_pwd);
		login.add(login_quiz);
		login.add(sign_up);
		login.add(find_id);
		login.add(find_pwd);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
