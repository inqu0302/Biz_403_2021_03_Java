package com.callor.apps.service;

import java.util.Random;

/*
 * 10명의 학생의 국어, 영어, 수학 점수를 배열에 저장
 * 학생들의 총점, 평균을 계산하여 성적리스트 출력
 */

	
// method 의 괄호() 안에 선언된 변수
// 매개변수, parameter 라고 한다.
public class ScoreServiceV2 extends ScoreServiceV1{

	public ScoreServiceV2(int members) {
	
		
		intKor = new int[ members ];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		
		intSum = new int[intKor.length];
		floatAvg = new float[intKor.length];
	}
}