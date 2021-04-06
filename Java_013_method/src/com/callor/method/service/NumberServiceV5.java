package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {
		
		Scanner scan = new Scanner(System.in);
		String strNum = null;
		
		while(true) {
			
			System.out.println(title + " 값을 입력하세요");
			System.out.println("종료는 QUIT");
			System.out.print(">> ");
			strNum = scan.nextLine();
			
			Integer intNum = 0;
			if(strNum.equals("QUIT")) {
				return null;
			} else
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("숫자만 입력해주세요");
					continue;
				}
			if( intNum >0) {
				return intNum;
			} else {
				System.out.println("입력값 범위 초과");
				continue;
			}
		}
		
	}
}
