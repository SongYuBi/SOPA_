package com.kh.sopa.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.kh.sopa.model.vo.Quiz_VO;
import com.kh.sopa.model.vo.User_VO;

public class StandRoomPanelTest extends JFrame {
	public StandRoomPanelTest() {
		this.setSize(800, 800);
		this.setLocation(600, 200);
		this.setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.YELLOW);
		mainPanel.setBounds(0, 0, 800, 450);
		mainPanel.setLayout(null);
		
		
		// room Panel 
		JPanel roomPanel = new JPanel();
		roomPanel.setBackground(Color.BLUE);
		roomPanel.setBounds(0, 0, 800, 250);
		roomPanel.setLayout(null);
		
		
		JButton[] rooms = new JButton[5];
		
		int x = 0, y = 0;
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = new JButton();
			rooms[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(((JButton) e.getSource()).getText());
				}
			});
			if (i % 2 == 0) {
				rooms[i].setBackground(Color.MAGENTA);
			}
			else rooms[i].setBackground(Color.PINK);
			rooms[i].setOpaque(true);
			rooms[i].setBorderPainted(false);
			rooms[i].setBounds(x, y, 800, 40);
			y += 50;
			rooms[i].setVisible(false);
			roomPanel.add(rooms[i]);
		}
		mainPanel.add(roomPanel);
		
		
		// userPanel;
		JPanel userPanel = new JPanel();
		userPanel.setBackground(Color.GREEN);
		userPanel.setBounds(500, 200, 300, 250);
		userPanel.setLayout(null);
		
		JPanel userIdPanel = new JPanel();
		JLabel userIdLabel = new JLabel();
		userIdPanel.setBackground(Color.RED);
		
		userIdPanel.add(userIdLabel);
		userPanel.add(userIdPanel);
		userIdPanel.setBounds(0, 50, 150, 30);
		
		
		JPanel userCookiePanel = new JPanel();
		JLabel userCookieLabel = new JLabel();
		userCookiePanel.setBackground(Color.BLUE);
		
		userCookiePanel.add(userCookieLabel);
		userPanel.add(userCookiePanel);
		userCookiePanel.setBounds(0, 100, 150, 30);
		
		JPanel userEmoPanel = new JPanel();
		userEmoPanel.setBackground(Color.CYAN);
		
		userPanel.add(userEmoPanel);
		userEmoPanel.setBounds(150, 0, 150, 130);
		
		mainPanel.add(userPanel);
		
		// user load from file to list
		ArrayList<User_VO> userList = new ObjectIOTest().UserReadToFile();
//		System.out.println(userList.size());
		
		
		// access user = "weakman"
		String findUserId = "weakman";
		User_VO tmp = new User_VO();
		
		// copy user_info
		for(int i = 0; i < userList.size(); i++) {
			if (findUserId.equals(userList.get(i).getUser_id())) {
				tmp.setUser_id(userList.get(i).getUser_id());
				tmp.setUser_pw(userList.get(i).getUser_pw());
				tmp.setUser_phone_number(userList.get(i).getUser_phone_number());
				tmp.setUser_cookie(userList.get(i).getUser_cookie());
				tmp.setUser_1st(userList.get(i).getUser_1st());
				tmp.setUser_2nd(userList.get(i).getUser_2nd());
				tmp.setUser_3rd(userList.get(i).getUser_3rd());
				tmp.setUser_all_quiz(userList.get(i).getUser_all_quiz());
				tmp.setUser_correct_quiz(userList.get(i).getUser_correct_quiz());
			}
		}
		// show user info to panel
		userIdLabel.setText(tmp.getUser_id());
		userCookieLabel.setText(tmp.getUser_cookie() + "");
		
		// menuPanel
		JButton myInfo = new JButton();
		myInfo.setText("내 정보를 봐요");
		myInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(((JButton) e.getSource()).getText());
			}
		});
		userPanel.add(myInfo);
		myInfo.setBounds(0, 150, 150, 40);
		
		JButton logOut = new JButton();
		logOut.setText("로그아웃 해요");
		logOut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(((JButton) e.getSource()).getText());
			}
		});
		userPanel.add(logOut);
		logOut.setBounds(0, 200, 150, 40);
		
		JButton makeRoom = new JButton();
		makeRoom.setText("방을 만들어요");
		makeRoom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(((JButton) e.getSource()).getText());
			}
		});
		userPanel.add(makeRoom);
		makeRoom.setBounds(150, 150, 150, 40);
		
		JButton quit = new JButton();
		quit.setText("종료해요");
		quit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(((JButton) e.getSource()).getText());
			}
		});
		userPanel.add(quit);
		quit.setBounds(150, 200, 150, 40);
		
		
		// chat area 
		JTextArea chatArea = new JTextArea(50, 50);
		mainPanel.add(chatArea);
		chatArea.setBounds(170, 250, 300, 150);
		
		JTextField messageArea = new JTextField();
		mainPanel.add(messageArea);
		messageArea.setBounds(165, 400, 310, 50);
		
		
		//show room's info
		ArrayList<Quiz_VO> quizList = new ObjectIOTest().QuizReadTest();
		
		// check quiz's count,
		System.out.println("quiz 갯수 : " + quizList.size());
		
		for (int i = 0; i < quizList.size(); i++) {
			rooms[i].setText(quizList.get(i).getQuiz_title());
			rooms[i].setVisible(true);
		}
		
		this.add(mainPanel);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
