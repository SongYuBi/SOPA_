package com.kh.sopa.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//���������  Ŭ����
public class ResultPage extends JFrame {
	private JPanel contentPane;
	
	public ResultPage(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//��ܹ� �г�
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setLocation(40, 10);
		panel.setSize(940, 50);
		panel.setBackground(Color.WHITE);
		
		//��� �������� �ڷΰ��� ��ư 
		JButton stopBtn = new JButton("�ڷΰ���");
		stopBtn.setBounds(840, 0, 100, 50);
		stopBtn.setBackground(Color.yellow);
		
		panel.add(stopBtn);
		this.add(panel);
	
		//123 ���� ��� ��� �г�
		JPanel rankPanel = new JPanel();
		rankPanel.setBounds(40, 70, 940, 330);
		rankPanel.setBackground(Color.BLACK);
		
		
		//�̹���
		
	
		
		//����г�
		
		
		//��Ű�г�
		
		
		//�̹���
		
		//.....��
		JLabel a= new JLabel("�Ѹ�� �������� ��� ������ϴ�.");
		a.setBounds(500, 20, 100, 15);
				
	
	
	
		

	}
}
