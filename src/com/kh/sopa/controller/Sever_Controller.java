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
				System.out.println("접속자 대기중");
				
				socket = serverSocket.accept();
				
				System.out.println(socket.getInetAddress()+ "에서 접속했습니다.");
				
				Receiver receiver = new Receiver(socket);
				receiver.start();
			}
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("서버 소켓 에러");
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
	// nick은 ID ,
	public void addClient(String nick,DataOutputStream out) throws IOException{
		String message = nick + "님이 접속하셨습니다. \n";
		//여기서 클라이언트가 접속하면 해당 화면에 유저를 뿌려주는걸로?
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
		String message= user_id + "님이 나가셨습니다. \n";
		sendMessage(message);
		clientMap.remove(user_id);
	}
}
