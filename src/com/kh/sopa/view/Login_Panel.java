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
	private JPanel contentPane, login;
	private JLabel sopa, id_label, pw_label;
	private JTextField login_id, login_pw;
	private JButton login_quiz, sign_up, find_id, find_pw;
	
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
		
		
		//로그인 페이지 패
		login = new JPanel();
		login.setBounds(0, 0, 1024, 768);
		login.setBackground(new Color(252, 228, 167));  
		login.setLayout(null);
		super.add(login);
		
		//로그인 창 sopa라벨
		sopa = new JLabel("S.O.P.A");
		sopa.setBounds(430, 100, 300, 200);
		sopa.setFont(new Font("바탕", Font.ITALIC, 50));
		login.add(sopa);
		
		// 로그인 창 아이디 입력 라벨
		id_label = new JLabel("아이디 입력");
		id_label.setBounds(280, 350, 100, 50);
		id_label.setFont(new Font("바탕", Font.ITALIC, 12));
		login.add(id_label);
		
		//로그인 창 아이디 입력 패널
		login_id = new JTextField(20);
		login_id.setBounds(380, 350, 200, 40);
		login_id.setFont(new Font("바탕", Font.ITALIC, 12));
		login.add(login_id);
		
		
		//로그인 창 비밀번호 입력 라벨
		pw_label = new JLabel("비밀번호 입력");
		pw_label.setBounds(280, 400, 100, 50);
		pw_label.setFont(new Font("바탕", Font.ITALIC, 12));
		login.add(pw_label);
		
		
		//로그인 창 비밀번호 입력 패널
		login_pw = new JTextField(20);
		login_pw.setBounds(380, 400, 200, 40);
		login_pw.setFont(new Font("바탕", Font.ITALIC, 12));
		login.add(login_pw);
		
	
		
		//로그인 창 로그인 버튼
		login_quiz = new JButton("로그인");
		login_quiz.setBounds(640, 340, 80, 120);
		login.add(login_quiz);
		login_quiz.addMouseListener(new MouseAdapter() {
			
			// 1.클릭 -> 대기
			// 2.클릭 -> 아이디, 비번 체크 -> 객체 소환?
			@Override 
			public void mouseClicked(MouseEvent arg0) {
				
				dispose();

				super.mouseClicked(arg0);
			}
		});
		
		//로그인 창 아이디 찾기 버
		sign_up = new JButton("아이디 찾");
		sign_up.setBounds(350, 500, 100, 20);
		sign_up.setFont(new Font("바탕", Font.ITALIC, 10));
		login.add(sign_up);
		sign_up.addMouseListener(new MouseAdapter() { 
			
			//클릭 -> 회원가입 패널
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Sign_Up su = new Sign_Up();
				dispose();

				super.mouseClicked(arg0);
			}
			
		});

		
		//로그인 창 아이디 찾기 버튼
		find_id = new JButton("아이디 찾기");
		find_id.setBounds(450, 500, 100, 20);
		find_id.setFont(new Font("바탕", Font.ITALIC, 10));
		login.add(find_id);
		find_id.addMouseListener(new MouseAdapter() { 
			
			//클릭 -> 아이디 찾기 패널
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Find_Id fi = new Find_Id();
				dispose();
				
				super.mouseClicked(arg0);
			}
			
		});
	
		//로그인 창 비밀번호 찾기
		find_pw = new JButton("비밀번호 찾기");
		find_pw.setBounds(550, 500, 100, 20);
		find_pw.setFont(new Font("바탕", Font.ITALIC, 10));
		login.add(find_pw);
		find_pw.addMouseListener(new MouseAdapter() { 
			
			//클릭 -> 비밀번호 찾기 패널
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Find_Pwd fp = new Find_Pwd();
				dispose();

				super.mouseClicked(arg0);
			}
			
		});
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		Login_Panel lp = new Login_Panel();
	}
}
