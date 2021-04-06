package com.collor.method.service;

public class ScoreServiceV1 {

	InputServiceV1 isV1 = new InputServiceV1();
	
	public void inputScore (String title, int start, int end) {
		
		Integer score = isV1.inputValue(title, start, end);
		
		if (score == null) {
			System.out.println("종료");
		} else {
			System.out.printf("%s : %d", title, score);
		}
		
		
	}
}
