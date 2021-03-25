package com.callor.apps;

import java.util.Random;

public class App_01 {

	/*
	 * 정수형 배열 20개를 선언 Random 클래스를 사용하여 50~100까지 난수를 생성 소수인 수들을 리스트로 출력
	 */
	public static void main(String[] args) {
		
	
	
		Random rnd = new Random();
		int intNum[] = new int[20];
		int prime[] = new int[20];

		int num = 2;
		
		// 랜덤값 생성
		for (int i = 0; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(50) + 51 ;
		}
		
		// 소수인지 판별식
		for (int i = 0; i < intNum.length ; i++) {
			for (num = 2; num <= intNum[i] ; num++) {
				if (intNum[i] % num == 0 ) {
					break;
				}else if ((intNum[i] -1) == num) {
				prime[i] = intNum[i];}
			}
		}
		System.out.println(num);
		
		// 출력
		for ( int i = 0; i < prime.length ; i++) {
			System.out.printf("%d\t%d\n",prime[i], intNum[i]);
		}
	
	
	
	}
}
