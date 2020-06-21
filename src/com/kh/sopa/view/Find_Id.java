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

public class Find_Id extends JFrame{
	private JPanel contentPane;
	private Login_Panel lp;
	
	// 아이디 찾기
	
	public Find_Id() {
		super();
		JPanel contentPane;
		setTitle("아이디 찾기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//좌표 다시해야함. 동일한 곳에서 시작함

		//sopa 라벨
		JLabel sopa = new JLabel("S.O.P.A");
		sopa.setBounds(390, 250, 124, 78);
		sopa.setFont(new Font("바탕", Font.ITALIC, 10));
		
		//아이디를 찾고 싶어요 라벨
		JLabel text = new JLabel("아이디를 찾고 싶어요");
		text.setBounds(390, 400, 124, 78);
		text.setFont(new Font("바탕", Font.ITALIC, 10));
		
		//전화번호 입력창
		JTextField phone = new JTextField(20);
		phone.setBounds(390, 480, 124, 78);
		phone.setFont(new Font("바탕", Font.ITALIC, 10));
		
		//뒤로가요 버튼
		JButton back = new JButton("뒤로가요");
		back.setBounds(390, 550, 124, 78);
		back.setFont(new Font("바탕", Font.ITALIC, 10));
		back.addMouseListener(new MouseAdapter() {
			
			// 1.클릭 -> 로그인화면
			@Override 
			public void mouseClicked(MouseEvent arg0) {
				
				lp = new Login_Panel();
				
				super.mouseClicked(arg0);
			}
		});
		
		
		//확인 버튼
		JButton check = new JButton("확인");
		check.setBounds(600, 550, 124, 78);
		check.setFont(new Font("바탕", Font.ITALIC, 10));
		check.addMouseListener(new MouseAdapter() {
			
			
			//1. 전화번호 동일 여부 체크 
			//1-1. 없음 : 전번 없다 띄움
			//1-2. 있음 : 아이디 띠움
			//2. 로그인으로 돌아가기
			@Override 
			public void mouseClicked(MouseEvent arg0) {


				lp = new Login_Panel();
				super.mouseClicked(arg0);
			}
		});

		
		
		//아이디 찾기 패널
		JPanel find_id = new JPanel();
		find_id.setBounds(0, 0, 1024, 768);
		find_id.setBackground(new Color(252, 228, 167)); 
		find_id.setLayout(null);
		
		
		
		//합치기
		super.add(find_id);
		find_id.add(sopa);
		find_id.add(text);
		find_id.add(phone);
		find_id.add(back);
		find_id.add(check);
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
