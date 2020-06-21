package com.kh.sopa.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.kh.sopa.controller.LoginController;
import com.kh.sopa.model.vo.User_VO;





public class Sign_Up extends JFrame{
	
	//회원 가입
	
	private Login_Panel lp;
	private JPanel contentPane;
	private User_VO uv;
	
	
	
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
	
		
		// 가입하기 패널
		JPanel sign = new JPanel();
		sign.setBounds(0, 0, 1024, 768);
		sign.setBackground(Color.white);
		sign.setLayout(null);
		
				
		//sopa 라벨
		JLabel sopa = new JLabel("S.O.P.A");
		sopa.setBounds(430, 100, 300, 200);
		sopa.setFont(new Font("바탕", Font.ITALIC, 50));

		
		
		//sopa 계정을 만들어요 라벨
		JLabel text = new JLabel("계정을 만들어요");
		text.setBounds(430, 200, 200, 100);
		sopa.setFont(new Font("바탕", Font.ITALIC, 20));

		
		
		//아이디 입력창
		JTextField sign_id = new JTextField(10);
		sign_id.setBounds(390, 340, 200, 40);
		sign_id.setText("아이디를 입력하세요");
		sign_id.setFont(new Font("바탕", Font.ITALIC, 12));
		sign_id.addMouseListener(new MouseAdapter() {
			
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				//클릭하면 입력할 수 있게 만들어봄.
				sign_id.setText("");
				sign_id.requestFocus();
				sign_id.requestFocus();
				super.mouseClicked(arg0);
			}
		});
		
		//비밀번호 입력창
		JTextField sign_pw = new JTextField(10);
		sign_pw.setBounds(390, 380, 200, 40);
		sign_pw.setFont(new Font("바탕", Font.ITALIC, 12));
		sign_pw.setText("비밀번호를 입력하세요");
		sign_pw.addMouseListener(new MouseAdapter() {
			
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				
				sign_pw.setText("");
				sign_pw.requestFocus();
				sign_pw.requestFocus();
				super.mouseClicked(arg0);
			}
		});
		
		
		//비밀번호 확인 입력창
		JTextField check_pw = new JTextField(10);
		check_pw.setBounds(390, 420, 200, 40);
		check_pw.setFont(new Font("바탕", Font.ITALIC, 12));
		check_pw.setText("비밀 번호를 다시 입력하세요");
		check_pw.addMouseListener(new MouseAdapter() {
			
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				
				check_pw.setText("");
				check_pw.requestFocus();
				check_pw.requestFocus();
				super.mouseClicked(arg0);
			}
		});
		
		
		
		
		//전화번호 입력창
		JTextField sign_phone = new JTextField(10);
		sign_phone.setBounds(390, 420, 200, 40);
		sign_phone.setFont(new Font("바탕", Font.ITALIC, 12));
		sign_phone.setText("아이디를 입력하세요");
		sign_phone.addMouseListener(new MouseAdapter() {
			
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				
				sign_phone.setText("");
				sign_phone.requestFocus();
				sign_phone.requestFocus();
				super.mouseClicked(arg0);
			}
		});
		
		
		//뒤로가기 버튼
		JButton back = new JButton("뒤로가기");
		back.setBounds(390, 500, 110, 20);
		back.setFont(new Font("바탕", Font.ITALIC, 12));
		back.addMouseListener(new MouseAdapter() {
			
			// 1.클릭 -> 로그인 화면
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				lp = new Login_Panel();
				super.mouseClicked(arg0);
			}
		});
		

		
		//회원가입 버튼
		JButton login_button = new JButton("회원가입");
		login_button.setBounds(500, 500, 110, 20);
		sopa.setFont(new Font("바탕", Font.ITALIC, 20));
		login_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object uo = e.getSource();
				
				uv.setUser_id(sign_id.getText());//널포인터 왜?
				uv.setUser_pw(sign_pw.getText());
				if(sign_pw != check_pw) {
					JOptionPane.showMessageDialog(null, "비밀번호와 비밀번호 재 입력을 다시 입력해주세요");

				} 
				uv.setUser_phone_number(sign_phone.getText());
				
				JOptionPane.showMessageDialog(null, "회원가입을 축하합니다!!");
				new LoginController().userOutput();
				new Login_Panel();
				sign.setVisible(false);
				//change판낼 만들어서 적용하는게 나을듯
				
			}
		});
			
			
				
				
				
				
				
				
			

		
		
		//패널 합치기
		super.add(sign);
		sign.add(sopa);
		sign.add(text);
		sign.add(sign_id);
		sign.add(sign_pw);
		sign.add(sign_phone);
		sign.add(check_pw);
		sign.add(back);
		sign.add(login_button);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
