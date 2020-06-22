package com.kh.sopa.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//결과페이지  클래스
public class ResultPage extends JFrame {
	private JPanel contentPane;
	
	
	public ResultPage(){
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);		
		
		
		
		//상단바 패널
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setLocation(40, 10);
		panel.setSize(940, 50);
		panel.setBackground(Color.WHITE);
		
		//상단 오른쪽의 뒤로가기 버튼 
		JButton panel_stopBtn = new JButton("뒤로가기");
		 panel_stopBtn.setBounds(840, 0, 100, 50);
		 panel_stopBtn.setBackground(Color.yellow);
		
		 //버튼위 그만해요 라벨
		//JLabel stopLabel = new JLabel("뒤로가기");
		
		
		panel.add( panel_stopBtn);
		//panel_stopBtn.add(stopLabel);
	
		
		
		//123 순위 결과(rank패널)출력 패널
		JPanel rankPanel = new JPanel();
		rankPanel.setLayout(null);
		rankPanel.setBounds(40, 70, 940, 460);
		rankPanel.setBackground(Color.WHITE);
		
	
		//rank패널안_이미지
		JPanel rank_Ima = new JPanel();
		Image rank_lab_ima = new ImageIcon("image/rank.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel rank_lab = new JLabel( new ImageIcon(rank_lab_ima));
		
		rank_Ima.add(rank_lab);
		
		//rank패널_ 등수패널
		JPanel rank_RPanel = new JPanel();
		rank_RPanel.setLayout(null);
		rank_RPanel.setBounds(50, 40 ,150, 90);
		rank_RPanel.setBackground(Color.BLUE);
		
		//rank패널_ 쿠키패널
		JPanel rank_CPanel = new JPanel();
		rank_CPanel.setLayout(null);
		rank_CPanel.setBounds(50, 150, 150, 90);
		rank_CPanel.setBackground(Color.RED);
		
		
		
		
		
		rankPanel.add(rank_Ima);
		rankPanel.add(rank_CPanel);
		rankPanel.add(rank_RPanel);
		
		
		this.add(rankPanel);
		this.add(panel);
		
		
		
		
		//4등rank 패널
		JPanel four = new JPanel();
		 four.setBounds(40, 540, 940, 50);
		 four.setBackground(Color.WHITE);
		 
		JLabel four_Label = new JLabel("4 등");
		 four_Label.setBounds(40, 540, 40, 50);
         four_Label.setFont(new Font("바탕", Font.BOLD, 35));
	
		four.add(four_Label/*,"West"*/);
		this.add(four);
		
		
		
		
		
		
		//5등rank 패널
		JPanel five = new JPanel();
		 
		 five.setBounds(40, 600 , 940, 50);
		 five.setBackground(Color.WHITE);
	    
		 JLabel five_Label = new JLabel("5 등");
		  five_Label.setBounds(50, 600, 40, 50);
	      five_Label.setFont(new Font("바탕", Font.BOLD, 35));
	      
		five.add(five_Label);
		this.add(five);
		
		
		
		
		
		
		

	}
	
	
	
	
	
	public static void main(String[] args) {
		new ResultPage();	
	
	}





	




}
