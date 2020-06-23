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

	// �������� SolvingQuizDao(���� ����� Ŭ����) �� �� ���� ��Ų �� ����
	
	private SolvingQuizDao qd = new SolvingQuizDao();
	private ArrayList<Quiz_VO> quizList2 = qd.readQuizList();
	private JPanel contentPane;
	
	//��Ʈ���� Ǭ ���� ��
	private int solved_qnumInSet = 0;
	//��Ʈ���� ���� ���� ��
	private int correct_qnumInSet = 0;
	
	// ���� ��ȯ �ݺ��� ���� �ʱⰪ ����
	private int cnt = 0;


	public SolvingQuiz() {
		
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBounds(100, 100, 1024, 768);
		contentPane.setBackground(new Color(254, 228, 167));
		setContentPane(contentPane);

		// ��ܹ�
		JPanel timePanel = new JPanel();
		timePanel.setLayout(null);
		timePanel.setLocation(40, 10);
		timePanel.setSize(940, 50);
		timePanel.setBackground(Color.WHITE);

		// ��ܹ� �� �ð� �帣�� ��
		JLabel timeLabel = new JLabel();
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		timeLabel.setBounds(50, 5, 850, 40);
		timeLabel.setFont(new Font("���� ���", Font.BOLD, 18));

		// ��� �������� �׸��ؿ� ��ư
		JButton stopBtn = new JButton();
		stopBtn.setBounds(840, 0, 100, 50);
		stopBtn.setBorderPainted(false);
		stopBtn.setBackground(new Color(255, 179, 0));
		
		// �׸��ؿ� ��
		JLabel stopLabel = new JLabel("�׸��ؿ�<<");

		// ���� �� ǥ�� ��

		JLabel quiz_num_lb = new JLabel();
		quiz_num_lb.setHorizontalAlignment(JLabel.CENTER);
		quiz_num_lb.setBounds(440, 410, 150, 45);
		quiz_num_lb.setOpaque(true);
		quiz_num_lb.setBackground(new Color(252, 209, 108));
		quiz_num_lb.setFont(new Font("���� ���", Font.BOLD, 25));

		// ���� �� ǥ�� ��
/*		JLabel answer_num_lb = new JLabel();
		answer_num_lb.setHorizontalAlignment(JLabel.CENTER);
		answer_num_lb.setText("���� 0 / 20");
		answer_num_lb.setBounds(820, 410, 160, 45);
		answer_num_lb.setOpaque(true);
		answer_num_lb.setBackground(new Color(252, 209, 108));
		answer_num_lb.setFont(new Font("���� ���", Font.BOLD, 25));*/

		// �������� �г�
		
		JPanel quizPanel = new JPanel();
		quizPanel.setLayout(null);
		quizPanel.setBounds(40, 70, 940, 330);
		quizPanel.setBackground(Color.WHITE);
		

		// ������ ������ ��
		JLabel quizLabel = new JLabel();
		quizLabel.setHorizontalAlignment(JLabel.CENTER);
		quizLabel.setBounds(80, 10, 800, 300);
		quizLabel.setFont(new Font("���� ���", Font.BOLD, 25));
		/*
		 * quizLabel.setOpaque(true); //��ũ�� Ȯ�ο� ����־��
		 * quizLabel.setBackground(Color.YELLOW);
		 */

		// ������ư

		// ������ư 1
		JButton btn_quiz_answer_1 = new JButton();
		btn_quiz_answer_1.setBorderPainted(false);
		btn_quiz_answer_1.setBounds(40, 475, 455, 110);
		btn_quiz_answer_1.setBackground(new Color(226, 91, 69));
		
		btn_quiz_answer_1.setFont(new Font("���� ���", Font.BOLD, 25));

		// ������ư 2
		JButton btn_quiz_answer_2 = new JButton();
		btn_quiz_answer_2.setBorderPainted(false);
		btn_quiz_answer_2.setBounds(525, 475, 455, 110);
		btn_quiz_answer_2.setBackground(new Color(225, 131, 87));
		btn_quiz_answer_2.setFont(new Font("���� ���", Font.BOLD, 25));

		// ������ư 3
		JButton btn_quiz_answer_3 = new JButton();
		btn_quiz_answer_3.setBorderPainted(false);
		btn_quiz_answer_3.setBounds(40, 600, 455, 110);
		btn_quiz_answer_3.setBackground(new Color(137, 213, 201));
		btn_quiz_answer_3.setFont(new Font("���� ���", Font.BOLD, 25));

		// ������ư 4
		JButton btn_quiz_answer_4 = new JButton();
		btn_quiz_answer_4.setBorderPainted(false);
		btn_quiz_answer_4.setBounds(525, 600, 455, 110);
		btn_quiz_answer_4.setBackground(new Color(172, 201, 101));
		btn_quiz_answer_4.setFont(new Font("���� ���", Font.BOLD, 25));

		// �г�, �� , ��ư �� �߰�

		timePanel.add(timeLabel);
		timePanel.add(stopBtn);
		stopBtn.add(stopLabel);
		contentPane.add(quiz_num_lb);
/*		contentPane.add(answer_num_lb);*/
		quizPanel.add(quizLabel);

		this.add(btn_quiz_answer_1);
		this.add(btn_quiz_answer_2);
		this.add(btn_quiz_answer_3);
		this.add(btn_quiz_answer_4);
		this.add(timePanel);
		this.add(quizPanel);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �׸��ؿ� ��ư ������ ȭ�� ��ȯ
		stopBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �ӽ� Ŭ���� �̵�
				new ExtraPanel().setVisible(true);
				dispose();
			}
		});

		
		int timesec = 0;
		int quiz_num_ing = 1;

		
		// ���� ���̵��� �ʰ� ���� �迭 ����
		int[] sec = new int[quizList2.size()];
		for (int i = 0; i < quizList2.size(); i++) {
			sec[i] = quizList2.get(i).getQuiz_difficulty();
		}

		
		//��� ������ �ݺ��� ���ؼ� ����
		for (cnt = 0; cnt < quizList2.size(); cnt++) {
						
			// ���̵��� �ð��� ������ ����
			timesec = sec[cnt];
			
			//������ ���� �� / ��ü ������
			quiz_num_lb.setText((quiz_num_ing + cnt) + " / " + quizList2.size());
			
			// �������� �󺧿� ���� �־��ֱ�
			quizLabel.setText(quizList2.get(cnt).getQuiz_title());
			
			
			// ���� ��ư�� ���� �־��ֱ�
			btn_quiz_answer_1.setText(quizList2.get(cnt).getQuiz_answer_1());
			btn_quiz_answer_2.setText(quizList2.get(cnt).getQuiz_answer_2());
			btn_quiz_answer_3.setText(quizList2.get(cnt).getQuiz_answer_3());
			btn_quiz_answer_4.setText(quizList2.get(cnt).getQuiz_answer_4());


			// ������ư �� Ŭ�� �� �׼�

			// ���� 1��
			btn_quiz_answer_1.addActionListener(new MyEvent(btn_quiz_answer_1, cnt));

			// ���� 2��
			btn_quiz_answer_2.addActionListener(new MyEvent(btn_quiz_answer_2, cnt));

			// ���� 3��
			btn_quiz_answer_3.addActionListener(new MyEvent(btn_quiz_answer_3, cnt));

			// ���� 4��
			btn_quiz_answer_4.addActionListener(new MyEvent(btn_quiz_answer_4, cnt));

			while (true) {

				try {
					timeLabel.setText("" + timesec + "�� ���ҽ��ϴ�");
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

				timesec--;

				if (timesec == 0) {
					break;
				}
			}
		}
	}

	
	class MyEvent implements ActionListener {
		private JButton btn_quiz_answer_1;
		private JButton btn_quiz_answer_2;
		private JButton btn_quiz_answer_3;
		private JButton btn_quiz_answer_4;
		private int cnt = 0;

		public MyEvent(JButton button, int cnt) {
			this.btn_quiz_answer_1 = btn_quiz_answer_1;
			this.btn_quiz_answer_2 = btn_quiz_answer_2;
			this.btn_quiz_answer_3 = btn_quiz_answer_3;
			this.btn_quiz_answer_4 = btn_quiz_answer_4;
			this.cnt = cnt;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (btn_quiz_answer_1.getText().equals(quizList2.get(cnt).getQuiz_final_answer())) {
				// ����
				System.out.println("����");
			} 

			if (btn_quiz_answer_2.getText().equals(quizList2.get(cnt).getQuiz_final_answer())) {
				System.out.println("����");
			} 

			if (btn_quiz_answer_3.getText().equals(quizList2.get(cnt).getQuiz_final_answer())) {
				System.out.println("����");
			} 

			if (btn_quiz_answer_4.getText().equals(quizList2.get(cnt).getQuiz_final_answer())) {
				System.out.println("����");
			} 	
			//Ǭ ������ ++

		}
	}

	public static void main(String[] args) {
		new SolvingQuiz();
	}
}
