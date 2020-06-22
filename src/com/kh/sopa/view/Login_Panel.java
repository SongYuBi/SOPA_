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
		setTitle("�α��� ȭ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		//�α��� ������ �г�
		login = new JPanel();
		login.setBounds(0, 0, 1024, 768);
		login.setBackground(new Color(252, 228, 167));  
		login.setLayout(null);
		super.add(login);
		
		//�α��� â sopa ��
		sopa = new JLabel("S.O.P.A");
		sopa.setBounds(430, 100, 300, 200);
		sopa.setFont(new Font("����", Font.ITALIC, 50));
		login.add(sopa);
		
		//�α��� â ���̵� �Է� ��
		id_label = new JLabel("���̵� �Է�");
		id_label.setBounds(280, 350, 100, 50);
		id_label.setFont(new Font("����", Font.ITALIC, 12));
		login.add(id_label);
		
		//�α��� â ���̵� �Է� �г�
		login_id = new JTextField(20);
		login_id.setBounds(380, 350, 200, 40);
		login_id.setFont(new Font("����", Font.ITALIC, 12));
		login.add(login_id);
		
		
		//�α��� â ��й�ȣ �Է� ��
		pw_label = new JLabel("��й�ȣ �Է�");
		pw_label.setBounds(280, 400, 100, 50);
		pw_label.setFont(new Font("����", Font.ITALIC, 12));
		login.add(pw_label);
		
		
		//�α��� â ��й�ȣ �Է� �г�
		login_pw = new JTextField(20);
		login_pw.setBounds(380, 400, 200, 40);
		login_pw.setFont(new Font("����", Font.ITALIC, 12));
		login.add(login_pw);
		
	
		
		//�α��� â �α��� ��ư
		login_quiz = new JButton("�α���");
		login_quiz.setBounds(640, 340, 80, 120);
		login.add(login_quiz);
		login_quiz.addMouseListener(new MouseAdapter() {
			
			// 1.Ŭ�� -> ����
			// 2.Ŭ�� -> ���̵�, ��� üũ -> ��ü ��ȯ?
			@Override 
			public void mouseClicked(MouseEvent arg0) {
				
				dispose();

				super.mouseClicked(arg0);
			}
		});
		
		//�α��� â ȸ������ ��ư
		sign_up = new JButton("ȸ������");
		sign_up.setBounds(350, 500, 100, 20);
		sign_up.setFont(new Font("����", Font.ITALIC, 10));
		login.add(sign_up);
		sign_up.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ȸ������ �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Sign_Up su = new Sign_Up();
				dispose();

				super.mouseClicked(arg0);
			}
			
		});

		
		//�α��� â ���̵� ã�� ��ư
		find_id = new JButton("���̵� ã��");
		find_id.setBounds(450, 500, 100, 20);
		find_id.setFont(new Font("����", Font.ITALIC, 10));
		login.add(find_id);
		find_id.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ���̵� ã�� �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Find_Id fi = new Find_Id();
				dispose();
				
				super.mouseClicked(arg0);
			}
			
		});
	
		//�α��� â ��й�ȣ ã��
		find_pw = new JButton("��й�ȣ ã��");
		find_pw.setBounds(550, 500, 100, 20);
		find_pw.setFont(new Font("����", Font.ITALIC, 10));
		login.add(find_pw);
		find_pw.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ��й�ȣ ã�� �г�
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
