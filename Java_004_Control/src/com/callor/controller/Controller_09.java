package com.callor.controller;

import java.util.Random;

public class Controller_09 {

	public static void main(String[] args) {
	
		/*
		 * 0 ~ 100 까지의 난수 (임의의 숫자) 를 생성하고 그 숫자가 짝수인가 판별
		 */
		
		Random rnd = new Random();
		
		// 0~32까지 
		int num = rnd.nextInt(33);
		if (num % 2 == 0) {
			System.out.println(num + " 는 짝수");
		} else {
			System.out.println(num + " 는 짝수가 아님");
		}
		
		
	}
}
