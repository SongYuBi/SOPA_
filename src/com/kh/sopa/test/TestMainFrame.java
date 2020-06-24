package com.kh.sopa.test;

import javax.swing.JFrame;

import com.kh.sopa.view.Login_Panel;

public class TestMainFrame {
	public static void main(String[] args) {
		JFrame f = new JFrame("realtest");
		f.setSize(1024, 768);
		f.setLayout(null);
		f.add(new Login_Panel(f));
//		f.add(new StandRoomPanelTest(f, "powerman"));
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
//public class TestMainFrame extends JFrame {
//	public TestMainFrame() {
//		this.setSize(1024, 768);
//		this.setTitle("testMainFrame");
//		System.out.println("TestMainFrame");
//		
//		this.add(new Login_Panel(this));
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setVisible(true);
//	}
//	
//	public static void main(String[] args) {
//		new TestMainFrame();
//	}
//}
