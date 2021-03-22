package com.callor.controller;

public class Controller_02 {

	public static void main(String [] args) {
		
		/*
		 * boolean (Boolean)
		 * true, false 2가지의 경우의 값을 갖는 특별한 형태
		 * 
		 * 대입연산자 (=) 오른쪽의 연산을 수행하며 3 == 3 ( == : 동등연산자, 일치연산자)
		 * 결과를 bYes 변수에 담아라
		 * 
		 * 동등연산자 : 두 값이 같냐
		 * 결과는 true 또는 false가 나타난다
		 */
		
		
		boolean bYes = 3 ==3; // true
		
		bYes = 15 % 3 == 0; // true
		
		int intNum = 15;
		
		// intNum 에 담긴 값이 3의 배수인가
		System.out.println(intNum % 3 == 0);
		
		// intNum 에 담긴 값이 5의 배수인가
		System.out.println(intNum % 5 == 0);
		
		// intNum 에 담긴 값이 3의 배수이면서 5의 배수인가
		// % 3 == AND % 5 == 0 인가
		
		// && : AND 관계 연산자
		bYes = intNum % 3 == 0 && intNum % 5 == 0;
		
		intNum = 12;
		
		// intNum 에 담긴 값이 3의 배수 이거나 ( 또는) 5의 배수인가
		
		// || : OR 관계연산자
		bYes = intNum % 3 == 0 || intNum % 5 == 0;
		
		/*
		 * 관계연산자
		 * 2가지 이상의 비교연산 ( ==, <, >, <=, >=, != )을 동시에 수행하기 위한 연산
		 * 
		 */
		
		// &&(AND) 는 true = 1 false = 0 으로 하는 곱셈연산
		bYes = true	 && true ;	//true
		bYes = true	 && false ;	//false
		bYes = false && true ;	//false
		bYes = false && false ;	//false
		
		// || (filter)기호 OR true = 1 false = 0으로 하는 덧셈연산
		bYes = true	 || true ;	//true
		bYes = true	 || false ;	//true
		bYes = false || true ;	//true
		bYes = false || false ;	//false
		
		
	}
}
