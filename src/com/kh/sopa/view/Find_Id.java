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
		
		//��ǥ �ٽ��ؾ���. ������ ������ ������

		//sopa ��
		JLabel sopa = new JLabel("S.O.P.A");
		sopa.setBounds(390, 250, 124, 78);
		sopa.setFont(new Font("����", Font.ITALIC, 10));
		
		//���̵� ã�� �;�� ��
		JLabel text = new JLabel("���̵� ã�� �;��");
		text.setBounds(390, 400, 124, 78);
		text.setFont(new Font("����", Font.ITALIC, 10));
		
		//��ȭ��ȣ �Է�â
		JTextField phone = new JTextField(20);
		phone.setBounds(390, 480, 124, 78);
		phone.setFont(new Font("����", Font.ITALIC, 10));
		
		//�ڷΰ��� ��ư
		JButton back = new JButton("�ڷΰ���");
		back.setBounds(390, 550, 124, 78);
		back.setFont(new Font("����", Font.ITALIC, 10));
		back.addMouseListener(new MouseAdapter() {
			
			// 1.Ŭ�� -> �α���ȭ��
			@Override 
			public void mouseClicked(MouseEvent arg0) {
				
				lp = new Login_Panel();
				
				super.mouseClicked(arg0);
			}
		});
		
		
		//Ȯ�� ��ư
		JButton check = new JButton("Ȯ��");
		check.setBounds(600, 550, 124, 78);
		check.setFont(new Font("����", Font.ITALIC, 10));
		check.addMouseListener(new MouseAdapter() {
			
			
			//1. ��ȭ��ȣ ���� ���� üũ 
			//1-1. ���� : ���� ���� ���
			//1-2. ���� : ���̵� ���
			//2. �α������� ���ư���
			@Override 
			public void mouseClicked(MouseEvent arg0) {


				lp = new Login_Panel();
				super.mouseClicked(arg0);
			}
		});

		
		
		//���̵� ã�� �г�
		JPanel find_id = new JPanel();
		find_id.setBounds(0, 0, 1024, 768);
		find_id.setBackground(new Color(252, 228, 167)); 
		find_id.setLayout(null);
		
		
		
		//��ġ��
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
