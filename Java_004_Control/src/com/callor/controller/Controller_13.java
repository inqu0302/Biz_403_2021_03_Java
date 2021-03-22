package com.callor.controller;

import java.util.Random;

public class Controller_13 {

	public static void main(String[] args) {
		
		/*
		 * 1 ~100 까지 범위의 랜덤 수 10개를 만들고 짝수인지 검사하여 짝수인 값들만 합산하여 출력
		 */
		
		Random rnd = new Random();
		int intSum = 0;
		
		for ( int i = 0 ; i < 10 ; i++) {
			int intNum = rnd.nextInt(100);
			if ( intNum % 2 == 0) {
				intSum += intNum;
			}
		}
		
		System.out.println("================================");
		System.out.println(" 합계 : " + intSum);
		System.out.println("================================");
		
		
	}
}
