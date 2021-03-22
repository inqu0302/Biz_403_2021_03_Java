package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		
		/*
		 * 학색 10명의 국어점수를 저장할 변수 선언
		 * 1~100까지 임의 점수를 생성해서 저장
		 * 총점과 평균을 계산해서 출력
		 */
		
		Random rnd = new Random();
		
		int intStd1 = 0;
		int intStd2 = 0;
		int intStd3 = 0;
		int intStd4 = 0;
		int intStd5 = 0;
		int intStd6 = 0;
		int intStd7 = 0;
		int intStd8 = 0;
		int intStd9 = 0;
		int intStd10 = 0;

		int intSum = 0;
		float floatAvg = 0.0f;
		
		intStd1 = rnd.nextInt(100) + 1;
		intStd2 = rnd.nextInt(100) + 1;
		intStd3 = rnd.nextInt(100) + 1;
		intStd4 = rnd.nextInt(100) + 1;
		intStd5 = rnd.nextInt(100) + 1;
		intStd6 = rnd.nextInt(100) + 1;
		intStd7 = rnd.nextInt(100) + 1;
		intStd8 = rnd.nextInt(100) + 1;
		intStd9 = rnd.nextInt(100) + 1;
		intStd10 = rnd.nextInt(100) + 1;
		
		intSum = intStd1 + intStd2 + intStd3 + intStd4 + intStd5 + intStd6 + intStd7 + intStd8 + intStd9 + intStd10;
		floatAvg = (float)intSum / 10 ;
		
		System.out.println("===============================");
		System.out.println("학생1 : " + intStd1);
		System.out.println("학생2 : " + intStd2);
		System.out.println("학생3 : " + intStd3);
		System.out.println("학생4 : " + intStd4);
		System.out.println("학생5 : " + intStd5);
		System.out.println("학생6 : " + intStd6);
		System.out.println("학생7 : " + intStd7);
		System.out.println("학생8 : " + intStd8);
		System.out.println("학생9 : " + intStd9);
		System.out.println("학생10 : " + intStd10);
		System.out.println("-------------------------------");
		System.out.printf("총점 : %d\t 평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("===============================");
		
		
		
		
	}
}
