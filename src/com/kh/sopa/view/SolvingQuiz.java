package com.kh.sopa.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SolvingQuiz extends JFrame {
	private JPanel contentPane;
	
	public SolvingQuiz() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);		
		
		
		//제일 위 시간흘러가는 패널
		JPanel timePanel = new JPanel();
		timePanel.setLayout(null);
		timePanel.setLocation(40, 10);
		timePanel.setSize(940, 50);
		timePanel.setBackground(Color.WHITE);
				
		JLabel timeLabel = new JLabel("초 남았어요");
		timeLabel.setBounds(500, 20, 100, 15);
				
				
		//상단 오른쪽의 그만해요 버튼 
		JButton stopBtn = new JButton();
		stopBtn.setBounds(840, 0, 100, 50);
		stopBtn.setBackground(Color.yellow);
				
		//그만해요 라벨 
		JLabel stopLabel = new JLabel("그만해요<<");
				
		//문제 수 표기 라벨 
		JLabel quiz_num_lb = new JLabel("      3/3");
		quiz_num_lb.setBounds(440, 410, 150, 45 );
		quiz_num_lb.setOpaque(true);
		quiz_num_lb.setBackground(Color.yellow);
				
		quiz_num_lb.setFont(new Font("맑은 고딕", Font.BOLD, 25));
				
		//응답 수 표기 라벨
		JLabel answer_lb = new JLabel("응답 0 / 20 ");
		answer_lb.setBounds(820, 410, 160, 45);
		answer_lb.setOpaque(true);
		answer_lb.setBackground(Color.yellow);
		answer_lb.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		
				
		//문제출제 패널 
		JPanel quizPanel = new JPanel();
		quizPanel.setBounds(40, 70, 940, 330);
		quizPanel.setBackground(Color.WHITE);
				
				
				
		//문제버튼
		//문제버튼 1
		JButton btn_quiz_answer_1 = new JButton();
		btn_quiz_answer_1.setBounds(40, 475, 455, 110);
		btn_quiz_answer_1.setBackground(Color.red);
				
		//문제버튼 2
		JButton btn_quiz_answer_2 = new JButton();
		btn_quiz_answer_2.setBounds(40, 600, 455, 110);
		btn_quiz_answer_2.setBackground(Color.blue);
				
		//문제버튼 3
		JButton btn_quiz_answer_3 = new JButton();
		btn_quiz_answer_3.setBounds(525, 475, 455, 110);
		btn_quiz_answer_3.setBackground(Color.orange);
				
		//문제버튼 4
		JButton btn_quiz_answer_4 = new JButton();
		btn_quiz_answer_4.setBounds(525, 600, 455, 110);
		btn_quiz_answer_4.setBackground(Color.green);

				
				
				
		timePanel.add(timeLabel);
		timePanel.add(stopBtn);
		stopBtn.add(stopLabel);
				
		this.add(btn_quiz_answer_1);
		this.add(btn_quiz_answer_2);
		this.add(btn_quiz_answer_3);
		this.add(btn_quiz_answer_4);
		this.add(timePanel);
		this.add(quizPanel);
		this.add(quiz_num_lb);
		this.add(answer_lb);
				
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			

	
	public static void main(String[] args) {
		new SolvingQuiz();	
	}
	}
	
	

