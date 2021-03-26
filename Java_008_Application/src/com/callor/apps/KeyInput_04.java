package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	/*
	 * 정수형 배열5개를 생성
	 * 키보드를 통해서 정수 5개를 입력받아 배열에 저장
	 * 배열에 입력된 정수들의 리스트와 합을 계산하여 출력
	 * 입력과 출력문 ui 만들어서 출력
	 */
	
	public static void main(String[] args) {
		
		int nums[] = new int [ 5 ];
		
		Scanner scan = new Scanner(System.in);
		String dLines = LinesService.dLines(30);
		
		//정수를 입력받기 위한 안내문
		System.out.println(dLines);
		System.out.println("정수 5개를 입력해 주세요");
		System.out.println("입력후 Enter 키를 눌러주세요");
		System.out.println(dLines);
		
		//정수를 입력받는 부분
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print("정수를 입력해주세요 : ");
			nums[i] = scan.nextInt();
		}
		
		//출력문
		System.out.println(dLines);
		System.out.println("입력하신 정수는 다음과 같습니다.");
		System.out.println(dLines);
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.printf("%d\t" , nums[i]);
		}
		System.out.println();
		int sum = 0;
		
		// 리스트의 합을 출력하는 부분
		System.out.println(dLines);
		for (int i = 0 ; i < nums.length; i++) {
			sum += nums[i];
		}
		
		System.out.printf("입력하신 정수의 합 : %d\n",sum);
		System.out.println(dLines);
		
	}
}
