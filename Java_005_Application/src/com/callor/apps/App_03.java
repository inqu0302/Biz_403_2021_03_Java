package com.callor.apps;

import java.util.Random;

public class App_03 {

	/*
	 * 정수형배열 intSocres를 10개 선언
	 * Random 클래스를 사용하여 50~100 까지 정수
	 * intScores 배열에 저장
	 * 전체 총점, 평균계산후 출력 소수점 둘째자리까지
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intscores[] = new int[10];
		int intSum = 0; 
		float floatAvg = 0.0f;
		
		for (int i = 0; i<10 ; i++) {
			intscores[i] = (rnd.nextInt(51) + 50) ;
			intSum += intscores[i];
		}
		
		floatAvg = (float)intSum / 10;
		
		System.out.println("==================================");
		System.out.printf("총점 : %d\t 평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("==================================");
		
		
	}
	
	
	
	
}
