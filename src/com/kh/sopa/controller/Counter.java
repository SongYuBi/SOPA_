//전진희 타이머용 클래스
package com.kh.sopa.controller;

	public class Counter {
	
		public int S;
		public Counter() {
			S = 10;
	}
}

/*
public class Timer1 extends Thread {

	//상위 버튼 타이머 라벨
		Timer timerSec = new Timer();
		int sec;

		JLabel timerLabel = null;
			
	public Timer1(JLabel timerLabel	) {
			
		this.timerLabel = timerLabel;
		
	}
		
	@Override 
	public void run() {
			sec = 10;
			timerSec.cancel();
			timerSec = new Timer();

			timerSec.scheduleAtFixedRate(new TimerTask() {
				
		
				public void run() {
					timerLabel.setText("" + sec + "초 남았습니다.");
					sec--;
					if(sec == -1) {
						timerSec.cancel();
					}
				}
			
			}, 0, 1000);
		}

	
	*/
	



