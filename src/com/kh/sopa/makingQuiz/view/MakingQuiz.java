package com.kh.sopa.makingQuiz.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.kh.sopa.makingQuiz.model.controller.MakingQuizManager;
import com.kh.sopa.makingQuiz.model.dao.Quiz_added_DAO;
import com.kh.sopa.makingQuiz.vo.ResultPrinter;
import com.kh.sopa.model.vo.Quiz_added_VO;


public class MakingQuiz extends JFrame implements ActionListener, ItemListener, MouseListener {
	MakingQuizManager mqm = new MakingQuizManager();
	Quiz_added_VO qav = new Quiz_added_VO();
	Quiz_added_DAO qad = new Quiz_added_DAO();
	ResultPrinter rp = new ResultPrinter();
	
	private JPanel allPanel;
	private JPanel answer_1;
	private JPanel answer_2;
	private JPanel answer_3;
	private JPanel answer_4;

	private JTextField title;
	private JTextField cookie;
	private JTextField ansText_1;
	private JTextField ansText_2;
	private JTextField ansText_3;
	private JTextField ansText_4;
	
	private JRadioButton ansRadio_1;
	private JRadioButton ansRadio_2;
	private JRadioButton ansRadio_3;
	private JRadioButton ansRadio_4;
	private JRadioButton ansRadio_5; //ansRadio_5�� ���� ������
	
//	2�� ����ġ
//	private ToggleSwitch ansSwitch_1;
//	private ToggleSwitch ansSwitch_2;
//	private ToggleSwitch ansSwitch_3;
//	private ToggleSwitch ansSwitch_4;
	
	private JTextField titleSet;
	private JTextField categorySet;
	private JTextField peopleSet;
	private JTextField levelSet;
	
	private JRadioButton level_1;
	private JRadioButton level_2;
	private JRadioButton level_3;
	private JRadioButton level_4; //level_4�� ���� ������
	
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	
//	���̵��� ������ư Ŭ���� �� ����
	private String finalAnswer = null;
	private int levelResult = 0;
//	ArrayList<String> aResult = new ArrayList<>();
//	private String [] answerResult = new String [4];
	
	private JTable listQuiz;
	private JScrollPane scrollList;
	private DefaultTableModel model;
	
	

	public MakingQuiz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		allPanel = new JPanel();
		allPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		allPanel.setLayout(null);
		setContentPane(allPanel);		
		
//		��ü ����Ʈ �г�, ��Ʈ����Ʈ�� ��������Ʈ�� ��ġ�մϴ�
		JPanel listPanel = new JPanel();
		listPanel.setBounds(7, 60, 340, 440);
		listPanel.setLayout(null);
		
//		����Ʈ, ��Ʈ�� ����� ��ϵǴ� ����Ʈ�Դϴ�
		JList listSet = new JList();
		listSet.setBounds(7, 7, 160, 340);
		listSet.setBackground(Color.LIGHT_GRAY);
		listSet.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
//		����Ʈ, ������ ����� ��ϵǴ� ����Ʈ�Դϴ�
//		JList listQuiz = new JList(); //qad.readQuizList().toArray()
//		listQuiz.setBounds(170, 7, 160, 340);
//		listQuiz.setBackground(Color.LIGHT_GRAY);
//		listQuiz.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);	

		String[][] row = {
			    { "A", "B" },
			    { "C", "D" },
			    { "C", "D" },
			    { "C", "D" },
			    { "C", "D" },
			    { "C", "D" },

			    
			};
		
