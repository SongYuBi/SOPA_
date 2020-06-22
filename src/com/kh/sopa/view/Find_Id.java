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
	private JPanel contentPane, find_id;
	private JLabel sopa, text;
	private JTextField phone;
	private JButton back, check;
	private Login_Panel lp;
	
	// ���̵� ã��
	
	public Find_Id() {
		super();
		JPanel contentPane;
		setTitle("���̵� ã��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//���̵� ã�� �г�
		find_id = new JPanel();
		find_id.setBounds(0, 0, 1024, 768);
		find_id.setBackground(new Color(252, 228, 167)); 
		find_id.setLayout(null);
		super.add(find_id);

		//sopa ��
		sopa = new JLabel("S.O.P.A");
		sopa.setBounds(390, 250, 124, 78);
		sopa.setFont(new Font("����", Font.ITALIC, 10));
		find_id.add(sopa);
		
		//���̵� ã�� �;�� ��
		text = new JLabel("���̵� ã�� �;��");
		text.setBounds(390, 400, 124, 78);
		text.setFont(new Font("����", Font.ITALIC, 10));
		find_id.add(text);
		
		//��ȭ��ȣ �Է�â
		phone = new JTextField(20);
		phone.setBounds(390, 480, 124, 78);
		phone.setFont(new Font("����", Font.ITALIC, 10));
		find_id.add(phone);
		
		//�ڷΰ��� ��ư
		back = new JButton("�ڷΰ���");
		back.setBounds(390, 550, 124, 78);
		back.setFont(new Font("����", Font.ITALIC, 10));
		find_id.add(back);
		back.addMouseListener(new MouseAdapter() {
			
			// 1.Ŭ�� -> �α���ȭ��
			@Override 
			public void mouseClicked(MouseEvent arg0) {
				
				lp = new Login_Panel();
				dispose();
				super.mouseClicked(arg0);
			}
		});
		
		
		//Ȯ�� ��ư
		check = new JButton("Ȯ��");
		check.setBounds(600, 550, 124, 78);
		check.setFont(new Font("����", Font.ITALIC, 10));
		find_id.add(check);
		check.addMouseListener(new MouseAdapter() {
			
			
			//1. ��ȭ��ȣ ���� ���� üũ 
			//1-1. ���� : ���� ���� ���
			//1-2. ���� : ���̵� ���
			//2. �α������� ���ư���
			@Override 
			public void mouseClicked(MouseEvent arg0) {


				lp = new Login_Panel();
				dispose();
				super.mouseClicked(arg0);
			}
		});

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
