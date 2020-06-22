package com.kh.sopa.makingQuiz.model.controller;

import java.util.ArrayList;

import com.kh.sopa.makingQuiz.model.dao.Quiz_added_DAO;
import com.kh.sopa.makingQuiz.vo.ResultPrinter;
import com.kh.sopa.model.vo.Quiz_added_VO;


public class MakingQuizManager {
	private Quiz_added_DAO qad = new Quiz_added_DAO();
	private ResultPrinter rp = new ResultPrinter(); //출력테스트용 프린터
	
	public void insertQuiz(Quiz_added_VO q) {
		ArrayList<Quiz_added_VO> list = qad.readQuizList();
		
		if(list == null) {
			list = new ArrayList<Quiz_added_VO>();
		}else {
			list.get(list.size());
		}
		
		int result = qad.writeQuiz(list);
	}

	
//	텍스트 파일에서 읽어오는 테스트 코드
	public void selectAllQuiz() {
		rp.printAllQuiz(qad.readQuizList());
		
		
	}

}
