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
	private JRadioButton ansRadio_5; //ansRadio_5는 선택 해제용
	
//	2차 스위치
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
	private JRadioButton level_4; //level_4는 선택 해제용
	
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	
//	난이도를 라디오버튼 클릭시 값 저장
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
		
//		전체 리스트 패널, 세트리스트와 문제리스트가 위치합니다
		JPanel listPanel = new JPanel();
		listPanel.setBounds(7, 60, 340, 440);
		listPanel.setLayout(null);
		
//		리스트, 세트를 만들면 등록되는 리스트입니다
		JList listSet = new JList();
		listSet.setBounds(7, 7, 160, 340);
		listSet.setBackground(Color.LIGHT_GRAY);
		listSet.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
//		리스트, 문제를 만들면 등록되는 리스트입니다
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
////		문제 리스트 패널, 문제 리스트에 위치합니다
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

	
		
		
		
		

		
//		버튼, 추가, 문제 리스트에 작성된 문제를 추가합니다
		button_3 = new JButton("\uB9AC\uC2A4\uD2B8\uC5D0 \uCD94\uAC00!");
		button_3.setFont(new Font("굴림", Font.PLAIN, 18));
		button_3.setBounds(170, 350, 160, 40);
		button_3.addActionListener(this);
		
//		버튼, 삭제, 문제 리스트에서 선택한 문제를 삭제합니다
		button_4 = new JButton("\uC0AD\uC81C");
		button_4.setFont(new Font("굴림", Font.PLAIN, 18));
		button_4.setBounds(250, 395, 80, 40);
		
//		버튼, 수정, 문제 리스트에서 선택한 문제를 수정합니다
		button_5 = new JButton("\uC218\uC815");
		button_5.setFont(new Font("굴림", Font.PLAIN, 18));
		button_5.setBounds(170, 395, 80, 40);


		
//		버튼, 세트로 만듬, 문제 리스트의 문제들을 세트로 만듭니다
		button_2 = new JButton("\uC138\uD2B8\uB85C \uCD94\uAC00!");
		button_2.setFont(new Font("굴림", Font.PLAIN, 18));
		button_2.setBounds(7, 351, 160, 40);
		

		
		
//		문제 패널, 문제를 만드는 패널 입니다
		JPanel quizPanel = new JPanel();
		quizPanel.setBounds(354, 60, 658, 440);
		quizPanel.setLayout(null);
		
		
//		버튼, 방을 만듬, 세트를 선택한 상태에서 버튼을 누릅니다
		button_1 = new JButton("\uBC29\uC744 \uB9CC\uB4E4\uC5B4\uC694");
		button_1.setFont(new Font("굴림", Font.PLAIN, 18));
		button_1.setBounds(498, 6, 153, 78);

//		텍스트 필드, 1세트 방제목을 입력받습니다
		titleSet = new JTextField();
		titleSet.setBounds(70, 7, 420, 35);
		titleSet.setColumns(10);
		
//		텍스트, 문제 패널에 위치하고, 방제목이라고 적혀있습니다
		JLabel quizTitleSet = new JLabel("\uBC29\uC81C\uBAA9");
		quizTitleSet.setFont(new Font("굴림", Font.PLAIN, 18));
		quizTitleSet.setBounds(7, 7, 58, 30);
		
		
//		텍스트 필드, 1문제 문제를 입력받습니다
		title = new JTextField();
		title.setBounds(70, 49, 420, 35);
		title.setColumns(10);
		
//		텍스트, 문제 패널에 위치하고, 문제라고 적혀있습니다
		JLabel quizTitle = new JLabel("\uBB38\uC81C");
		quizTitle.setFont(new Font("굴림", Font.PLAIN, 18));
		quizTitle.setBounds(7, 49, 43, 30);

		
		
//		문제 패널의 주제 패널, 주제를 입력합니다
		JPanel categoryPanel = new JPanel();
		categoryPanel.setBounds(498, 90, 153, 78);
		categoryPanel.setLayout(null);
		
//		타이틀, 주제라고 적혀있습니다
		JLabel categoryTitle = new JLabel("\uC8FC\uC81C");
		categoryTitle.setBounds(60, 0, 43, 30);
		categoryTitle.setFont(new Font("굴림", Font.PLAIN, 18));
		
//		텍스트필드, 1세트 주제를 입력받는 텍스트 필드 입니다
		categorySet = new JTextField();
		categorySet.setBounds(7, 35, 139, 35);
		categorySet.setColumns(10);

		
		
		
//		문제 패널의 참여 인원 패널, 참여인원 패널입니다
		JPanel peoplePanel = new JPanel();
		peoplePanel.setBounds(498, 174, 153, 50);
		peoplePanel.setLayout(null);
		
