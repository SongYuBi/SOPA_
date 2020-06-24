package com.kh.sopa.makingQuiz.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

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
import com.kh.sopa.makingQuiz.model.dao.Quiz_DAO;
import com.kh.sopa.model.vo.Quiz_VO;

public class MakingQuiz extends JFrame implements ActionListener, ItemListener {
	MakingQuizManager mqm = new MakingQuizManager();
	Quiz_DAO qd = new Quiz_DAO();
	Quiz_VO qv = new Quiz_VO();
	
	private JPanel	mqPanel;
	private JPanel	aPanel_1;
	private JPanel	aPanel_2;
	private JPanel	aPanel_3;
	private JPanel	aPanel_4;
	
	private JTextField set_info;
	private JTextField title;
	private JTextField subject;
	private JTextField answer_1;
	private JTextField answer_2;
	private JTextField answer_3;
	private JTextField answer_4;
	private String final_answer;
	private int difficulty_result;
	private JTextField cookie;
	private JTextField image;
	private JTextField people;

	
	
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
	
	private JRadioButton level_1;
	private JRadioButton level_2;
	private JRadioButton level_3;
	private JRadioButton level_4; //level_4�� ���� ������
	
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	
//	ArrayList<String> aResult = new ArrayList<>();
//	private String [] answerResult = new String [4];

	private JTable listQuiz;
	private JScrollPane scrollList;

	
	

