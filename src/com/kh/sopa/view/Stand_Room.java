package com.kh.sopa.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Stand_Room extends JFrame{

	private JPanel contentPane;
	private JTextArea jta = new JTextArea(25, 25);
	private JTextField jtf = new JTextField(25);

	public Stand_Room() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		// View시작은 여기서부터
		setTitle("대기실");
		JPanel panel_stand_room = new JPanel();
		panel_stand_room.setLayout(null);
		panel_stand_room.setBounds(0, 0, 1024, 768);
		panel_stand_room.setBackground(Color.white);

		JPanel panel_south_menu = new JPanel();			//밑에 메뉴 패널
		
		panel_south_menu.setBackground(Color.gray);
		panel_south_menu.setBounds(0, 0, 800, 400);
		panel_south_menu.setLocation(100, 400);

		JPanel panel_south_menu_chat = new JPanel();
		
		
		jta.setEditable(false);
		jta.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		jta.setBackground(new Color(230, 255, 230));
		panel_south_menu.add(panel_south_menu_chat);
		panel_south_menu_chat.add(jta, BorderLayout.CENTER);
		panel_south_menu_chat.add(jtf, BorderLayout.SOUTH);
		
		this.add(panel_stand_room);
		panel_stand_room.add(panel_south_menu);
		
		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	Stand_Room sr = new Stand_Room();
}
}
