package com.kh.sopa.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.kh.sopa.view.Main_Frame;
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
	public void connect(String client_id) {
		String ip = "192.168.0.2";
		int port = 8080;
		try {
			socket = new Socket(ip, port);
			System.out.println("서버에 연결  ");

			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());

			out.writeUTF(client_id);
			System.out.println("Client : ID 전송 완료");
			gui.label_userid(client_id);
			String line;
			
			while (in != null) {
				System.out.println("클라이언트에서 받아 " + msg);
				msg = in.readUTF();
				gui.appendMsg(msg);
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("서버에 연결할 수 없습니다.");
		}
	}

	public void sendMessage(String msg) {
		try {
			out.writeUTF(msg);
			System.out.println("클라이언트에서 서버로 "+msg);
		} catch (IOException e) {
			System.out.println("메시지 전송 오류");
			e.printStackTrace();
		}
	}
	
	//닉네 setter
		public void setNicknames(String client_id) {
			this.client_id = client_id;
		}
}