		String[] col = { "C 1", "C 2" };
//		
////		���� ����Ʈ �г�, ���� ����Ʈ�� ��ġ�մϴ�
		JPanel quizList = new JPanel();
		quizList.setBounds(170, 7, 160, 340);
		quizList.setBackground(Color.GRAY);
//		quizList.setLayout(new BorderLayout());
		listPanel.add(quizList);
//
//		model = new DefaultTableModel(row, col);
//		listQuiz = new JTable(model);
////		listQuiz.addMouseListener(this);
////		listQuiz.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//		scrollList = new JScrollPane(listQuiz);
//		
//		scrollList.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//		quizList.add(listQuiz);
//		listQuiz.add(scrollList);

	
		
		
		
		

		
//		��ư, �߰�, ���� ����Ʈ�� �ۼ��� ������ �߰��մϴ�
		button_3 = new JButton("\uB9AC\uC2A4\uD2B8\uC5D0 \uCD94\uAC00!");
		button_3.setFont(new Font("����", Font.PLAIN, 18));
		button_3.setBounds(170, 350, 160, 40);
		button_3.addActionListener(this);
		
//		��ư, ����, ���� ����Ʈ���� ������ ������ �����մϴ�
		button_4 = new JButton("\uC0AD\uC81C");
		button_4.setFont(new Font("����", Font.PLAIN, 18));
		button_4.setBounds(250, 395, 80, 40);
		
//		��ư, ����, ���� ����Ʈ���� ������ ������ �����մϴ�
		button_5 = new JButton("\uC218\uC815");
		button_5.setFont(new Font("����", Font.PLAIN, 18));
		button_5.setBounds(170, 395, 80, 40);


		
//		��ư, ��Ʈ�� ����, ���� ����Ʈ�� �������� ��Ʈ�� ����ϴ�
		button_2 = new JButton("\uC138\uD2B8\uB85C \uCD94\uAC00!");
		button_2.setFont(new Font("����", Font.PLAIN, 18));
		button_2.setBounds(7, 351, 160, 40);
		

		
		
//		���� �г�, ������ ����� �г� �Դϴ�
		JPanel quizPanel = new JPanel();
		quizPanel.setBounds(354, 60, 658, 440);
		quizPanel.setLayout(null);
		
		
//		��ư, ���� ����, ��Ʈ�� ������ ���¿��� ��ư�� �����ϴ�
		button_1 = new JButton("\uBC29\uC744 \uB9CC\uB4E4\uC5B4\uC694");
		button_1.setFont(new Font("����", Font.PLAIN, 18));
		button_1.setBounds(498, 6, 153, 78);

//		�ؽ�Ʈ �ʵ�, 1��Ʈ �������� �Է¹޽��ϴ�
		titleSet = new JTextField();
		titleSet.setBounds(70, 7, 420, 35);
		titleSet.setColumns(10);
		
//		�ؽ�Ʈ, ���� �гο� ��ġ�ϰ�, �������̶�� �����ֽ��ϴ�
		JLabel quizTitleSet = new JLabel("\uBC29\uC81C\uBAA9");
		quizTitleSet.setFont(new Font("����", Font.PLAIN, 18));
		quizTitleSet.setBounds(7, 7, 58, 30);
		
		
//		�ؽ�Ʈ �ʵ�, 1���� ������ �Է¹޽��ϴ�
		title = new JTextField();
		title.setBounds(70, 49, 420, 35);
		title.setColumns(10);
		
//		�ؽ�Ʈ, ���� �гο� ��ġ�ϰ�, ������� �����ֽ��ϴ�
		JLabel quizTitle = new JLabel("\uBB38\uC81C");
		quizTitle.setFont(new Font("����", Font.PLAIN, 18));
		quizTitle.setBounds(7, 49, 43, 30);

		
		
//		���� �г��� ���� �г�, ������ �Է��մϴ�
		JPanel categoryPanel = new JPanel();
		categoryPanel.setBounds(498, 90, 153, 78);
		categoryPanel.setLayout(null);
		
//		Ÿ��Ʋ, ������� �����ֽ��ϴ�
		JLabel categoryTitle = new JLabel("\uC8FC\uC81C");
		categoryTitle.setBounds(60, 0, 43, 30);
		categoryTitle.setFont(new Font("����", Font.PLAIN, 18));
		
//		�ؽ�Ʈ�ʵ�, 1��Ʈ ������ �Է¹޴� �ؽ�Ʈ �ʵ� �Դϴ�
		categorySet = new JTextField();
		categorySet.setBounds(7, 35, 139, 35);
		categorySet.setColumns(10);

		
		
		
//		���� �г��� ���� �ο� �г�, �����ο� �г��Դϴ�
		JPanel peoplePanel = new JPanel();
		peoplePanel.setBounds(498, 174, 153, 50);
		peoplePanel.setLayout(null);
		
//		Ÿ��Ʋ, ���̶�� �����ֽ��ϴ�.
		JLabel peopleTitle = new JLabel("\uBA85");
		peopleTitle.setFont(new Font("����", Font.PLAIN, 18));
		peopleTitle.setBounds(105, 10, 43, 30);
		
//		�ؽ�Ʈ�ʵ�, 1��Ʈ�� �����ο� ���� �Է¹޴� �ؽ�Ʈ �ʵ� �Դϴ�
		peopleSet = new JTextField();
		peopleSet.setColumns(10);
		peopleSet.setBounds(7, 7, 90, 35);
		

		
		
//		���� �г��� ��Ű �г�, ��Ű�г� �Դϴ�
		JPanel cookiePanel = new JPanel();
		cookiePanel.setBounds(498, 228, 153, 50);
		cookiePanel.setLayout(null);
		
//		Ÿ��Ʋ, ��Ű��� �����ֽ��ϴ�
		JLabel cookieTitle = new JLabel("\uCFE0\uD0A4");
		cookieTitle.setFont(new Font("����", Font.PLAIN, 18));
		cookieTitle.setBounds(105, 10, 43, 30);

//		�ؽ�Ʈ�ʵ�, 1���� ��Ű ������ �Է¹޽��ϴ�
		cookie = new JTextField();
		cookie.setColumns(10);
		cookie.setBounds(7, 7, 90, 35);
		
		
		
		
//		���� �г��� ���̵� �г�, ���̵� �г� �Դϴ�
		JPanel levelPanel = new JPanel();
		levelPanel.setBounds(498, 285, 153, 150);
		levelPanel.setLayout(null);
	
//		Ÿ��Ʋ, ���̵���� �����ֽ��ϴ�
		JLabel levelTitle = new JLabel("\uB09C\uC774\uB3C4 (\uCD08)");
		levelTitle.setFont(new Font("����", Font.PLAIN, 18));
		levelTitle.setBounds(30, 7, 90, 30);
		
//		���� ��ư, ���, ���̵� �гο� �߰�
		level_1 = new JRadioButton(" \uC0C1\uAE09 (10)");
		level_1.setFont(new Font("����", Font.PLAIN, 18));
		level_1.setBounds(15, 40, 120, 30);
		level_1.addItemListener(this);
		

//		���� ��ư, �߱�, ���̵� �гο� �߰�
		level_2 = new JRadioButton(" \uC911\uAE09 (20)");
		level_2.setFont(new Font("����", Font.PLAIN, 18));
		level_2.setBounds(15, 80, 120, 30);
		level_2.addItemListener(this);
		
//		���� ��ư, �ϱ�, 
		level_3 = new JRadioButton(" \uD558\uAE09 (30)");
		level_3.setFont(new Font("����", Font.PLAIN, 18));
		level_3.setBounds(15, 120, 120, 30);
		level_3.addItemListener(this);
		
//		���� ��ư ���� ������
		level_4 = new JRadioButton();

//		���̵�, �׷�ȭ ���� ��ư
		ButtonGroup levelGroup = new ButtonGroup();
		levelGroup.add(level_1);
		levelGroup.add(level_2);
		levelGroup.add(level_3);
		levelGroup.add(level_4);
		getContentPane().add(level_4);
		

		
//		�� �г�, ���� ��ġ�մϴ�
		JPanel answerPanel = new JPanel();
		answerPanel.setBounds(7, 504, 1005, 210);
		answerPanel.setLayout(null);
		
//		1�� �г� �Դϴ�
		answer_1 = new JPanel();
		answer_1.setLayout(null);
		answer_1.setBackground(Color.RED);
		answer_1.setBounds(10, 7, 485, 98);

//		�ؽ�Ʈ�ʵ�, 1����, 1�� �гο� ���ϴ�
		ansText_1 = new JTextField();
		ansText_1.setColumns(10);
		ansText_1.setBounds(73, 38, 400, 50);
		
////	2��	����ġ, 1�� ���� ���� ���θ� üũ�մϴ�
//		ansSwitch_1 = new ToggleSwitch();
//		ansSwitch_1.setBounds(432, 7, 41, 21);
		
