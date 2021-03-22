package com.callor.controller;

import java.util.Random;

public class Controller_11 {

	public static void main(String[] args) {
		
		/*
		 * 1 ~ 100 까지의 임의의 숫자 5개를 만들고
		 * 그 수가 3의 배수인지 아닌지를 판별하여 출력 하시오
		 */
		
		Random rnd = new Random();
		
		for ( int i = 0 ; i < 5 ; i++) {
			int num = rnd.nextInt(100);
			num += 1; 
			if ( num % 3 == 0) {
				System.out.println(num + " 는(은) 3의 배수입니다");
			} else {
				System.out.println(num + " 는(은) 3의 배수가 아닙니다");
			}
		}
	}
}