	public MakingQuiz() {
//		Quiz_VO q = new Quiz_VO();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		mqPanel = new JPanel();
		mqPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mqPanel.setLayout(null);
		setContentPane(mqPanel);		
		
//		��ü ����Ʈ �г�, ��Ʈ����Ʈ�� ��������Ʈ�� ��ġ�մϴ�
		JPanel lPanel = new JPanel();
		lPanel.setBounds(7, 60, 340, 440);
		lPanel.setLayout(null);
		
//		����Ʈ, ��Ʈ�� ����� ��ϵǴ� ����Ʈ�Դϴ�
		JList lSet = new JList();
		lSet.setBounds(7, 7, 160, 340);
		lSet.setBackground(Color.LIGHT_GRAY);
		lSet.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
//		����Ʈ, ������ ����� ��ϵǴ� ����Ʈ�Դϴ�
//		JList listQuiz = new JList(); //qad.readQuizList().toArray()
//		listQuiz.setBounds(170, 7, 160, 340);
//		listQuiz.setBackground(Color.LIGHT_GRAY);
//		listQuiz.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);	

		
		
//		���� ����Ʈ�� ���� dat���� �о�� ���� ��,
//		���� ����� ���̵��� table������ �����ͼ�
//		JTable�� ���� �����
		
		
////	���� ����Ʈ �г�, ���� ����Ʈ�� �ö�ɴϴ�
		JPanel qListPanel = new JPanel();
		qListPanel.setBounds(170, 7, 160, 340);
		qListPanel.setBackground(Color.GRAY);
//		lPanel.add(qListPanel);
		
		
		
//		��������Ʈ
		
		
		String [] atitle = {"�߰��� ����"};
	    String alist = null;
	    String adif = null;
	    String [][] re = {{"1"},{"2"}};
	    
	    ArrayList<Quiz_VO> list = qd.readQuizList();
	    
	    for(int i = 0; i <list.size(); i++) {
	    	alist += (list.get(i).getQuiz_title() + "#");
	    	adif += (list.get(i).getQuiz_difficulty() + "#");
	    }
	    
	    String[] quiz_t = alist.split("#");
//	    String[] quiz_d = adif.split("#");
//	    String array [][] = {{quiz_t},{quiz_d}};
	    //1���� �迭 �ΰ��� �����迭 �ΰ�
	 
		DefaultTableModel model =  new DefaultTableModel(re, atitle);
		
		JTable tableList = new JTable(model);
		
		scrollList = new JScrollPane(tableList);
		scrollList.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollList.setBounds(170, 7, 160, 340);
		
		lPanel.add(scrollList);


//		ArrayList<Quiz_VO> list = qd.readQuizList();
//		String quizTitle;
//		String quizDiffi;
//		Object [][] TD = list.add()
//		String [] col = {"����","���̵�"};
//		
//		for(int i = 0; i < list.size(); i++) {
//			quizTitle += list.get(i).getQuiz_title();
//			quizDiffi += list.get(i).getQuiz_difficulty();
//		}
//
////
//		model = new DefaultTableModel(quizTitle, col);
//		listQuiz = new JTable(model);
//		listQuiz.addMouseListener();
//		listQuiz.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//		scrollList = new JScrollPane(listQuiz);
//		
//		quizList.add(listQuiz);
//		listQuiz.add(scrollList);
//
//	
		
		
		
		

		
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
		button_2.addActionListener(this);
		

		
		
//		���� �г�, ������ ����� �г� �Դϴ�
		JPanel qPanel = new JPanel();
		qPanel.setBounds(354, 60, 658, 440);
		qPanel.setLayout(null);
		
//		��ư, ���� ����, ��Ʈ�� ������ ���¿��� ��ư�� �����ϴ�
		button_1 = new JButton("\uBC29\uC744 \uB9CC\uB4E4\uC5B4\uC694");
		button_1.setFont(new Font("����", Font.PLAIN, 18));
		button_1.setBounds(498, 6, 153, 78);

		
//		�ؽ�Ʈ �ʵ�, 1��Ʈ ��Ʈ ������ �Է¹޽��ϴ�
		set_info = new JTextField();
		set_info.setBounds(70, 7, 420, 35);
		set_info.setColumns(10);
		
//		�ؽ�Ʈ, ���� �гο� ��ġ�ϰ�, �������̶�� �����ֽ��ϴ�
		JLabel qTitleSet = new JLabel("\uBC29\uC81C\uBAA9");
		qTitleSet.setFont(new Font("����", Font.PLAIN, 18));
		qTitleSet.setBounds(7, 7, 58, 30);

		
//		�ؽ�Ʈ �ʵ�, 1���� ������ �Է¹޽��ϴ�
		title = new JTextField();
		title.setBounds(70, 49, 420, 35);
		title.setColumns(10);
		
//		�ؽ�Ʈ, ���� �гο� ��ġ�ϰ�, ������� �����ֽ��ϴ�
		JLabel qTitle = new JLabel("\uBB38\uC81C");
		qTitle.setFont(new Font("����", Font.PLAIN, 18));
		qTitle.setBounds(7, 49, 43, 30);

		
//		���� �г��� ���� �г�, ������ �Է��մϴ�
		JPanel sPanel = new JPanel();
		sPanel.setBounds(498, 90, 153, 78);
		sPanel.setLayout(null);
		
//		Ÿ��Ʋ, ������� �����ֽ��ϴ�
		JLabel sTitle = new JLabel("\uC8FC\uC81C");
		sTitle.setBounds(60, 0, 43, 30);
		sTitle.setFont(new Font("����", Font.PLAIN, 18));
		
//		�ؽ�Ʈ�ʵ�, 1��Ʈ ������ �Է¹޴� �ؽ�Ʈ �ʵ� �Դϴ�
		subject = new JTextField();
		subject.setBounds(7, 35, 139, 35);
		subject.setColumns(10);

		
		
		
//		���� �г��� ���� �ο� �г�, �����ο� �г��Դϴ�
		JPanel pPanel = new JPanel();
		pPanel.setBounds(498, 174, 153, 50);
		pPanel.setLayout(null);
		
//		Ÿ��Ʋ, ���̶�� �����ֽ��ϴ�.
		JLabel pTitle = new JLabel("\uBA85");
		pTitle.setFont(new Font("����", Font.PLAIN, 18));
		pTitle.setBounds(105, 10, 43, 30);
		
//		�ؽ�Ʈ�ʵ�, 1��Ʈ�� �����ο� ���� �Է¹޴� �ؽ�Ʈ �ʵ� �Դϴ�
		people = new JTextField();
		people.setColumns(10);
		people.setBounds(7, 7, 90, 35);
		

		
		
//		���� �г��� ��Ű �г�, ��Ű�г� �Դϴ�
		JPanel cPanel = new JPanel();
		cPanel.setBounds(498, 228, 153, 50);
		cPanel.setLayout(null);
		
//		Ÿ��Ʋ, ��Ű��� �����ֽ��ϴ�
		JLabel cTitle = new JLabel("\uCFE0\uD0A4");
		cTitle.setFont(new Font("����", Font.PLAIN, 18));
		cTitle.setBounds(105, 10, 43, 30);

//		�ؽ�Ʈ�ʵ�, 1���� ��Ű ������ �Է¹޽��ϴ�
		cookie = new JTextField();
		cookie.setColumns(10);
		cookie.setBounds(7, 7, 90, 35);
		
		
		
		
//		���� �г��� ���̵� �г�, ���̵� �г� �Դϴ�
		JPanel lvPanel = new JPanel();
		lvPanel.setBounds(498, 285, 153, 150);
		lvPanel.setLayout(null);
	
//		Ÿ��Ʋ, ���̵���� �����ֽ��ϴ�
		JLabel lvTitle = new JLabel("\uB09C\uC774\uB3C4 (\uCD08)");
		lvTitle.setFont(new Font("����", Font.PLAIN, 18));
		lvTitle.setBounds(30, 7, 90, 30);
		
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
		ButtonGroup lvGroup = new ButtonGroup();
		lvGroup.add(level_1);
		lvGroup.add(level_2);
		lvGroup.add(level_3);
		lvGroup.add(level_4);
		getContentPane().add(level_4);
		

		
//		�� �г�, ���� ��ġ�մϴ�
		JPanel aPanel = new JPanel();
		aPanel.setBounds(7, 504, 1005, 210);
		aPanel.setLayout(null);
		
//		1�� �г� �Դϴ�
		aPanel_1 = new JPanel();
		aPanel_1.setLayout(null);
		aPanel_1.setBackground(Color.RED);
		aPanel_1.setBounds(10, 7, 485, 98);

//		�ؽ�Ʈ�ʵ�, 1����, 1�� �гο� ���ϴ�
		answer_1 = new JTextField();
		answer_1.setColumns(10);
		answer_1.setBounds(73, 38, 400, 50);
		
////	2��	����ġ, 1�� ���� ���� ���θ� üũ�մϴ�
//		ansSwitch_1 = new ToggleSwitch();
//		ansSwitch_1.setBounds(432, 7, 41, 21);
		
		ansRadio_1 = new JRadioButton("����");
		ansRadio_1.setFont(new Font("����", Font.PLAIN, 17));
		ansRadio_1.setBounds(412, 5, 60, 30);
//		ansRadio_1.setBackground(Color.RED);
		ansRadio_1.addItemListener(this);

		
//		2�� �г� �Դϴ�
		aPanel_2 = new JPanel();
		aPanel_2.setBounds(510, 7, 485, 98);
		aPanel_2.setBackground(Color.ORANGE);
		aPanel_2.setLayout(null);
		
//		�ؽ�Ʈ �ʵ�, 2����, 2�� �гο� ���ϴ�
		answer_2 = new JTextField();
		answer_2.setColumns(10);
		answer_2.setBounds(73, 38, 400, 50);
		
////	2��	����ġ, 2�� ���� ���� ���θ� üũ�մϴ�
//		ansSwitch_2 = new ToggleSwitch();
//		ansSwitch_2.setBounds(432, 7, 41, 21);
		
		ansRadio_2 = new JRadioButton("����");
		ansRadio_2.setFont(new Font("����", Font.PLAIN, 17));
		ansRadio_2.setBounds(412, 5, 60, 30);
//		ansRadio_2.setBackground(Color.ORANGE);
		ansRadio_2.addItemListener(this);

			
//		3�� �г� �Դϴ�
		aPanel_3 = new JPanel();
		aPanel_3.setLayout(null);
		aPanel_3.setBackground(Color.CYAN);
		aPanel_3.setBounds(10, 107, 485, 98);

//		�ؽ�Ʈ �ʵ�, 3����, 3�� �гο� ���ϴ�
		answer_3 = new JTextField();
		answer_3.setColumns(10);
		answer_3.setBounds(73, 38, 400, 50);
		
////	2��	����ġ, 3�� ���� ���� ���θ� üũ�մϴ�
//		ansSwitch_3 = new ToggleSwitch();
//		ansSwitch_3.setBounds(432, 7, 41, 21);
		
		ansRadio_3 = new JRadioButton("����");
		ansRadio_3.setFont(new Font("����", Font.PLAIN, 17));
		ansRadio_3.setBounds(412, 5, 60, 30);
//		ansRadio_3.setBackground(Color.CYAN);
		ansRadio_3.addItemListener(this);
		
//		4�� �г� �Դϴ�
		aPanel_4 = new JPanel();
		aPanel_4.setLayout(null);
		aPanel_4.setBackground(Color.GREEN);
		aPanel_4.setBounds(510, 107, 485, 98);
		
//		�ؽ�Ʈ �ʵ�, 4����, 4�� �гο� ���ϴ�
		answer_4 = new JTextField();
		answer_4.setColumns(10);
		answer_4.setBounds(73, 38, 400, 50);
		
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
		ButtonGroup aRGroup = new ButtonGroup();
		aRGroup.add(ansRadio_1);
		aRGroup.add(ansRadio_2);
		aRGroup.add(ansRadio_3);
		aRGroup.add(ansRadio_4);
		aRGroup.add(ansRadio_5);
		getContentPane().add(ansRadio_5);
		

//		�̹����߰� �г�
		JPanel iPanel = new JPanel();
		iPanel.setBackground(Color.LIGHT_GRAY);
		iPanel.setBounds(7, 90, 483, 345);
		
//		���� �гο� �ö󰡴� ���� �г��Դϴ�
		mqPanel.add(lPanel);
		mqPanel.add(qPanel);
		mqPanel.add(aPanel);
		
//		����Ʈ �гο� �ö󰡴� ��ư�� ����Ʈ�Դϴ�
		lPanel.add(lSet);
//		listPanel.add(listQuiz);
		lPanel.add(button_2);
		lPanel.add(button_3);
		lPanel.add(button_4);
		lPanel.add(button_5);
		
			
//		���� �гο� �ö󰡴� ��ư�� ����Ʈ �Դϴ� �гγ� �����г��� �鿩����Ǿ� �ֽ��ϴ�
		qPanel.add(set_info);
			qPanel.add(qTitleSet);
		
		qPanel.add(title);
			qPanel.add(qTitle);
		
		qPanel.add(button_1);
		
		qPanel.add(sPanel);
			sPanel.add(sTitle);
			sPanel.add(subject);	
		
		qPanel.add(pPanel);
			pPanel.add(pTitle);
			pPanel.add(people);
			
		qPanel.add(cPanel);		
			cPanel.add(cTitle);
			cPanel.add(cookie);
			
		qPanel.add(lvPanel);
			lvPanel.add(lvTitle);
			lvPanel.add(level_1);
			lvPanel.add(level_2);
			lvPanel.add(level_3);
			
		qPanel.add(iPanel);


//		�� �гο� �ö󰡴� �гΰ� �ؽ�Ʈ �ʵ� �Դϴ�
//		����ġ 2�� ����
		aPanel.add(aPanel_1);
				aPanel_1.add(answer_1);
//				aPanel_1.add(ansSwitch_1);
				aPanel_1.add(ansRadio_1);
		aPanel.add(aPanel_2);
				aPanel_2.add(answer_2);
//				aPanel_2.add(ansSwitch_2);
				aPanel_2.add(ansRadio_2);
		aPanel.add(aPanel_3);
				aPanel_3.add(answer_3);
//				aPanel_3.add(ansSwitch_3);
				aPanel_3.add(ansRadio_3);
		aPanel.add(aPanel_4);
				aPanel_4.add(answer_4);
//				aPanel_4.add(ansSwitch_4);
				aPanel_4.add(ansRadio_4);
		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}


