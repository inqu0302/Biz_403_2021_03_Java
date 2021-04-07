package com.collor.method.service;
/*
 * inputScore() method를 선언하고
 * InputServiceV2 클래스를 사용하여
 * 국어, 영어, 수학 점수를 입력받고
 * 각각 intKor, intEng, intMath변수에 저장
 * 각 점수는 0 ~100점 범위내에서 입력
 * 입력받은 3과목의 총점과 평균을 계산하여 출력
 */
public class ScoreServiceV3 {

	public void inputScore() {
		
		InputServiceV2 inService = new InputServiceV2();
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			return;
		}
		
		int intTotal = intKor + intEng + intMath ;
		float floAvg = (float) intTotal / 3;
		
		System.out.printf("3과목 총점 : %d, 3과목 평균 점수 : %3.2f", intTotal, floAvg);
		
	}
}
