package com.callor.apps;

import java.util.Random;

public class App_03 {

	/*
	 * 정수형 배열 20개를 선언합니다.
	 * Random 클래스를 사용하여 1~100까지 난수를 배열에 저장
	 * 배열에 저장된 정수 중 짝수들이 몇번 위치에 저장되어있는지 리스트를 출력
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int length = 20;
		
		int intNum[] = new int[length] ;
		
		// 난수를 배열에 저장
		for (int i = 0 ;i < length ; i++) {
			intNum[i] = rnd.nextInt(100) +1 ;
		}
		
		// 요소 : 배열의 몇번째 값
		// 위치 : 배열의 몇번째
		// 첨자 : 배열의 몇번째 인가를 알려주는 값

		// 짝수 검사와 짝수가 있는 위치 출력
		for (int i = 0; i < length ; i ++) {
			if (intNum[i] % 2 == 0 ) {
				System.out.println(i);
			}
		}
		
		
	}
}
