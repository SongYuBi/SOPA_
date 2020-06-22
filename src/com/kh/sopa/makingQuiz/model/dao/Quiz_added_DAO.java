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
	
	//파일에서 퀴즈 불러오는 메소드
	public ArrayList<Quiz_added_VO> readQuizList(){
		ObjectInputStream ois = null;
		ArrayList<Quiz_added_VO> list = null;
	
		try {
			ois = new ObjectInputStream(new FileInputStream("Quiz.dat"));
			
			list = (ArrayList<Quiz_added_VO>)ois.readObject();
			
		}catch(FileNotFoundException e){
			System.out.println("파일이 없습니다.");
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
	
	//퀴즈 파일에 퀴즈를 등록하는 메소드
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
