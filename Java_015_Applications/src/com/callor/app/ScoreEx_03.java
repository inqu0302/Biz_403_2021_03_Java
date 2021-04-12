package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.service.impl.ScoreServiceImplV1;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		ScoreService ssV1 = new ScoreServiceImplV1();
		
		ssV1.selectMenu();
		
	}
}
