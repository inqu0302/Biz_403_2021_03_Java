package com.callor.controller;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] args) {
		
		/*
		 * 1~100까지의 범위의 랜덤수로 국어, 영어, 수학 과목의 점수를 생성
		 * 각 과목의 점수를 변수에 저장
		 * 총점과 평균을 계산하여 출력
		 */
		
		Random rnd = new Random();
		
		int intKor = 0 ;
		int intEng = 0;
		int intMat = 0;
		
		int intSum = 0;
		float floatAvg = 0.0f;
		
		intKor = rnd.nextInt(100) + 1;
		intEng = rnd.nextInt(100) + 1;
		intMat = rnd.nextInt(100) + 1;
		
		intSum = intKor + intEng + intMat ;
		
		floatAvg = (float)intSum / 3 ;
		
		System.out.println("===============================");
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMat);
		System.out.println("-------------------------------");
		System.out.printf("총점 : %d\t 평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("===============================");
		
		
	}
}
