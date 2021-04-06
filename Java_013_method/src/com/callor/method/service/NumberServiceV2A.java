package com.callor.method.service;

import java.util.Scanner;

/*
 * Scanner 클래스를 사용하여 0~100까지 정수를 입력
 * 입력을 취소 하고 싶으면 QUIT를 입력
 * QUIT를 입력했으면 null을 정수를 입력했으면 입력한 값을 return
 */
public class NumberServiceV2A {

	public Integer inputNum() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 0 ~ 100 까지 중 입력");
		System.out.println("QUIT 입력하면 종료");
		String strNum = scan.nextLine();
		if(strNum.equals("QUIT")) {
			return null;
		} else {
			Integer intNum = Integer.valueOf(strNum);
			return intNum;
		}
		
	}

}
