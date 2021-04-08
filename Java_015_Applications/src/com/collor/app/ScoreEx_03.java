package com.collor.app;

import com.collor.app.service.ScoreService;
import com.collor.service.impl.ScoreServiceImplV1;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		ScoreService ssV1 = new ScoreServiceImplV1();
		
		ssV1.selectMenu();
		
	}
}
