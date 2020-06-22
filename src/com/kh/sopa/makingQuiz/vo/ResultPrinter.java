package com.kh.sopa.makingQuiz.vo;

import java.util.ArrayList;

import com.kh.sopa.model.vo.Quiz_added_VO;



public class ResultPrinter {
	public void printAllQuiz(ArrayList<Quiz_added_VO> list) {
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}else {
			System.out.println("문제가 없어요");
		}
	}
}