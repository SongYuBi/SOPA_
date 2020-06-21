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
	
	//ȸ�� ����
	
	private Login_Panel lp;
	private JPanel contentPane;
	private User_VO uv;
	
	
	
	public Sign_Up() {
		super();
		JPanel contentPane;
		setTitle("ȸ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		
		// �����ϱ� �г�
		JPanel sign = new JPanel();
		sign.setBounds(0, 0, 1024, 768);
		sign.setBackground(Color.white);
		sign.setLayout(null);
		
				
		//sopa ��
		JLabel sopa = new JLabel("S.O.P.A");
		sopa.setBounds(430, 100, 300, 200);
		sopa.setFont(new Font("����", Font.ITALIC, 50));

		
		
		//sopa ������ ������ ��
		JLabel text = new JLabel("������ ������");
		text.setBounds(430, 200, 200, 100);
		sopa.setFont(new Font("����", Font.ITALIC, 20));

		
		
		//���̵� �Է�â
		JTextField sign_id = new JTextField(10);
		sign_id.setBounds(390, 340, 200, 40);
		sign_id.setText("���̵� �Է��ϼ���");
		sign_id.setFont(new Font("����", Font.ITALIC, 12));
		sign_id.addMouseListener(new MouseAdapter() {
			
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				//Ŭ���ϸ� �Է��� �� �ְ� ����.
				sign_id.setText("");
				sign_id.requestFocus();
				sign_id.requestFocus();
				super.mouseClicked(arg0);
			}
		});
		
		//��й�ȣ �Է�â
		JTextField sign_pw = new JTextField(10);
		sign_pw.setBounds(390, 380, 200, 40);
		sign_pw.setFont(new Font("����", Font.ITALIC, 12));
		sign_pw.setText("��й�ȣ�� �Է��ϼ���");
		sign_pw.addMouseListener(new MouseAdapter() {
			
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				
				sign_pw.setText("");
				sign_pw.requestFocus();
				sign_pw.requestFocus();
				super.mouseClicked(arg0);
			}
		});
		
		
		//��й�ȣ Ȯ�� �Է�â
		JTextField check_pw = new JTextField(10);
		check_pw.setBounds(390, 420, 200, 40);
		check_pw.setFont(new Font("����", Font.ITALIC, 12));
		check_pw.setText("��� ��ȣ�� �ٽ� �Է��ϼ���");
		check_pw.addMouseListener(new MouseAdapter() {
			
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				
				check_pw.setText("");
				check_pw.requestFocus();
				check_pw.requestFocus();
				super.mouseClicked(arg0);
			}
		});
		
		
		
		
		//��ȭ��ȣ �Է�â
		JTextField sign_phone = new JTextField(10);
		sign_phone.setBounds(390, 420, 200, 40);
		sign_phone.setFont(new Font("����", Font.ITALIC, 12));
		sign_phone.setText("���̵� �Է��ϼ���");
		sign_phone.addMouseListener(new MouseAdapter() {
			
			
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				
				sign_phone.setText("");
				sign_phone.requestFocus();
				sign_phone.requestFocus();
				super.mouseClicked(arg0);
			}
		});
		
		
		//�ڷΰ��� ��ư
		JButton back = new JButton("�ڷΰ���");
		back.setBounds(390, 500, 110, 20);
		back.setFont(new Font("����", Font.ITALIC, 12));
		back.addMouseListener(new MouseAdapter() {
			
			// 1.Ŭ�� -> �α��� ȭ��
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				lp = new Login_Panel();
				super.mouseClicked(arg0);
			}
		});
		

		
		//ȸ������ ��ư
		JButton login_button = new JButton("ȸ������");
		login_button.setBounds(500, 500, 110, 20);
		sopa.setFont(new Font("����", Font.ITALIC, 20));
		login_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object uo = e.getSource();
				
				uv.setUser_id(sign_id.getText());//�������� ��?
				uv.setUser_pw(sign_pw.getText());
				if(sign_pw != check_pw) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� ��й�ȣ �� �Է��� �ٽ� �Է����ּ���");

				} 
				uv.setUser_phone_number(sign_phone.getText());
				
				JOptionPane.showMessageDialog(null, "ȸ�������� �����մϴ�!!");
				new LoginController().userOutput();
				new Login_Panel();
				sign.setVisible(false);
				//change�ǳ� ���� �����ϴ°� ������
				
			}
		});
			
			
				
				
				
				
				
				
			

		
		
		//�г� ��ġ��
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
