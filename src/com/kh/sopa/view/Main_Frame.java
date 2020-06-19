package com.kh.sopa.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main_Frame extends JFrame {

	private JPanel contentPane;

	public Main_Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// View시작은 여기서부터
		
		JPanel panel1 = new JPanel();  //맨위 흰색바
		
	
		panel1.setBounds(40, 10, 940, 50);
		
		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		
		JButton btn = new JButton("뒤로가기");
		btn.setLocation(850, 200);
		btn.setSize(60, 35);
		
		
		panel1.add(btn);

		this.add(panel1);
		
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(40, 20, 940, 650);
		
		
		this.add(panel2);
		
		
		JPanel panel3 = new JPanel();  //4등
		
		
		
		
		JPanel panel4 = new JPanel();  //5등
		
		
		
		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new Main_Frame();
		
	}
}