		ansRadio_1 = new JRadioButton("����");
		ansRadio_1.setFont(new Font("����", Font.PLAIN, 17));
		ansRadio_1.setBounds(412, 5, 60, 30);
//		ansRadio_1.setBackground(Color.RED);
		ansRadio_1.addItemListener(this);

		
//		2�� �г� �Դϴ�
		answer_2 = new JPanel();
		answer_2.setBounds(510, 7, 485, 98);
		answer_2.setBackground(Color.ORANGE);
		answer_2.setLayout(null);
		
//		�ؽ�Ʈ �ʵ�, 2����, 2�� �гο� ���ϴ�
		ansText_2 = new JTextField();
		ansText_2.setColumns(10);
		ansText_2.setBounds(73, 38, 400, 50);
		
////	2��	����ġ, 2�� ���� ���� ���θ� üũ�մϴ�
//		ansSwitch_2 = new ToggleSwitch();
//		ansSwitch_2.setBounds(432, 7, 41, 21);
		
		ansRadio_2 = new JRadioButton("����");
		ansRadio_2.setFont(new Font("����", Font.PLAIN, 17));
		ansRadio_2.setBounds(412, 5, 60, 30);
//		ansRadio_2.setBackground(Color.ORANGE);
		ansRadio_2.addItemListener(this);

			
//		3�� �г� �Դϴ�
		answer_3 = new JPanel();
		answer_3.setLayout(null);
		answer_3.setBackground(Color.CYAN);
		answer_3.setBounds(10, 107, 485, 98);

//		�ؽ�Ʈ �ʵ�, 3����, 3�� �гο� ���ϴ�
		ansText_3 = new JTextField();
		ansText_3.setColumns(10);
		ansText_3.setBounds(73, 38, 400, 50);
		
////	2��	����ġ, 3�� ���� ���� ���θ� üũ�մϴ�
//		ansSwitch_3 = new ToggleSwitch();
//		ansSwitch_3.setBounds(432, 7, 41, 21);
		
