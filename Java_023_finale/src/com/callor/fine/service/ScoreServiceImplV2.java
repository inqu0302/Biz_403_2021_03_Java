package com.callor.fine.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{
	
	public ScoreServiceImplV2() {
		// private 를 protected 로 변경
		scoreList = new ArrayList<ScoreVO>();
		scan =new Scanner(System.in);
		
		
	}

}