//		타이틀, 명이라고 적혀있습니다.
		JLabel peopleTitle = new JLabel("\uBA85");
		peopleTitle.setFont(new Font("굴림", Font.PLAIN, 18));
		peopleTitle.setBounds(105, 10, 43, 30);
		
//		텍스트필드, 1세트의 참여인원 수를 입력받는 텍스트 필드 입니다
		peopleSet = new JTextField();
		peopleSet.setColumns(10);
		peopleSet.setBounds(7, 7, 90, 35);
		

		
		
//		문제 패널의 쿠키 패널, 쿠키패널 입니다
		JPanel cookiePanel = new JPanel();
		cookiePanel.setBounds(498, 228, 153, 50);
		cookiePanel.setLayout(null);
		
//		타이틀, 쿠키라고 적혀있습니다
		JLabel cookieTitle = new JLabel("\uCFE0\uD0A4");
		cookieTitle.setFont(new Font("굴림", Font.PLAIN, 18));
		cookieTitle.setBounds(105, 10, 43, 30);

//		텍스트필드, 1문제 쿠키 개수를 입력받습니다
		cookie = new JTextField();
		cookie.setColumns(10);
		cookie.setBounds(7, 7, 90, 35);
		
		
		
		
//		문제 패널의 난이도 패널, 난이도 패널 입니다
		JPanel levelPanel = new JPanel();
		levelPanel.setBounds(498, 285, 153, 150);
		levelPanel.setLayout(null);
	
//		타이틀, 난이도라고 적혀있습니다
		JLabel levelTitle = new JLabel("\uB09C\uC774\uB3C4 (\uCD08)");
		levelTitle.setFont(new Font("굴림", Font.PLAIN, 18));
		levelTitle.setBounds(30, 7, 90, 30);
		
//		라디오 버튼, 상급, 난이도 패널에 추가
		level_1 = new JRadioButton(" \uC0C1\uAE09 (10)");
		level_1.setFont(new Font("굴림", Font.PLAIN, 18));
		level_1.setBounds(15, 40, 120, 30);
		level_1.addItemListener(this);
		

//		라디오 버튼, 중급, 난이도 패널에 추가
		level_2 = new JRadioButton(" \uC911\uAE09 (20)");
		level_2.setFont(new Font("굴림", Font.PLAIN, 18));
		level_2.setBounds(15, 80, 120, 30);
		level_2.addItemListener(this);
		
//		라디오 버튼, 하급, 
		level_3 = new JRadioButton(" \uD558\uAE09 (30)");
		level_3.setFont(new Font("굴림", Font.PLAIN, 18));
		level_3.setBounds(15, 120, 120, 30);
		level_3.addItemListener(this);
		
//		라디오 버튼 선택 해제용
		level_4 = new JRadioButton();

//		난이도, 그룹화 라디오 버튼
		ButtonGroup levelGroup = new ButtonGroup();
		levelGroup.add(level_1);
		levelGroup.add(level_2);
		levelGroup.add(level_3);
		levelGroup.add(level_4);
		getContentPane().add(level_4);
		

		
//		답 패널, 답이 위치합니다
		JPanel answerPanel = new JPanel();
		answerPanel.setBounds(7, 504, 1005, 210);
		answerPanel.setLayout(null);
		
//		1번 패널 입니다
		answer_1 = new JPanel();
		answer_1.setLayout(null);
		answer_1.setBackground(Color.RED);
		answer_1.setBounds(10, 7, 485, 98);

//		텍스트필드, 1번답, 1번 패널에 들어갑니다
		ansText_1 = new JTextField();
		ansText_1.setColumns(10);
		ansText_1.setBounds(73, 38, 400, 50);
		
////	2차	스위치, 1번 답의 정답 여부를 체크합니다
//		ansSwitch_1 = new ToggleSwitch();
//		ansSwitch_1.setBounds(432, 7, 41, 21);
		
		ansRadio_1 = new JRadioButton("정답");
		ansRadio_1.setFont(new Font("굴림", Font.PLAIN, 17));
		ansRadio_1.setBounds(412, 5, 60, 30);
//		ansRadio_1.setBackground(Color.RED);
		ansRadio_1.addItemListener(this);

		
//		2번 패널 입니다
		answer_2 = new JPanel();
		answer_2.setBounds(510, 7, 485, 98);
		answer_2.setBackground(Color.ORANGE);
		answer_2.setLayout(null);
		
//		텍스트 필드, 2번답, 2번 패널에 들어갑니다
		ansText_2 = new JTextField();
		ansText_2.setColumns(10);
		ansText_2.setBounds(73, 38, 400, 50);
		
////	2차	스위치, 2번 답의 정답 여부를 체크합니다
//		ansSwitch_2 = new ToggleSwitch();
//		ansSwitch_2.setBounds(432, 7, 41, 21);
		
		ansRadio_2 = new JRadioButton("정답");
		ansRadio_2.setFont(new Font("굴림", Font.PLAIN, 17));
		ansRadio_2.setBounds(412, 5, 60, 30);