		ansRadio_3 = new JRadioButton("����");
		ansRadio_3.setFont(new Font("����", Font.PLAIN, 17));
		ansRadio_3.setBounds(412, 5, 60, 30);
//		ansRadio_3.setBackground(Color.CYAN);
		ansRadio_3.addItemListener(this);
		
//		4�� �г� �Դϴ�
		answer_4 = new JPanel();
		answer_4.setLayout(null);
		answer_4.setBackground(Color.GREEN);
		answer_4.setBounds(510, 107, 485, 98);
		
//		�ؽ�Ʈ �ʵ�, 4����, 4�� �гο� ���ϴ�
		ansText_4 = new JTextField();
		ansText_4.setColumns(10);
		ansText_4.setBounds(73, 38, 400, 50);
		
////	2��	����ġ, 4�� ���� ���� ���θ� üũ�մϴ�
//		ansSwitch_4 = new ToggleSwitch();
//		ansSwitch_4.setBounds(432, 7, 41, 21);
		
		ansRadio_4 = new JRadioButton("����");
		ansRadio_4.setFont(new Font("����", Font.PLAIN, 17));
		ansRadio_4.setBounds(412, 5, 60, 30);
//		ansRadio_4.setBackground(Color.GREEN);
		ansRadio_4.addItemListener(this);
		
//		���� ��ư ���� ������
		ansRadio_5 = new JRadioButton();
		
//		����, �׷�ȭ ���� ��ư
		ButtonGroup ansGroup = new ButtonGroup();
		ansGroup.add(ansRadio_1);
		ansGroup.add(ansRadio_2);
		ansGroup.add(ansRadio_3);
		ansGroup.add(ansRadio_4);
		ansGroup.add(ansRadio_5);
		getContentPane().add(ansRadio_5);
		

//		�̹����߰� �г�
		JPanel imagePanel = new JPanel();
		imagePanel.setBackground(Color.LIGHT_GRAY);
		imagePanel.setBounds(7, 90, 483, 345);
		
//		���� �гο� �ö󰡴� ���� �г��Դϴ�
//		allPanel.add(SystemBar);
		allPanel.add(listPanel);
		allPanel.add(quizPanel);
		allPanel.add(answerPanel);
		
//		����Ʈ �гο� �ö󰡴� ��ư�� ����Ʈ�Դϴ�
		listPanel.add(listSet);
//		listPanel.add(listQuiz);
		listPanel.add(button_2);
		listPanel.add(button_3);
		listPanel.add(button_4);
		listPanel.add(button_5);
		
			
//		���� �гο� �ö󰡴� ��ư�� ����Ʈ �Դϴ� �гγ� �����г��� �鿩����Ǿ� �ֽ��ϴ�
		quizPanel.add(titleSet);
			quizPanel.add(quizTitleSet);
		quizPanel.add(title);
			quizPanel.add(quizTitle);
		
