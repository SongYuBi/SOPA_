package com.kh.sopa.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Properties;

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
	private JPanel contentPane, sign;
	private JButton login_button, back;
	private JLabel sopa, text;
	private JTextField sign_phone, check_pw, sign_pw, sign_id;
	private User_VO uv = new User_VO();
	private LoginController lc;
	private Properties prop;
	private ArrayList al;
	
	
	
	
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
		sign = new JPanel();
		sign.setBounds(0, 0, 1024, 768);
		sign.setBackground(Color.white);
		sign.setLayout(null);
		super.add(sign);
		
				
		//sopa ��
		sopa = new JLabel("S.O.P.A");
		sopa.setBounds(430, 100, 300, 200);
		sopa.setFont(new Font("����", Font.ITALIC, 50));
		sign.add(sopa);

		
		
		//sopa ������ ������ ��
		text = new JLabel("������ ������");
		text.setBounds(430, 200, 200, 100);
		sopa.setFont(new Font("����", Font.ITALIC, 20));
		sign.add(text);

		
		
		//���̵� �Է�â
		sign_id = new JTextField(10);
		sign_id.setBounds(390, 340, 200, 40);
		sign_id.setFont(new Font("����", Font.ITALIC, 12));
		sign.add(sign_id);
		uv.setUser_id(sign_id.getText());
		
		
		
		//��й�ȣ �Է�â
		sign_pw = new JTextField(10);
		sign_pw.setBounds(390, 380, 200, 40);
		sign_pw.setFont(new Font("����", Font.ITALIC, 12));
		sign.add(sign_pw);
		uv.setUser_pw(sign_pw.getText());
		
		
		//��й�ȣ Ȯ�� �Է�â
		check_pw = new JTextField(10);
		check_pw.setBounds(390, 420, 200, 40);
		check_pw.setFont(new Font("����", Font.ITALIC, 12));
		sign.add(check_pw);
		
		//��ȭ��ȣ �Է�â
		sign_phone = new JTextField(10);
		sign_phone.setBounds(390, 420, 200, 40);
		sign_phone.setFont(new Font("����", Font.ITALIC, 12));
		sign_phone.setText("" + uv.getUser_phone_number());
		sign.add(sign_phone);
		
		
		
		//�ڷΰ��� ��ư
		back = new JButton("�ڷΰ���");
		back.setBounds(390, 500, 110, 20);
		back.setFont(new Font("����", Font.ITALIC, 12));
		sign.add(back);
		back.addMouseListener(new MouseAdapter() {
			
			// 1.Ŭ�� -> �α��� ȭ��
			@Override 
			public void mouseClicked(MouseEvent arg0) {

				lp = new Login_Panel();
				dispose();
				super.mouseClicked(arg0);
			}
		});
		

		
		//ȸ������ ��ư
		login_button = new JButton("ȸ������");
		login_button.setBounds(500, 500, 110, 20);
		sopa.setFont(new Font("����", Font.ITALIC, 20));
		sign.add(login_button);
		login_button.addActionListener(new ActionListener() {
			
			@Override
public void actionPerformed(ActionEvent e) {
				
				//���� ��ư ������ ������
				uv = new User_VO();
				uv.setUser_id(sign_id.getText());
				System.out.println(uv.getUser_id());
				uv.setUser_pw(sign_pw.getText());
				System.out.println(uv.getUser_pw());
				uv.setUser_phone_number(sign_phone.getText());
				System.out.println(uv.getUser_phone_number());


				al = new ArrayList();
				al.add(uv);
				
				
				
						
				for(int i = 0; i < al.size(); i++) {
					al.get(i);
					System.out.println(i);
				//�����ȸ
				}
				
				lc = new LoginController();
				lc.user_make(uv);
				new Login_Panel();
				dispose();
							
			}
		});
		
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
		
}
