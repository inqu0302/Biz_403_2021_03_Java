package com.callor.controller;

import java.util.Random;

public class Controller_08 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		// 어떤 명령을 5번 반복하여 수행하겠다
		for ( int i = 0 ; i < 10 ; i++) {
			
			// 정수형 난수(임의의 정수)를 만들어서 num 변수에 저장
			int num = rnd.nextInt();
			// 저장된 값을 출력
			System.out.println(num);
		}
		System.out.println("========================================");
		for(int i = 0; i<5 ; i++) {
			// 0 ~ 99 까지의 정수를 만듬
			int num = rnd.nextInt(100);
			System.out.println(num);
		}
		
		System.out.println("========================================");
		
		for(int i = 0; i < 5; i++) {
			// 0 ~ ( 10 -1 ) 중에서 임의의 수를 생성
			int num = rnd.nextInt(10);
			System.out.println(num);
		}
	}
}
