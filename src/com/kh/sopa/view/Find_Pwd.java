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

import com.kh.sopa.controller.LoginController;



public class Find_Pwd extends JFrame{
	private JPanel contentPane, find_pwd;
	private JLabel sopa, text;
	private static JTextField user_id;
	private static JTextField user_phone;
	private JButton back, check;
	private Login_Panel lp;
	
	public Find_Pwd() {
		super();
		JPanel contentPane;
		setTitle("��й�ȣ ã��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//��й�ȣ ã�� �г�
		find_pwd = new JPanel();
		find_pwd.setBounds(0, 0, 1024, 768);
		find_pwd.setBackground(new Color(252, 228, 167));  
		find_pwd.setLayout(null);
		super.add(find_pwd);
		
		//sopa ��
		sopa = new JLabel("S.O.P.A");
		sopa.setBounds(390, 250, 124, 78);
		sopa.setFont(new Font("����", Font.ITALIC, 10));
		find_pwd.add(sopa);
		
		
		//��й�ȣ�� �ٲٰ� �;�� ��
		text = new JLabel("��й�ȣ�� �ٲٰ� �;��");
		text.setBounds(390, 300, 124, 78);
		sopa.setFont(new Font("����", Font.ITALIC, 10));
		find_pwd.add(text);
		
		
		//���̵� �Է�â
		user_id = new JTextField(10);
		user_id.setBounds(390, 420, 124, 78);
		user_id.setFont(new Font("����", Font.ITALIC, 10));
		find_pwd.add(user_id);
		
		
		//��ȭ��ȣ �Է�â
		user_phone = new JTextField(10);
		user_phone.setBounds(390, 460, 124, 78);
		find_pwd.add(user_phone);
		user_phone.setFont(new Font("����", Font.ITALIC, 10));
		
		
		//�ڷΰ��� ��ư
		back = new JButton("�ڷΰ���");
		back.setBounds(390, 500, 124, 78);
		sopa.setFont(new Font("����", Font.ITALIC, 10));
		find_pwd.add(back);
		back.addMouseListener(new MouseAdapter() {
			
			// 1.Ŭ�� -> �α��� ȭ��
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				lp = new Login_Panel();
				
				super.mouseClicked(arg0);
			}
		});
		
		
		//Ȯ�� ��ư
		check = new JButton("Ȯ��");
		check.setBounds(600, 500, 124, 78);
		check.setFont(new Font("����", Font.ITALIC, 10));
		find_pwd.add(check);
		check.addMouseListener(new MouseAdapter() {
			
			
			//1. ���̵� ���� ���� üũ 
			//1-1. ���� : ���̵� ���� ���
			//1-2. ���� : ��ȭ��ȣ üũ
			//2. ��ȭ��ȣ ���� ���� üũ
			//2-1. ���� : ��ȭ��ȣ �ٸ��� ���
			//2-2. ���� : ��� ���� Ȥ�� ���ο� ��� ����
			//3. �α������� ���ư���
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {
				System.out.println(user_id.getText());
				System.out.println(user_phone.getText());

				LoginController lc = new LoginController();
				lc.findPw();
				super.mouseClicked(arg0);
			}
		});

	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
}
	
		public static String getId() {
			
			return user_id.getText();
			
		}
		
		public static String getPhone() {
			
			return user_phone.getText();
		}
}
