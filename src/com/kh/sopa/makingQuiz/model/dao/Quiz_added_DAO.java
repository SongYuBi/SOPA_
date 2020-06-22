package com.kh.sopa.makingQuiz.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.sopa.model.vo.Quiz_added_VO;


public class Quiz_added_DAO {
	
	public Quiz_added_DAO() {}
	
	//���Ͽ��� ���� �ҷ����� �޼ҵ�
	public ArrayList<Quiz_added_VO> readQuizList(){
		ObjectInputStream ois = null;
		ArrayList<Quiz_added_VO> list = null;
	
		try {
			ois = new ObjectInputStream(new FileInputStream("Quiz.dat"));
			
			list = (ArrayList<Quiz_added_VO>)ois.readObject();
			
		}catch(FileNotFoundException e){
			System.out.println("������ �����ϴ�.");
		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}finally {
			if(ois != null) {
				try {
					ois.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}
	
	//���� ���Ͽ� ��� ����ϴ� �޼ҵ�
	public int writeQuiz(ArrayList<Quiz_added_VO> list) {
		ObjectOutputStream oos = null;
		
		int result = 0;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("Quiz.dat"));
			oos.writeObject(list);
			
			result++;
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
