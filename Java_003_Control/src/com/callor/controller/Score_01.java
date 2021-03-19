package com.callor.controller;

public class Score_01 {

	public static void main(String[] args) {
		
		/*
		 * 국어 80 영어 77 수학 65점 sum에 총점 avg 평균값 계산
		 */

		// 변수선언
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		int intSum = 0;
		int intAvg = 0;
		
		// 계산식대입
		intSum = intKor + intEng + intMath ;
		intAvg = intSum / 3 ;
		 
		//출력
		System.out.println("====================================");
		System.out.printf("국어 : %d \n영어 : %d \n수학 : %d\n", intKor, intEng, intMath);
		System.out.println("------------------------------------");
		System.out.printf("총점 : %d\t평균 : %d \n", intSum, intAvg);
		System.out.println("====================================");
		
		/*
		 * printf()를 사용하여 출력할때
		 * %d	: 정수(10진수)
		 * %3d	: 자릿수를 3개로 맞추고 오른쪽 정렬
		 * %f	: 실수(float)
		 * %3.2f: 소수점 이하 2째자리까지 표시
		 * %s 	: 문자열
		 * \n 	: Enter를 누른것 처럼 줄바꿈을 실행
		 * \t 	: Tab 키를 누른것 처럼 사이띄기를 실행
		 */
		
	}
}
