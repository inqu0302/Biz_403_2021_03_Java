package com.callor.controller;

public class Controller_03 {

	public static void main(String[] args) {
		
		int intNum1 = 30 ;
		int intNum2 = 40 ;
		
		// intNum1 이 20 보다 크고, 50보다 작은가
		// 50 > intNum1 > 20 ( 파이썬에서만 가능)
		// true AND true
		boolean bYes = intNum1 > 20 && intNum1 < 50 ;
		// true OF false
		bYes = intNum1 > 20 || intNum1 > 50 ;

		// true AND false
		bYes = 50 > 20 && 20 > 50 ;
		
		
	}
}
