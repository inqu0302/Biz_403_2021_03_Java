package com.callor.app;

import com.callor.score.service.ScoreService;
import com.callor.score.service.ScoreServiceImplV3;

public class ScoreEx_03 {

	public static void main(String[] args) {

		ScoreService sService = new ScoreServiceImplV3();
		sService.selectMenu();
		
	}

}
