package com.callor.apps;

import java.util.Random;

public class App_01 {

	/*
	 * 피자는 한판에 6조각
	 * 부족하지않게 나눠먹으려면 주문해야하는 피자의 양
	 * Random클래스를 사용 25 ~50의 정수를 생성 intMembers 변수에 저장
	 * 주문할 피자판수를 계산하는 코드
	 */
	
	public static void main(String[] args) {
		
		int intMembers = 0 ;
		float floatPizza = 0.0f ;
		
		Random rng = new Random();
		 
		intMembers = rng.nextInt(26) + 25 ;

		floatPizza = (float)intMembers / 6;
		floatPizza += 0.4;
		
		System.out.println(intMembers + "명");
		System.out.printf("주문할 피자 : %3.0f",  floatPizza);
	
	}
}
