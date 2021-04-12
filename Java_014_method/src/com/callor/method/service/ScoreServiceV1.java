package com.callor.method.service;


public class ScoreServiceV1 {
	
	
	public void inputScore (String title, int start, int end) {
		InputServiceV1 isV1 = new InputServiceV1();
		
		Integer score = isV1.inputValue(title, start, end);
		
		if (score == null) {
			System.out.println("종료");
		} else {
			System.out.printf("%s : %d", title, score);
		}
		
		
	}

}
