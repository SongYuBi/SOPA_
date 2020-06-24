package com.kh.sopa.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.kh.sopa.model.vo.User_VO;
import com.kh.sopa.view.Stand_Room;



public class Client_Contorller {
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	private Stand_Room gui;
	private String msg;
	private String client_id;

	public void setGui(Stand_Room gui) {
		this.gui = gui;
	}
	
	// Client_id =  user_id
	public void connect(User_VO vo) {
		String ip = "192.168.130.32";
		int port = 8080;
		try {
			socket = new Socket(ip, port);
			System.out.println("서버에 연결  ");

			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());

			out.writeUTF(vo.getUser_id());
			out.writeUTF(vo.getUser_pw());
			out.writeUTF(vo.getUser_phone_number());
			out.writeInt(vo.getUser_cookie());
			out.writeInt(vo.getUser_1st());
			out.writeInt(vo.getUser_2nd());
			out.writeInt(vo.getUser_3rd());
			out.writeInt(vo.getUser_all_quiz());
			out.writeInt(vo.getUser_correct_quiz());
			
			System.out.println("Client : ID 전송 완료");
			gui.label_userid(vo.getUser_id());
			
			while (in != null) {
				msg = in.readUTF();
				System.out.println("클라이언트에서 받아 : msg" + msg);
				
				gui.appendMsg(msg);
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("서버에 연결할 수 없습니다.");
		}
	}

	public void sendMessage(String user_id) {
		try {
			out.writeUTF(user_id);
//			out.flush();
		} catch (IOException e) {
			System.out.println("메시지 전송 오류");
			e.printStackTrace();
		}
	}
	
	//닉네임 setter
		public void setNicknames(String client_id) {
			this.client_id = client_id;
		}
}
