package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		/*
		 * 정수형 배열 20개를 선언합니다
		 * Random 클래스를 사용하여 1~100까지 난수를 생성하여 저장합니다
		 * 배열에 저장된 정수 중 짝수들의 리스트를 출력하고 짝수들의 합을 계산하여 출력
		 */
		
		// {} 내에 있는 코드는 최소화 하자
		// 작은 일들로 분해하기 
		// 나누어서 정복하라 : Divide and Comquer
		
		// 배열의 크기를 변수에 설정해 두고 코드내에서 공통으로 사용
		int numbersLength = 20;
		
		int intNum[] = new int [numbersLength];
		int intEve[] = new int [numbersLength];
		int index = 0;
		int intSum = 0;
		
		Random rnd = new Random();
		
		// 배열에 난수 저장 및 짝수 검사
		for (int i = 0 ; i <numbersLength ; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			if (intNum[i] % 2 == 0 ) {
				intEve[index++] = intNum[i];
			}
		}
		
		// 짝수들의 합 구하기
		for(int i = 0 ; i < index ; i++) {
			intSum += intEve[i];
		}
		
		// 짝수들 출력하기
		for(int i = 0 ; i < index ; i ++) {
			System.out.println(intEve[i]);
		}
		System.out.println("짝수들의 합 : " + intSum);
		
		
		
	}
}
