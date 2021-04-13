package com.callor.app;

import com.callor.score.service.ScoreService;
import com.callor.score.service.ScoreServiceImplV2Ex;

public class ScoreEx_02A {

	public static void main(String[] args) {

		ScoreService sService = new ScoreServiceImplV2Ex();
				
		sService.selectMenu();
		
	}

}
