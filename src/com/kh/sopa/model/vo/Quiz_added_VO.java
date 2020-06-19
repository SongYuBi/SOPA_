package com.kh.sopa.model.vo;

public class Quiz_added_VO {

	private String added_title;			//문제 제목
	private String added_subject;		//문제 주제
	private String added_answer_1;		//답 1번
	private String added_answer_2;		//답 2번
	private String added_answer_3;		//답 3번
	private String added_answer_4;		//답 4번
	private String added_final_answer;	//문제에서의 정답 
	private int added_difficulty;		//난이도 (10초 20초 30초 단위로 들어가니까 일단 정수형으로 넣었습니다.)
	private int added_cookie;			//게임 내에서의 재화
	private String added_image;			//이미지 경로
	private int added_people;			//인원 수
 
	
	public Quiz_added_VO() {
		// TODO Auto-generated constructor stub
	}
	


	public Quiz_added_VO(String added_title, String added_subject, String added_answer_1, String added_answer_2,
			String added_answer_3, String added_answer_4, String added_final_answer, int added_difficulty,
			int added_cookie, String added_image, int added_people) {
		super();
		this.added_title = added_title;
		this.added_subject = added_subject;
		this.added_answer_1 = added_answer_1;
		this.added_answer_2 = added_answer_2;
		this.added_answer_3 = added_answer_3;
		this.added_answer_4 = added_answer_4;
		this.added_final_answer = added_final_answer;
		this.added_difficulty = added_difficulty;
		this.added_cookie = added_cookie;
		this.added_image = added_image;
		this.added_people = added_people;
	}

	public String getAdded_title() {
		return added_title;
	}

	public void setAdded_title(String added_title) {
		this.added_title = added_title;
	}

	public String getAdded_subject() {
		return added_subject;
	}

	public void setAdded_subject(String added_subject) {
		this.added_subject = added_subject;
	}

	public String getAdded_answer_1() {
		return added_answer_1;
	}

	public void setAdded_answer_1(String added_answer_1) {
		this.added_answer_1 = added_answer_1;
	}

	public String getAdded_answer_2() {
		return added_answer_2;
	}

	public void setAdded_answer_2(String added_answer_2) {
		this.added_answer_2 = added_answer_2;
	}

	public String getAdded_answer_3() {
		return added_answer_3;
	}

	public void setAdded_answer_3(String added_answer_3) {
		this.added_answer_3 = added_answer_3;
	}

	public String getAdded_answer_4() {
		return added_answer_4;
	}

	public void setAdded_answer_4(String added_answer_4) {
		this.added_answer_4 = added_answer_4;
	}

	public String getAdded_final_answer() {
		return added_final_answer;
	}

	public void setAdded_final_answer(String added_final_answer) {
		this.added_final_answer = added_final_answer;
	}

	public int getAdded_difficulty() {
		return added_difficulty;
	}

	public void setAdded_difficulty(int added_difficulty) {
		this.added_difficulty = added_difficulty;
	}

	public int getAdded_cookie() {
		return added_cookie;
	}

	public void setAdded_cookie(int added_cookie) {
		this.added_cookie = added_cookie;
	}

	public String getAdded_image() {
		return added_image;
	}

	public void setAdded_image(String added_image) {
		this.added_image = added_image;
	}

	public int getAdded_people() {
		return added_people;
	}

	public void setAdded_people(int added_people) {
		this.added_people = added_people;
	}



	@Override
	public String toString() {
		return "Quiz_added_VO [added_title=" + added_title + ", added_subject=" + added_subject + ", added_answer_1="
				+ added_answer_1 + ", added_answer_2=" + added_answer_2 + ", added_answer_3=" + added_answer_3
				+ ", added_answer_4=" + added_answer_4 + ", added_final_answer=" + added_final_answer
				+ ", added_difficulty=" + added_difficulty + ", added_cookie=" + added_cookie + ", added_image="
				+ added_image + ", added_people=" + added_people + "]";
	}
	
	
	
}
