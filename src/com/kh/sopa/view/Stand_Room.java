package com.kh.sopa.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.kh.sopa.controller.Client_Contorller;

public class Stand_Room extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextArea jta = new JTextArea(14, 25);
	private JTextField jtf = new JTextField(25);
	private Client_Contorller client = new  Client_Contorller();
	private String user_id;
	private JLabel user_label = new JLabel(); 
	//panel_stand_room -> ���� �⺻���ε� �г�
	//panel_south_menu -> �ϴܿ� �޴��� 
	//panel_south_menu_chat -> �ϴܿ� �޴��� �ȿ� ä�ø� �����س��� ��
	//panel_north_userhi(��) -> ������ ������ ���� ������ �˸��� ��.
	public Stand_Room(String user_id) {
		this.user_id = user_id;
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		// View������ ���⼭����
		setTitle("����");
		JPanel panel_stand_room = new JPanel();
		panel_stand_room.setLayout(null);
		panel_stand_room.setBounds(0, 0, 1024, 768);
		panel_stand_room.setBackground(Color.white);

		user_label.setFont(new Font("���� ���", Font.PLAIN, 30));
		user_label.setBackground(Color.YELLOW);
		user_label.setBounds(0, 0, 1024, 100);
		
		panel_stand_room.add(user_label,BorderLayout.NORTH);
		
		JPanel panel_south_menu = new JPanel();			//�ؿ� �޴� �г�
		
		panel_south_menu.setBackground(Color.gray);
		panel_south_menu.setBounds(96, 261, 800, 400);
		panel_south_menu.setLocation(100, 400);
		panel_south_menu.setLayout(null);
		
		getContentPane().add(panel_stand_room);
		panel_stand_room.add(panel_south_menu);
		
		
		JPanel panel_south_menu_chat = new JPanel();
		panel_south_menu_chat.setBounds(0, 0, 337, 340);
		panel_south_menu.add(panel_south_menu_chat);
		panel_south_menu_chat.setLayout(null);
		jta.setBounds(14, 12, 304, 284);
		panel_south_menu_chat.add(jta);
		
		jta.setEditable(false);
		jta.setFont(new Font("���� ���", Font.PLAIN, 14));
		jta.setBackground(new Color(230, 255, 230));
		jtf.setBounds(14, 293, 304, 24);
		panel_south_menu_chat.add(jtf);
		jtf.addActionListener(this);
		
		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		client.setGui(this);
		client.setNicknames(user_id);			
		client.connect(user_id);
	}
	
	// ä���ʵ� �̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent e) {
		//���� �Է� â�� ���� �Է� �� ������ �̺�Ʈ ����
		//��Ʈ�� ���� msdg�� �г��� : �ؽ�Ʈ�ʵ��� ����� ���ٷ� �������⸦ ���
		String msg = user_id + ": " + jtf.getText() +"\n";
		//�޼ҵ忡 ������ ������
		client.sendMessage(msg);
		//�ؽ�Ʈ������ ����
		jtf.setText("");
	}

	//ä��â�� ������ ���� �޽��� �߰�
	public void appendMsg(String msg) {
		jta.append(msg);
		
	}
	//������ �����ϸ� �������̵�� �λ�.
	public void label_userid(String user_id) {
		user_label.setText(user_id+"�� ȯ���մϴ�.!!!");
	}
}
