package com.callor.fine;

import java.util.Random;

public class MainEx_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] nums = new int[100];
		
		// 100개의 배열에 1 ~ 100 범위의 임의 정수 100개를 저장
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		// 배열 100개에 저장된 값 중에서 소수인 값들만 출력
		for(int i = 0; i < nums.length ; i++) {
			
			int index = 0;
			// nums.length >>> nums[i]
			for (index = 2; index < nums.length ; index++) {
				// nums[i] % index ==0
				if( ? % ?? == 0) {
					break;
				}
			}
			// index <= num[i] ?
			if ( ? <= ?? ){
				System.out.println("소수가 아님");
			} else {
				System.out.println("소수");
			}
		}
	}
}
