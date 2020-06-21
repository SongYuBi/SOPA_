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
		setTitle("�α��� ȭ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		//�α��� ������ �г�
		JPanel login = new JPanel();
		login.setBounds(0, 0, 1024, 768);
		login.setBackground(new Color(252, 228, 167)); //rgb �־ �غ� 
		login.setLayout(null);
		
		//�α��� â sopa ��
		JLabel sopa = new JLabel("S.O.P.A");
		sopa.setBounds(430, 100, 300, 200);
		sopa.setFont(new Font("����", Font.ITALIC, 50));
		
		//�α��� â ���̵� �Է� ��
		JLabel id_label = new JLabel("���̵� �Է�");
		id_label.setBounds(280, 350, 100, 50);
		id_label.setFont(new Font("����", Font.ITALIC, 12));
		
		//�α��� â ���̵� �Է� �г�
		JTextField login_id = new JTextField(20);
		login_id.setBounds(380, 350, 200, 40);
		login_id.setFont(new Font("����", Font.ITALIC, 12));
		
		
		//�α��� â ��й�ȣ �Է� ��
		JLabel pw_label = new JLabel("��й�ȣ �Է�");
		pw_label.setBounds(280, 400, 100, 50);
		pw_label.setFont(new Font("����", Font.ITALIC, 12));
		
		
		//�α��� â ��й�ȣ �Է� �г�
		JTextField login_pw = new JTextField(20);
		login_pw.setBounds(380, 400, 200, 40);
		login_pw.setFont(new Font("����", Font.ITALIC, 12));
		
	
		
		//�α��� â �α��� ��ư
		JButton login_quiz = new JButton("�α���");
		login_quiz.setBounds(640, 340, 80, 120);
		login_quiz.addMouseListener(new MouseAdapter() {
			
			// 1.Ŭ�� -> ����
			// 2.Ŭ�� -> ���̵�, ��� üũ -> ��ü ��ȯ?
			@Override 
			public void mouseClicked(MouseEvent arg0) {
				
				

				super.mouseClicked(arg0);
			}
		});
		
		//�α��� â ȸ������ ��ư
		JButton sign_up = new JButton("ȸ������");
		sign_up.setBounds(350, 500, 100, 20);
		sign_up.setFont(new Font("����", Font.ITALIC, 10));
		sign_up.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ȸ������ �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Sign_Up su = new Sign_Up();

				super.mouseClicked(arg0);
			}
			
		});

		
		//�α��� â ���̵� ã�� ��ư
		JButton find_id = new JButton("���̵� ã��");
		find_id.setBounds(450, 500, 100, 20);
		find_id.setFont(new Font("����", Font.ITALIC, 10));
		find_id.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ���̵� ã�� �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Find_Id fi = new Find_Id();
				
				super.mouseClicked(arg0);
			}
			
		});
	
		//�α��� â ��й�ȣ ã��
		JButton find_pw = new JButton("��й�ȣ ã��");
		find_pw.setBounds(550, 500, 100, 20);
		find_pw.setFont(new Font("����", Font.ITALIC, 10));
		find_pw.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ��й�ȣ ã�� �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Find_Pwd fp = new Find_Pwd();

				super.mouseClicked(arg0);
			}
			
		});
		
		
		
		
		//�г� ��ġ��
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
