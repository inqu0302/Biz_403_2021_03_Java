package com.callor.apps.service;

import java.util.Random;

public class EvenServiceV1 {

	int[] intNum;
	int sum;
	public EvenServiceV1() {
		intNum = new int[100];
		
	}
	// 난수를 생성하는 메서드
	public void makeNums() {
		
		Random rnd = new Random();
		for (int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
		
	}
	
	// 짝수들의 합을 구하고 출력하는 메서드
	public void printNumbers() {
		for(int i = 0 ; i<intNum.length ; i++) {
			if (intNum[i] % 2 == 0) {
				sum += intNum[i];
			}
		}
		
		System.out.println("총합 : " + sum);
	}
}
