package com.callor.apps.service;


public class TimeServiceV1 {

	int[] gugudan;
	int[] intNums;
	int dan;
	
	public TimeServiceV1(int num) {
		
		gugudan = new int[8];
		intNums = new int[gugudan.length];
		
		dan = num;
	}
	
	//구구단 식을 만드는 메서드
	public void makeGugudan() {
		for (int i = 0; i < gugudan.length ; i++) {
			gugudan[i] += i+2;
			intNums[i] = dan * gugudan[i];
		}
	}
	
	//구구단을 출력하는 메서드
	public void printGugudan() {
		System.out.println("=============================");
		System.out.printf("%d 단\n", dan);
		System.out.println("=============================");
		for(int i = 0; i < gugudan.length ; i++) {
			System.out.printf("%d X %d = %d\n",dan,gugudan[i],intNums[i]);
		}
		System.out.println("============================");
	}
	
}
