package com.kh.sopa.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.kh.sopa.model.DAO.SolvingQuizDao;
import com.kh.sopa.model.vo.Quiz_VO;

public class SolvingQuiz extends JFrame {
	
	private JPanel contentPane;
	//�� ���ӿ��� Ǭ ���� ���� ���� ���� �� �ʵ�� ����
	static int add_quiz_num = 0;
	static int add_correct_num = 0;
	
	//����, ���� ���� ��� ��ü �迭�� �ݺ��� ���� �ʱⰪ
	private int i = 0;
	
	public SolvingQuiz() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBounds(100, 100, 1024, 768);
		contentPane.setBackground(new Color(254, 228, 167));
		setContentPane(contentPane);		
		
		
		//��ܹ�
		JPanel timePanel = new JPanel();
		timePanel.setLayout(null);
		timePanel.setLocation(40, 10);
		timePanel.setSize(940, 50);
		timePanel.setBackground(Color.WHITE);
				
		//��ܹ� �� �ð� �帣�� ��
		JLabel timeLabel = new JLabel();
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		timeLabel.setBounds(50, 5, 850, 40);
		timeLabel.setFont(new Font("���� ���", Font.BOLD, 18));

				
		//��� �������� �׸��ؿ� ��ư 
		JButton stopBtn = new JButton();
		stopBtn.setBounds(840, 0, 100, 50);
		stopBtn.setBorderPainted(false);
		stopBtn.setBackground(new Color(255, 179, 0));
				
		//�׸��ؿ� �� 
		JLabel stopLabel = new JLabel("�׸��ؿ�<<");
				
		//���� �� ǥ�� �� 
		JLabel quiz_num_lb = new JLabel();
		quiz_num_lb.setText("3/3");
		quiz_num_lb.setHorizontalAlignment(JLabel.CENTER);
		quiz_num_lb.setBounds(440, 410, 150, 45 );
		quiz_num_lb.setOpaque(true);
		quiz_num_lb.setBackground(new Color(252, 209, 108));
		quiz_num_lb.setFont(new Font("���� ���", Font.BOLD, 25));
				
		//���� �� ǥ�� ��
		JLabel answer_num_lb = new JLabel();
		answer_num_lb.setText("���� 0 / 20");
		answer_num_lb.setHorizontalAlignment(JLabel.CENTER);
		answer_num_lb.setBounds(820, 410, 160, 45);
		answer_num_lb.setOpaque(true);
		answer_num_lb.setBackground(new Color(252, 209, 108));
		answer_num_lb.setFont(new Font("���� ���", Font.BOLD, 25));
		
				
		//�������� �г� 
		JPanel quizPanel = new JPanel();
		quizPanel.setLayout(null);
		quizPanel.setBounds(40, 70, 940, 330);
		quizPanel.setBackground(Color.WHITE);
		
		//������ ������ ��
		JLabel quizLabel = new JLabel();
		quizLabel.setHorizontalAlignment(JLabel.CENTER);
		quizLabel.setBounds(80, 10, 800, 300);
		quizLabel.setFont(new Font("���� ���", Font.BOLD, 25));
		/*quizLabel.setOpaque(true);
		//��ũ�� Ȯ�ο� ����־��
		quizLabel.setBackground(Color.YELLOW);
		*/
				
				
				
		//������ư
		//������ư 1
		JButton btn_quiz_answer_1 = new JButton();
		btn_quiz_answer_1.setBorderPainted(false);
		btn_quiz_answer_1.setBounds(40, 475, 455, 110);
		btn_quiz_answer_1.setBackground(new Color(226, 91, 69));
		btn_quiz_answer_1.setFont(new Font("���� ���", Font.BOLD, 25));
				
		//������ư 2
		JButton btn_quiz_answer_2 = new JButton();
		btn_quiz_answer_2.setBorderPainted(false);
		btn_quiz_answer_2.setBounds(40, 600, 455, 110);
		btn_quiz_answer_2.setBackground(new Color(137, 213, 201));
		btn_quiz_answer_2.setFont(new Font("���� ���", Font.BOLD, 25));
				
