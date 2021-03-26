package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {
/*
 * 키보드를 통해서 정수 1개를 입력
 * 입력한 정수가 짝수인가 판별하여 출력
 * 입력한 정수가 소수인지 판별하여 출력
 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		String dLine = LinesService.dLines(30);
		
		System.out.println(dLine);
		System.out.print("정수를 입력해 주세요 : ");
		num = scan.nextInt();
		System.out.println(dLine);
		
		if (num % 2 == 0) {
			System.out.printf("입력하신 정수 %d 는 짝수입니다.\n",num);
		} else {
		System.out.printf("입력하신 정수 %d 는 짝수가 아닙니다.\n",num);
		}
		
		boolean isPrime = true;
		for(int i = 2 ; i < num ; i++) {
			if ( num % i == 0 ) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.printf("입력하신 정수 %d 는 소수입니다.\n",num);
		}else {
			System.out.printf("입력하신 정수 %d 는 소수가 아닙니다.\n",num);
		}
		

		System.out.println(dLine);
		
		
	}
}