//		ansRadio_2.setBackground(Color.ORANGE);
		ansRadio_2.addItemListener(this);

			
//		3번 패널 입니다
		answer_3 = new JPanel();
		answer_3.setLayout(null);
		answer_3.setBackground(Color.CYAN);
		answer_3.setBounds(10, 107, 485, 98);

//		텍스트 필드, 3번답, 3번 패널에 들어갑니다
		ansText_3 = new JTextField();
		ansText_3.setColumns(10);
		ansText_3.setBounds(73, 38, 400, 50);
		
////	2차	스위치, 3번 답의 정답 여부를 체크합니다
//		ansSwitch_3 = new ToggleSwitch();
//		ansSwitch_3.setBounds(432, 7, 41, 21);
		
		ansRadio_3 = new JRadioButton("정답");
		ansRadio_3.setFont(new Font("굴림", Font.PLAIN, 17));
		ansRadio_3.setBounds(412, 5, 60, 30);
//		ansRadio_3.setBackground(Color.CYAN);
		ansRadio_3.addItemListener(this);
		
//		4번 패널 입니다
		answer_4 = new JPanel();
		answer_4.setLayout(null);
		answer_4.setBackground(Color.GREEN);
		answer_4.setBounds(510, 107, 485, 98);
		
//		텍스트 필드, 4번답, 4번 패널에 들어갑니다
		ansText_4 = new JTextField();
		ansText_4.setColumns(10);
		ansText_4.setBounds(73, 38, 400, 50);
		
////	2차	스위치, 4번 답의 정답 여부를 체크합니다
//		ansSwitch_4 = new ToggleSwitch();
//		ansSwitch_4.setBounds(432, 7, 41, 21);
		
		ansRadio_4 = new JRadioButton("정답");
		ansRadio_4.setFont(new Font("굴림", Font.PLAIN, 17));
		ansRadio_4.setBounds(412, 5, 60, 30);
//		ansRadio_4.setBackground(Color.GREEN);
		ansRadio_4.addItemListener(this);
		
//		라디오 버튼 선택 해제용
		ansRadio_5 = new JRadioButton();
		
//		정답, 그룹화 라디오 버튼
		ButtonGroup ansGroup = new ButtonGroup();
		ansGroup.add(ansRadio_1);
		ansGroup.add(ansRadio_2);
		ansGroup.add(ansRadio_3);
		ansGroup.add(ansRadio_4);
		ansGroup.add(ansRadio_5);
		getContentPane().add(ansRadio_5);
		

//		이미지추가 패널
		JPanel imagePanel = new JPanel();
		imagePanel.setBackground(Color.LIGHT_GRAY);
		imagePanel.setBounds(7, 90, 483, 345);
		
//		메인 패널에 올라가는 개별 패널입니다
//		allPanel.add(SystemBar);
		allPanel.add(listPanel);
		allPanel.add(quizPanel);
		allPanel.add(answerPanel);
		
//		리스트 패널에 올라가는 버튼과 리스트입니다
		listPanel.add(listSet);
//		listPanel.add(listQuiz);
		listPanel.add(button_2);
		listPanel.add(button_3);
		listPanel.add(button_4);
		listPanel.add(button_5);
		
			
//		문제 패널에 올라가는 버튼과 리스트 입니다 패널내 하위패널은 들여쓰기되어 있습니다
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


//		답 패널에 올라가는 패널과 텍스트 필드 입니다
//		스위치 2차 구현
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


	//난이도, 선택한 라디오 버튼에 따라 변수에 값 저장
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==level_1) {
			levelResult = 10;
		} else if(e.getSource()==level_2) {
			levelResult = 20;
		} else if(e.getSource()==level_3) {
			levelResult = 30;
		}
		
	//정답, 선택한 라디오 버튼에 따라 변수에 값 저장
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
	
	
	//리스트에 추가해요 버튼을 누르면 Quiz_added_VO에 setter값으로 저장
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
		
//			2차 스위치
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
		
//		위에서 setter 삽입 후 출력 클래스로 넘김
		mqm.insertQuiz(qav);
		
//		하나의 문제 등록 후 필드 초기화
//		titleSet.setText(null);			//세트 이름 초기화는 필요 없음
		title.setText(null);			//문제 이름 초기화
		ansText_1.setText(null);
		ansText_2.setText(null);
		ansText_3.setText(null);
		ansText_4.setText(null);
		ansRadio_5.setSelected(true);	//정답 라디오 버튼 초기화
		cookie.setText(null);			//쿠키 개수 초기화
		level_4.setSelected(true);		//난이도 라디오 버튼 초기화
//		aResult.clear();				//스위치형 정답 (2차구현)

//		콘솔로 Quiz에 추가된 퀴즈를 출력함
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


