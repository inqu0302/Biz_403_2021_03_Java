package com.callor.controller;

public class Varriable_01 {

	public static void main(String[] args) {
		
		int intNum = 4 ;
		System.out.println(intNum % 2);
		System.out.println(intNum % 2 == 0);
		System.out.println(intNum % 2 == 0 ? " 0 " : " 0이아님 ");
	
		int intResult = intNum % 2 ;
		boolean bYes = (intNum %2 ) == 0 ;
		Boolean bYes1 = 3 == 3 ;
		
		/*
		 * 불린값(형)
		 * true, false : 키워드이면서 하나의 값
		 * 값 : 연산된 결과
		 */
		boolean bYes2 = true ;
		bYes2 = false;
		
		// 비교 연산자
		// 어떤 값들이 같은지, 크기가 어떠한지를 판단하는 연산
		// 결과는 true, false가 있다
		bYes = 3 >	3; 	// false
		bYes = 3 >=	3;	// true
		bYes = 3 < 	3;	// false
		bYes = 3 <= 3;	// true
		bYes = 3 == 3;	// true
		
		bYes = false ;
		
		// 어떤 조건이 true 일때만 코드를 실행한다
		// false 이면 그냥 코드를 실행하지 않고 건너뜀
		if( bYes ) {
			System.out.println("bYes는 true");
			
		}
		
		
		
	}
}
