package com.collor.app;

import com.collor.app.service.ScoreService;
import com.collor.service.impl.ScoreServiceImplV2;

public class ScoreEx_04 {

	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV2();
		
		sService.selectMenu();
		
	}
}
