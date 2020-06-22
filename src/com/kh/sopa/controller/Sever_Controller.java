package com.kh.sopa.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.kh.sopa.view.Sever_view;

public class Sever_Controller {

	private ServerSocket serverSocket;
	private Socket socket;
	private Sever_view gui;
	private String msg;
	private Map<String, DataOutputStream> clientMap = new HashMap<String, DataOutputStream>() ;
	
	public void setGui(Sever_view gui) {
		this.gui = gui;
	}
	
	public void setting() {
		try {
			Collections.synchronizedMap(clientMap);
			
			serverSocket = new ServerSocket(8080);
			
			while(true) {
				System.out.println("������ �����");
				
				socket = serverSocket.accept();
				
				System.out.println(socket.getInetAddress()+ "���� �����߽��ϴ�.");
				
				Receiver receiver = new Receiver(socket);
				receiver.start();
			}
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("���� ���� ����");
		}
	}
	
	public void sendMessage(String msg) {
		Iterator<String> itearator = clientMap.keySet().iterator();
		String key = "";
		
		
		while (itearator.hasNext()) {
			key = itearator.next();
			try {
				clientMap.get(key).writeUTF(msg);
				System.out.println("sendMessage " + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// nick�� ID ,
	public void addClient(String nick,DataOutputStream out) throws IOException{
		String message = nick + "���� �����ϼ̽��ϴ�. \n";
		//���⼭ Ŭ���̾�Ʈ�� �����ϸ� �ش� ȭ�鿡 ������ �ѷ��ִ°ɷ�?
		clientMap.put(nick,out);
		sendMessage(message);
		
	}
	
	
	class Receiver extends Thread {

		private DataInputStream in;
		private DataOutputStream out;
		private String user_id;

		public Receiver(Socket socket) {
			try {
				out = new DataOutputStream(socket.getOutputStream());
				in = new DataInputStream(socket.getInputStream());
				
				user_id = in.readUTF();
				addClient(user_id,out);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				while (in != null) {
					msg = in.readUTF();
					System.out.println("run : "+msg);
					sendMessage(msg);
					
				}
			} catch (Exception e) {
				removeClient(user_id);
			}
		}
	}
	
	public void removeClient(String user_id) {
		String message= user_id + "���� �����̽��ϴ�. \n";
		sendMessage(message);
		clientMap.remove(user_id);
	}
}
