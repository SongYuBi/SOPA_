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
			System.out.println("������ ����� ");

			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());

			out.writeUTF(client_id);
			System.out.println("Client : ID ���� �Ϸ�");
			gui.label_userid(client_id);
			String line;
			
			while (in != null) {
				System.out.println("Ŭ���̾�Ʈ���� �޾� " + msg);
				msg = in.readUTF();
				gui.appendMsg(msg);
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("������ ������ �� �����ϴ�.");
		}
	}

	public void sendMessage(String msg) {
		try {
			out.writeUTF(msg);
			System.out.println("Ŭ���̾�Ʈ���� ������ "+msg);
		} catch (IOException e) {
			System.out.println("�޽��� ���� ����");
			e.printStackTrace();
		}
	}
	
	//�г��� setter
		public void setNicknames(String client_id) {
			this.client_id = client_id;
		}
}
