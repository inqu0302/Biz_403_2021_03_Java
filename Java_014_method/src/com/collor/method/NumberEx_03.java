package com.collor.method;

import com.collor.method.service.ScoreServiceV1;

public class NumberEx_03 {

	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		ssV1.inputScore("국어", 0, 100);
	}
}