		quizPanel.add(button_1);
		quizPanel.add(categoryPanel);
			categoryPanel.add(categoryTitle);
			categoryPanel.add(categorySet);	
		quizPanel.add(peoplePanel);
			peoplePanel.add(peopleTitle);
			peoplePanel.add(peopleSet);
		quizPanel.add(cookiePanel);		
			cookiePanel.add(cookieTitle);
			cookiePanel.add(cookie);
		quizPanel.add(levelPanel);
			levelPanel.add(levelTitle);
			levelPanel.add(level_1);
			levelPanel.add(level_2);
			levelPanel.add(level_3);
		quizPanel.add(imagePanel);


//		�� �гο� �ö󰡴� �гΰ� �ؽ�Ʈ �ʵ� �Դϴ�
//		����ġ 2�� ����
		answerPanel.add(answer_1);
				answer_1.add(ansText_1);
//				answer_1.add(ansSwitch_1);
				answer_1.add(ansRadio_1);
		answerPanel.add(answer_2);
				answer_2.add(ansText_2);
//				answer_2.add(ansSwitch_2);
				answer_2.add(ansRadio_2);
		answerPanel.add(answer_3);
				answer_3.add(ansText_3);
//				answer_3.add(ansSwitch_3);
				answer_3.add(ansRadio_3);
		answerPanel.add(answer_4);
				answer_4.add(ansText_4);
//				answer_4.add(ansSwitch_4);
				answer_4.add(ansRadio_4);
		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}


	//���̵�, ������ ���� ��ư�� ���� ������ �� ����
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==level_1) {
			levelResult = 10;
		} else if(e.getSource()==level_2) {
			levelResult = 20;
		} else if(e.getSource()==level_3) {
			levelResult = 30;
		}
		
	//����, ������ ���� ��ư�� ���� ������ �� ����
		if(e.getSource()==ansRadio_1) {
			finalAnswer = ansText_1.getText();
		} else if(e.getSource()==ansRadio_2) {
			finalAnswer = ansText_2.getText();
		} else if(e.getSource()==ansRadio_3) {
			finalAnswer = ansText_3.getText();
		} else if(e.getSource()==ansRadio_4) {
			finalAnswer = ansText_4.getText();
		}

	}	
	
	
	//����Ʈ�� �߰��ؿ� ��ư�� ������ Quiz_added_VO�� setter������ ����
	@Override	
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==button_3) {
			qav.setAdded_title(title.getText());
			qav.setAdded_answer_1(ansText_1.getText());
			qav.setAdded_answer_2(ansText_2.getText());
			qav.setAdded_answer_3(ansText_3.getText());
			qav.setAdded_answer_4(ansText_4.getText());
			qav.setAdded_final_answer(finalAnswer);
			qav.setAdded_cookie(Integer.parseInt(cookie.getText()));
			qav.setAdded_difficulty(levelResult);
			qav.setAdded_image(null);
//			qav.setAdded_subject(null);
//			qav.setAdded_people(0);
		
//			2�� ����ġ
//			if(ansSwitch_1.isActivated()) {
//				aResult.add("ans1");
//			}
//			if(ansSwitch_2.isActivated()) {
//				aResult.add("ans2");
//			}
//			if(ansSwitch_3.isActivated()) {
//				aResult.add("ans3");
//			}
//			if(ansSwitch_4.isActivated()) {
//				aResult.add("ans4");
//			}
//			String listString = String.join(", ", aResult);
		}
		
//		������ setter ���� �� ��� Ŭ������ �ѱ�
		mqm.insertQuiz(qav);
		
//		�ϳ��� ���� ��� �� �ʵ� �ʱ�ȭ
//		titleSet.setText(null);			//��Ʈ �̸� �ʱ�ȭ�� �ʿ� ����
		title.setText(null);			//���� �̸� �ʱ�ȭ
		ansText_1.setText(null);
		ansText_2.setText(null);
		ansText_3.setText(null);
		ansText_4.setText(null);
		ansRadio_5.setSelected(true);	//���� ���� ��ư �ʱ�ȭ
		cookie.setText(null);			//��Ű ���� �ʱ�ȭ
		level_4.setSelected(true);		//���̵� ���� ��ư �ʱ�ȭ
//		aResult.clear();				//����ġ�� ���� (2������)

//		�ַܼ� Quiz�� �߰��� ��� �����
		rp.printAllQuiz(qad.readQuizList());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}


