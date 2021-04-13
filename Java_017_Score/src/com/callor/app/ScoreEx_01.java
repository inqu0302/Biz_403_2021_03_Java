package com.callor.app;

import com.callor.score.service.ScoreServcieImplV1;
import com.callor.score.service.ScoreService;

public class ScoreEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreService score = new ScoreServcieImplV1();
		
		score.selectMenu();
	}

}
