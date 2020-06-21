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
		
		
		//로그인 페이지 패널
		JPanel login = new JPanel();
		login.setBounds(0, 0, 1024, 768);
		login.setBackground(new Color(252, 228, 167)); //rgb 넣어서 해봄 
		login.setLayout(null);
		
		//로그인 창 sopa 라벨
		JLabel sopa = new JLabel("S.O.P.A");
		sopa.setBounds(430, 100, 300, 200);
		sopa.setFont(new Font("바탕", Font.ITALIC, 50));
		
		//로그인 창 아이디 입력 라벨
		JLabel id_label = new JLabel("아이디 입력");
		id_label.setBounds(280, 350, 100, 50);
		id_label.setFont(new Font("바탕", Font.ITALIC, 12));
		
		//로그인 창 아이디 입력 패널
		JTextField login_id = new JTextField(20);
		login_id.setBounds(380, 350, 200, 40);
		login_id.setFont(new Font("바탕", Font.ITALIC, 12));
		
		
		//로그인 창 비밀번호 입력 라벨
		JLabel pw_label = new JLabel("비밀번호 입력");
		pw_label.setBounds(280, 400, 100, 50);
		pw_label.setFont(new Font("바탕", Font.ITALIC, 12));
		
		
		//로그인 창 비밀번호 입력 패널
		JTextField login_pw = new JTextField(20);
		login_pw.setBounds(380, 400, 200, 40);
		login_pw.setFont(new Font("바탕", Font.ITALIC, 12));
		
	
		
		//로그인 창 로그인 버튼
		JButton login_quiz = new JButton("로그인");
		login_quiz.setBounds(640, 340, 80, 120);
		login_quiz.addMouseListener(new MouseAdapter() {
			
			// 1.클릭 -> 대기실
			// 2.클릭 -> 아이디, 비번 체크 -> 객체 소환?
			@Override 
			public void mouseClicked(MouseEvent arg0) {
				
				

				super.mouseClicked(arg0);
			}
		});
		
		//로그인 창 회원가입 버튼
		JButton sign_up = new JButton("회원가입");
		sign_up.setBounds(350, 500, 100, 20);
		sign_up.setFont(new Font("바탕", Font.ITALIC, 10));
		sign_up.addMouseListener(new MouseAdapter() { 
			
			//클릭 -> 회원가입 패널
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Sign_Up su = new Sign_Up();

				super.mouseClicked(arg0);
			}
			
		});

		
		//로그인 창 아이디 찾기 버튼
		JButton find_id = new JButton("아이디 찾기");
		find_id.setBounds(450, 500, 100, 20);
		find_id.setFont(new Font("바탕", Font.ITALIC, 10));
		find_id.addMouseListener(new MouseAdapter() { 
			
			//클릭 -> 아이디 찾기 패널
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Find_Id fi = new Find_Id();
				
				super.mouseClicked(arg0);
			}
			
		});
	
		//로그인 창 비밀번호 찾기
		JButton find_pw = new JButton("비밀번호 찾기");
		find_pw.setBounds(550, 500, 100, 20);
		find_pw.setFont(new Font("바탕", Font.ITALIC, 10));
		find_pw.addMouseListener(new MouseAdapter() { 
			
			//클릭 -> 비밀번호 찾기 패널
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Find_Pwd fp = new Find_Pwd();

				super.mouseClicked(arg0);
			}
			
		});
		
		
		
		
		//패널 합치기
		super.add(login);
		login.add(sopa);
		login.add(id_label);
		login.add(login_id);
		login.add(pw_label);
		login.add(login_pw);
		login.add(login_quiz);
		login.add(sign_up);
		login.add(find_id);
		login.add(find_pw);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		Login_Panel lp = new Login_Panel();
	}
}
