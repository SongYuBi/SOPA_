package com.kh.sopa.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.kh.sopa.view.Main_Frame;

public class Client_Contorller {
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	private Main_Frame gui;
	private String msg;
	private String client_id;
	
	public void connect() {
		String ip = " ";
		int port = 0;
		try {
			socket = new Socket(ip,port);
			System.out.println();
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
