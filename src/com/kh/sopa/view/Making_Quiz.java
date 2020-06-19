package com.kh.sopa.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;


public class Making_Quiz extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField tfSetName;
	private JTextField tfQuizName;
	private JTextField tfSubTitleName;
	private JTextField tfPeoNum;
	private JTextField tfCooNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Making_Quiz frame = new Making_Quiz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Making_Quiz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		JPanel SystemBar = new JPanel();
		SystemBar.setBounds(7, 7, 1005, 50);
		SystemBar.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(7, 7, 830, 35);
		SystemBar.add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("\uB4A4\uB85C\uAC00\uC694");
		btnBack.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		btnBack.setBounds(845, 6, 153, 37);
		SystemBar.add(btnBack);
		
		
		
		
		
		JPanel LPanel = new JPanel();
		LPanel.setBounds(7, 60, 340, 440);
		LPanel.setLayout(null);
		
		JList MakeSet = new JList();
		MakeSet.setBounds(7, 7, 160, 340);
		MakeSet.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JList MakeQuiz = new JList();
		MakeQuiz.setBounds(170, 7, 160, 340);
		MakeSet.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		JButton btnAddList = new JButton("\uB9AC\uC2A4\uD2B8\uC5D0 \uCD94\uAC00!");
		btnAddList.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		btnAddList.setBounds(170, 350, 160, 40);
		
		JButton btnDelList = new JButton("\uB9AC\uC2A4\uD2B8\uC11C \uC0AD\uC81C!");
		btnDelList.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		btnDelList.setBounds(170, 395, 160, 40);
		
		JButton btnAddSet = new JButton("\uC138\uD2B8\uB85C \uCD94\uAC00!");
		btnAddSet.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		btnAddSet.setBounds(7, 351, 160, 40);
		
		
		
		
		
		
		JPanel QPanel = new JPanel();
		QPanel.setBounds(354, 60, 658, 440);
		QPanel.setLayout(null);
		
		JPanel addImagePanel = new JPanel();
		addImagePanel.setBounds(7, 90, 483, 345);
		addImagePanel.setLayout(null);

		JPanel addSubPanel = new JPanel();
		addSubPanel.setBounds(498, 90, 153, 78);
		addSubPanel.setLayout(null);
		
		JLabel subTitle = new JLabel("\uC8FC\uC81C");
		subTitle.setBounds(60, 0, 43, 30);
		subTitle.setFont(new Font("±¼¸²", Font.PLAIN, 18));

		JPanel addPeoPanel = new JPanel();
		addPeoPanel.setBounds(498, 174, 153, 50);
		addPeoPanel.setLayout(null);

		JPanel addCooPanel = new JPanel();
		addCooPanel.setBounds(498, 228, 153, 50);
		addCooPanel.setLayout(null);

		JPanel addLevPanel = new JPanel();
		addLevPanel.setBounds(498, 285, 153, 150);
		addLevPanel.setLayout(null);
	
		tfSetName = new JTextField();
		tfSetName.setBounds(7, 7, 483, 35);
		QPanel.add(tfSetName);
		tfSetName.setColumns(10);
		
		tfQuizName = new JTextField();
		tfQuizName.setBounds(7, 49, 483, 35);
		QPanel.add(tfQuizName);
		tfQuizName.setColumns(10);
		
		JButton btnGoRoom = new JButton("\uBC29\uC744 \uB9CC\uB4E4\uC5B4\uC694");
		btnGoRoom.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		btnGoRoom.setBounds(498, 6, 153, 78);
		
		tfSubTitleName = new JTextField();
		tfSubTitleName.setBounds(7, 35, 139, 35);
		tfSubTitleName.setColumns(10);
		
		tfPeoNum = new JTextField();
		tfPeoNum.setColumns(10);
		tfPeoNum.setBounds(7, 7, 90, 35);
		
		JLabel peoTitle = new JLabel("\uBA85");
		peoTitle.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		peoTitle.setBounds(105, 10, 43, 30);
		
		tfCooNum = new JTextField();
		tfCooNum.setColumns(10);
		tfCooNum.setBounds(7, 7, 90, 35);
		
		JLabel CooTitle = new JLabel("\uCFE0\uD0A4");
		CooTitle.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		CooTitle.setBounds(105, 10, 43, 30);
		
		JLabel addLevTitle = new JLabel("\uB09C\uC774\uB3C4 (\uCD08)");
		addLevTitle.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		addLevTitle.setBounds(30, 7, 90, 30);

		
		JRadioButton rdbtnHigh = new JRadioButton(" \uC0C1\uAE09 (10)");
		rdbtnHigh.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		rdbtnHigh.setBounds(15, 40, 120, 30);

		
		JRadioButton rdbtnMedium = new JRadioButton(" \uC911\uAE09 (20)");
		rdbtnMedium.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		rdbtnMedium.setBounds(15, 80, 120, 30);
		
		JRadioButton rdbtnLow = new JRadioButton(" \uD558\uAE09 (30)");
		rdbtnLow.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		rdbtnLow.setBounds(15, 120, 120, 30);
		
		
		
		
		
		
		JPanel APanel = new JPanel();
		APanel.setBounds(7, 504, 1005, 210);
		APanel.setLayout(null);
		
		JButton btnAnswer_1 = new JButton("\uC815\uB2F51");
		btnAnswer_1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		btnAnswer_1.setBounds(10, 5, 485, 98);
		
		JButton btnAnswer_2 = new JButton("\uC815\uB2F52");
		btnAnswer_2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		btnAnswer_2.setBounds(510, 5, 485, 98);
		
		JButton btnAnswer_3 = new JButton("\uC815\uB2F53");
		btnAnswer_3.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		btnAnswer_3.setBounds(10, 107, 485, 98);
		
		JButton btnAnswer_4 = new JButton("\uC815\uB2F54");
		btnAnswer_4.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		btnAnswer_4.setBounds(510, 107, 485, 98);
		
		
		

		contentPane.add(SystemBar);
		contentPane.add(LPanel);
		contentPane.add(QPanel);
		contentPane.add(APanel);
		

		
		LPanel.add(MakeSet);
		LPanel.add(MakeQuiz);
		LPanel.add(btnDelList);
		LPanel.add(btnAddList);
		LPanel.add(btnAddSet);
		
		
		
		QPanel.add(btnGoRoom);
		QPanel.add(addImagePanel);
		QPanel.add(addSubPanel);
			addSubPanel.add(tfSubTitleName);
			addSubPanel.add(subTitle);	
		QPanel.add(addPeoPanel);
			addPeoPanel.add(tfPeoNum);
			addPeoPanel.add(peoTitle);
		QPanel.add(addCooPanel);		
			addCooPanel.add(tfCooNum);
			addCooPanel.add(CooTitle);
		QPanel.add(addLevPanel);
			addLevPanel.add(addLevTitle);
			addLevPanel.add(rdbtnHigh);
			addLevPanel.add(rdbtnMedium);
			addLevPanel.add(rdbtnLow);
		

			
		APanel.add(btnAnswer_1);
		APanel.add(btnAnswer_2);
		APanel.add(btnAnswer_3);
		APanel.add(btnAnswer_4);
		
		
	}
}
