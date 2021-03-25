package com.callor.apps.service;

import java.util.Random;

public class PrimeeServiceV2 {

	int[] intNum;
	public PrimeeServiceV2() {
		intNum = new int[20];
	}
	
	public void makeNums() {
		
		Random rnd = new Random();
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(51) +50;
		}
	}
	
	public void printPrime() {
		for(int num : intNum) {
			int index = 0;
			for(index = 2 ; index<num ; index++) {
				if (num % index == 0){
					break;
				}
			}
			// index == num 도 가능
			if (index >= num ) {
				System.out.println(num + "는 소수");
			}
		}
		
	}
}