		//������ư 3
		JButton btn_quiz_answer_3 = new JButton();
		btn_quiz_answer_3.setBorderPainted(false);
		btn_quiz_answer_3.setBounds(525, 475, 455, 110);
		btn_quiz_answer_3.setBackground(new Color(225, 131, 87));
		btn_quiz_answer_3.setFont(new Font("���� ���", Font.BOLD, 25));	
		
		//������ư 4
		JButton btn_quiz_answer_4 = new JButton();
		btn_quiz_answer_4.setBorderPainted(false);
		btn_quiz_answer_4.setBounds(525, 600, 455, 110);
		btn_quiz_answer_4.setBackground(new Color(172, 201, 101));
		btn_quiz_answer_4.setFont(new Font("���� ���", Font.BOLD, 25));
				
				

		//�г�, �� , ��ư �� �߰�
		
		timePanel.add(timeLabel);
		timePanel.add(stopBtn);
		stopBtn.add(stopLabel);
		contentPane.add(quiz_num_lb);	
		contentPane.add(answer_num_lb);	
		quizPanel.add(quizLabel);
		
		this.add(btn_quiz_answer_1);
		this.add(btn_quiz_answer_2);
		this.add(btn_quiz_answer_3);
		this.add(btn_quiz_answer_4);
		this.add(timePanel);
		this.add(quizPanel);
		
		
		
	/*	//Ÿ�̸� �ҷ�����
		Timer1 t1 = new Timer1(timeLabel);
		t1.run();
		*/
		
		
		
		
		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		
		

		//�׸��ؿ� ��ư ������ ȭ�� ��ȯ
		stopBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//�ӽ� Ŭ���� �̵�
				new ExtraPanel().setVisible(true);
				dispose();			
			}
			
		});
		
	
		//���� ��ư�� �� ��ȣ�� ���� �ο�
		
		//���� �迭
		SolvingQuizDao qd = new SolvingQuizDao();
		ArrayList<Quiz_VO> quizList2 = qd.readQuizList();

		// split[0] = ����
		// split[1] = 1�� ����
		// split[2] = 2�� ����
		// split[3] = 3�� ����
		// split[4] = 4�� ����
		// split[5] = ����


		btn_quiz_answer_1.setText(quizList2.get(i).getQuiz_answer_1());
		btn_quiz_answer_2.setText(quizList2.get(i).getQuiz_answer_2());
		btn_quiz_answer_3.setText(quizList2.get(i).getQuiz_answer_3());
		btn_quiz_answer_4.setText(quizList2.get(i).getQuiz_answer_4());


		// �������� �󺧿��� ���� �־��ֱ�
		quizLabel.setText("");

		// ������ư �� Ŭ�� �� �׼�

		// ���� 1��
		btn_quiz_answer_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (btn_quiz_answer_1.getText().equals(quizList2.get(1).getQuiz_final_answer())) {
					add_quiz_num++;
					add_correct_num++;

				} else {
					add_quiz_num++;

				}

			}

		});

		// ���� 2��
		btn_quiz_answer_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (btn_quiz_answer_2.getText().equals(quizList2.get(1).getQuiz_final_answer())) {
					add_quiz_num++;
					add_correct_num++;

				} else {
					add_quiz_num++;

				}

			}

		});

		// ���� 3��
		btn_quiz_answer_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (btn_quiz_answer_3.getText().equals(quizList2.get(1).getQuiz_final_answer())) {
					add_quiz_num++;
					add_correct_num++;

				} else {
					add_quiz_num++;

				}

			}

		});

		// ���� 4��
		btn_quiz_answer_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (btn_quiz_answer_4.getText().equals(quizList2.get(1).getQuiz_final_answer())) {
					add_quiz_num++;
					add_correct_num++;

				} else {
					add_quiz_num++;

				}

			}
		});

		/*		//Ÿ�̸�
		while(true) {
			timeLabel.setText("" + count.S + "�� ���ҽ��ϴ�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			count.S--;
			if(count.S == 0) {
				count.S = 10;
				
				
				
			}
			
		}
	*/
	}
	
	public static void main(String[] args) {
		new SolvingQuiz();	
	}
	}
	
	

