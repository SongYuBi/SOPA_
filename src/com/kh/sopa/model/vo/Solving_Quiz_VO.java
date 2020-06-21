package com.kh.sopa.model.vo;

import java.io.Serializable;

public class Solving_Quiz_VO implements Serializable {

	private String quiz_title;	    		//문제 제목
	private String quiz_answer_1;			//문제 답1
	private String quiz_answer_2;			//문제 답2
	private String quiz_answer_3;			//문제 답3
	private String quiz_answer_4; 			//문제 답4
	private String quiz_final_answer; 		//문제 정답

	
	public Solving_Quiz_VO() {}


	public Solving_Quiz_VO(String quiz_title, String quiz_answer_1, String quiz_answer_2, String quiz_answer_3,
			String quiz_answer_4, String quiz_final_answer) {
		super();
		this.quiz_title = quiz_title;
		this.quiz_answer_1 = quiz_answer_1;
		this.quiz_answer_2 = quiz_answer_2;
		this.quiz_answer_3 = quiz_answer_3;
		this.quiz_answer_4 = quiz_answer_4;
		this.quiz_final_answer = quiz_final_answer;
	}


	public String getQuiz_title() {
		return quiz_title;
	}


	public void setQuiz_title(String quiz_title) {
		this.quiz_title = quiz_title;
	}


	public String getQuiz_answer_1() {
		return quiz_answer_1;
	}


	public void setQuiz_answer_1(String quiz_answer_1) {
		this.quiz_answer_1 = quiz_answer_1;
	}


	public String getQuiz_answer_2() {
		return quiz_answer_2;
	}


	public void setQuiz_answer_2(String quiz_answer_2) {
		this.quiz_answer_2 = quiz_answer_2;
	}


	public String getQuiz_answer_3() {
		return quiz_answer_3;
	}


	public void setQuiz_answer_3(String quiz_answer_3) {
		this.quiz_answer_3 = quiz_answer_3;
	}


	public String getQuiz_answer_4() {
		return quiz_answer_4;
	}


	public void setQuiz_answer_4(String quiz_answer_4) {
		this.quiz_answer_4 = quiz_answer_4;
	}


	public String getQuiz_final_answer() {
		return quiz_final_answer;
	}


	public void setQuiz_final_answer(String quiz_final_answer) {
		this.quiz_final_answer = quiz_final_answer;
	}


	@Override
	public String toString() {
		return  quiz_title + ", " + quiz_answer_1 + ", "
				+ quiz_answer_2 + ", " + quiz_answer_3 + ", " + quiz_answer_4
				+ ", " + quiz_final_answer;
	}
	

}
