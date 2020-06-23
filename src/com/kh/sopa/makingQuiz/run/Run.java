package com.kh.sopa.makingQuiz.run;

import com.kh.sopa.makingQuiz.model.dao.Quiz_added_DAO;
import com.kh.sopa.makingQuiz.view.MakingQuiz;
import com.kh.sopa.makingQuiz.vo.ResultPrinter;

public class Run {
	public static void main(String[] args) {
		MakingQuiz mq = new MakingQuiz();
		
		Quiz_added_DAO qad = new Quiz_added_DAO();
		ResultPrinter rp = new ResultPrinter();
		rp.printAllQuiz(qad.readQuizList());
//		TEST te = new TEST();	
	}
}
