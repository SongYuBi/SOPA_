package com.kh.sopa.model.DAO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.sopa.model.vo.Quiz_VO;

//���� Ǯ�� �� ����� ���� Ŭ����
public class SolvingQuizDao {
	
	
	//����, ���� ���� �о���� Ŭ����
	public ArrayList<Quiz_VO> readQuizList() {

		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream ois = null;
		
		//�о�� ������ �ٽ� ���� �迭 ����
		ArrayList<Quiz_VO> quizList2 = null;
		
		try {

			in = new FileInputStream("quiz.txt");
			bin = new BufferedInputStream(in);
			ois = new ObjectInputStream(bin);

			quizList2 = (ArrayList<Quiz_VO>) ois.readObject();

			//������ ������ �迭�� �� ����ƴ��� Ȯ�ο� for��
			for (Quiz_VO obj : quizList2) {
				System.out.println(obj);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				ois.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return quizList2;
	}
	
	//���� Ǯ�� Ȯ�ο� ���� ���� Ŭ����
	public void fileSave() {

		//������ ������ �Է���  ArrayList<Quiz> ����
		ArrayList<Quiz_VO> quizList = new ArrayList<Quiz_VO>();

		quizList.add(new Quiz_VO("H2O��?", "�ֽ�", "��", "Ŀ��", "�ݶ�", "��", 10));
		quizList.add(new Quiz_VO("��ü���� ���α׷��� �ƴ� ����?", "�ڹ�", "���̽�", "c#", "c���", "c���", 20));
		quizList.add(new Quiz_VO("���� �� ������?", "���", "���", "����Ʈ��", "����", "���", 20));

		System.out.println(quizList);
		
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("quiz.txt");
			oos = new ObjectOutputStream(new FileOutputStream("quiz.txt"));

			oos.writeObject(quizList);
			oos.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		SolvingQuizDao qd = new SolvingQuizDao();
		qd.fileSave();
		qd.readQuizList();
 
	}
	
	
}
