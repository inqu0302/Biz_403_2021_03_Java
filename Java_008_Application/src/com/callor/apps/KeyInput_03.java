package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {

	/*
	 * 키보드를 통하여 2개의 정수를 입력받아 변수에 각각저장
	 * 변수에 저장된 정수의 4칙 연산을 수행하여 출력
	 * 키보드로 입력받기 전에 Prompt 를 출력
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연산을 위한 정수값 2개를 입력후 Enter 키를 눌러주세요 ");
		System.out.println("정수 를 입력해 주세요");
		System.out.print(" >> ");
		int num1 = scan.nextInt();
		System.out.println( "두번째 정수를 입력해 주세요");
		System.out.print( " >> ");
		int num2 = scan.nextInt();
		
		String dLines = LinesService.dLines(30);
		
		System.out.println(dLines);
		System.out.println("정수1 >> "+num1);
		System.out.println("정수2 >> "+num2);
		System.out.println(dLines);
		System.out.println("입력된 정수들의 연산 결과값");
		System.out.println(dLines);
		System.out.printf("%d + %d = %d\n",num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n",num1, num2, num1 - num2);
		System.out.printf("%d X %d = %d\n",num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n",num1, num2, num1 / num2);
		System.out.println(dLines);
		
	}
}
