package com.callor.apps;

import java.util.Random;

public class App_04B {

	/*
	 * 반은 5개
	 * 인원은50~99
	 * Random을 이용해 생성
	 * 피자 1box는 6조각
	 * 마무리후에 리스트출력
	 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int pizzaPcs = 6;
		
		//5학급의 인원수를 저장할 배열
		int intClasses[] = new int[5];
		
		for (int i = 0  ; i < 5 ; i ++) {
			
			// ( 0 ~ ( ?? -1 ) + @@
			// @@ : 시작값을 지정하는 형태
			// 50 ~ 59중에 임의의 수를 생성
			int members = rnd.nextInt(10) + 50;
			intClasses[i] = members;
			
		}
		
		// 학급별 주문수량을 계한사는 부분과
		// 리스트를 출력하는 부분을 분리
		// 1. 계산된 주문수량을 담아둘 장소를 생성
		// 2. 저장된 주문수량을 사용하여 출력
		
		int intOrders[] = new int[5];
		
		for(int i = 0; i < 5 ; i++) {
			int order = intClasses[i] / pizzaPcs;
			//인원수 대비 피자 조각수를 비교하여 부족할 경우 1box 추가
			if ( intClasses[i] % (order * pizzaPcs) > 0 ) {
				order++;
			}
			intOrders[i] = order;
		}
		
		System.out.println("피자 주문서");
		System.out.println("============================");
		System.out.println("순번\t인원\tBOX\t조각");
		System.out.println("----------------------------");
		
		int intTotalOrder = 0;
		for(int i = 0 ; i <5 ; i++) {
			System.out.printf((i+1) + "\t");
			System.out.printf(intClasses[i] + "\t");
			System.out.printf(intOrders[i] + "\t");
			System.out.println(intOrders[i] * pizzaPcs);
			
			intTotalOrder += intOrders[i];
		}
		System.out.println("===========================");
		System.out.println("전체 주문 BOX 수량 : " + intTotalOrder);
		System.out.println("===========================");
		
		
		
	}
	
	
}
