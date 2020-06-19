package com.kh.sopa.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//결과페이지  클래스
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
		
		//상단바 패널
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setLocation(40, 10);
		panel.setSize(940, 50);
		panel.setBackground(Color.WHITE);
		
		//상단 오른쪽의 뒤로가기 버튼 
		JButton stopBtn = new JButton("뒤로가기");
		stopBtn.setBounds(840, 0, 100, 50);
		stopBtn.setBackground(Color.yellow);
		
		panel.add(stopBtn);
		this.add(panel);
	
		//123 순위 결과 출력 패널
		JPanel rankPanel = new JPanel();
		rankPanel.setBounds(40, 70, 940, 330);
		rankPanel.setBackground(Color.BLACK);
		
		
		//이미지
		
	
		
		//등수패널
		
		
		//쿠키패널
		
		
		//이미지
		
		//.....라벨
		JLabel a= new JLabel("총몇개의 문제에서 몇개를 맞췄습니다.");
		a.setBounds(500, 20, 100, 15);
				
	
	
	
		

	}
}
