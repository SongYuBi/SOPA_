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
		
		//�α��� â sopa ��\
		JLabel sopa = new JLabel("S.O.P.A");
		sopa.setSize(500, 500);
		sopa.setLocation(100, 100);
		sopa.setFont(new Font("����", Font.ITALIC, 10));
		
		//�α��� â ���̵� �Է� ��
		JLabel id_label = new JLabel("���̵� �Է�");
		id_label.setSize(50, 30);
		id_label.setLocation(150, 90);
		id_label.setFont(new Font("����", Font.ITALIC, 5));
		
		//�α��� â ���̵� �Է� �г�
		JTextField login_id = new JTextField(20);
		login_id.setSize(50, 30);
		login_id.setLocation(220, 90);
		login_id.setFont(new Font("����", Font.ITALIC, 10));
		
		//�α��� â ��й�ȣ �Է� ��
		JLabel pwd_label = new JLabel("��й�ȣ �Է�");
		pwd_label.setSize(50, 30);
		pwd_label.setLocation(150, 120);
		pwd_label.setFont(new Font("����", Font.ITALIC, 5));
		
		//�α��� â ��й�ȣ �Է� �г�
		JTextField login_pwd = new JTextField(20);
		login_pwd.setSize(50, 30);
		login_pwd.setLocation(220, 120);
		login_pwd.setFont(new Font("����", Font.ITALIC, 10));
		
		//�α��� â �α��� ��ư
		JButton login_quiz = new JButton("�α���");
		login_quiz.setSize(100, 50);
		login_quiz.setLocation(350, 100);
		login_quiz.addMouseListener(new MouseAdapter() {
			
			// Ŭ�� -> ����
			@Override 
			public void mouseClicked(MouseEvent arg0) {


				super.mouseClicked(arg0);
			}
		});
		
		//�α��� â ȸ������ ��ư
		JButton sign_up = new JButton("��� ��ȣ ã��");
		sign_up.setSize(50, 50);
		sign_up.setLocation(150, 500);
		sign_up.setFont(new Font("����", Font.ITALIC, 10));
		sign_up.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ȸ������ �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {


				super.mouseClicked(arg0);
			}
			
		});

		
		//�α��� â ���̵� ã�� ��ư
		JButton find_id = new JButton("���̵� ã��");
		find_id.setSize(50, 50);
		find_id.setLocation(210, 500);
		find_id.setFont(new Font("����", Font.ITALIC, 10));
		find_id.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ���̵� ã�� �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {


				super.mouseClicked(arg0);
			}
			
		});
	
		//�α��� â ��й�ȣ ã��
		JButton find_pwd = new JButton("��й�ȣ ã��");
		find_pwd.setSize(50, 50);
		find_pwd.setLocation(260, 500);
		find_pwd.setFont(new Font("����", Font.ITALIC, 10));
		find_pwd.addMouseListener(new MouseAdapter() { 
			
			//Ŭ�� -> ��й�ȣ ã�� �г�
			@Override
			public void mouseClicked(MouseEvent arg0) {


				super.mouseClicked(arg0);
			}
			
		});
		
		//�α��� ������ �г�
		JPanel login = new JPanel();
		login.setBounds(0, 0, 1024, 768);
		login.setBackground(new Color(252, 228, 167)); //rgb �־ �غ� 
		login.setLayout(null);
		
		
		//�г� ��ġ��
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