	//���̵�, ������ ���� ��ư�� ���� ������ �� ����
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==level_1) {
			difficulty_result = 10;
		} else if(e.getSource()==level_2) {
			difficulty_result = 20;
		} else if(e.getSource()==level_3) {
			difficulty_result = 30;
		}
		
	//����, ������ ���� ��ư�� ���� ������ �� ����
		if(e.getSource()==ansRadio_1) {
			final_answer = answer_1.getText();
		} else if(e.getSource()==ansRadio_2) {
			final_answer = answer_2.getText();
		} else if(e.getSource()==ansRadio_3) {
			final_answer = answer_3.getText();
		} else if(e.getSource()==ansRadio_4) {
			final_answer = answer_4.getText();
		}

	}	
	
	
	//����Ʈ�� �߰��ؿ� ��ư�� ������ Quiz_added_VO�� setter������ ����
	@Override	
	public void actionPerformed(ActionEvent a) {
		Quiz_VO qv = new Quiz_VO();
		try {
		if(a.getSource()==button_2) {
			qv.setQuiz_set_info(set_info.getText());
//			qv.setQuiz_title(title.getText());
			qv.setQuiz_subject(subject.getText());
//			qv.setQuiz_answer_1(answer_1.getText());
//			qv.setQuiz_answer_2(answer_2.getText());
//			qv.setQuiz_answer_3(answer_3.getText());
//			qv.setQuiz_answer_4(answer_4.getText());
//			qv.setQuiz_final_answer(final_answer);
//			qv.setQuiz_cookie(Integer.parseInt(cookie.getText()));
//			qv.setQuiz_difficulty(difficulty_result);
//			qv.setQuiz_image(null);
			qv.setQuiz_people(Integer.parseInt(people.getText()));
			
			
			
			mqm.insertSet(set_info.getText(), subject.getText(), Integer.parseInt(people.getText()));
//			mqm.insertSet(set_info.getText(), subject.getText(), Integer.parseInt(people.getText()));

//			�ϳ��� ���� ��� �� �ʵ� �ʱ�ȭ
			set_info.setText(null);			//��Ʈ �̸� �ʱ�ȭ�� �ʿ� ����
			title.setText(null);			//���� �̸� �ʱ�ȭ
			subject.setText(null);
			answer_1.setText(null);
			answer_2.setText(null);
			answer_3.setText(null);
			answer_4.setText(null);
			ansRadio_5.setSelected(true);	//���� ���� ��ư �ʱ�ȭ
			final_answer = null;
			level_4.setSelected(true);		//���̵� ���� ��ư �ʱ�ȭ
			cookie.setText(null);			//��Ű ���� �ʱ�ȭ
			image.setText(null);
			people.setText(null);
//			aResult.clear();				//����ġ�� ���� (2������)
		}
		
		else if(a.getSource()==button_3) {
			qv.setQuiz_set_info(null);
			qv.setQuiz_title(title.getText());
			qv.setQuiz_subject(null);
			qv.setQuiz_answer_1(answer_1.getText());
			qv.setQuiz_answer_2(answer_2.getText());
			qv.setQuiz_answer_3(answer_3.getText());
			qv.setQuiz_answer_4(answer_4.getText());
			qv.setQuiz_final_answer(final_answer);
			qv.setQuiz_cookie(Integer.parseInt(cookie.getText()));
			qv.setQuiz_difficulty(difficulty_result);
			qv.setQuiz_image(null);
			qv.setQuiz_people(0);	
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
			mqm.insertQuiz(qv);
			
//			set_info.setText(null);			//��Ʈ �̸� �ʱ�ȭ�� �ʿ� ����
			title.setText(null);			//���� �̸� �ʱ�ȭ
//			subject.setText(null);
			answer_1.setText(null);
			answer_2.setText(null);
			answer_3.setText(null);
			answer_4.setText(null);
			ansRadio_5.setSelected(true);	//���� ���� ��ư �ʱ�ȭ
			final_answer = null;
			level_4.setSelected(true);		//���̵� ���� ��ư �ʱ�ȭ
			cookie.setText(null);			//��Ű ���� �ʱ�ȭ
			image.setText(null);
//			people.setText(null);
		} 
		
	}catch(NullPointerException e) {
		System.out.println("������ �ʿ��� �Է� ���� ����, ���̵�, ��Ű, ��1, ��2, ��3, ��4, ���� ���� ��ư�Դϴ�.");
		System.out.println("��Ʈ�� �ʿ��� �Է� ���� ������� ����, �����ο��Դϴ�. ");
//		e.printStackTrace();
		}
	}
}


