package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV4 {

	public Integer inputNum() {
		
		Scanner scan = new Scanner(System.in);
		String strNum = null;
		
		while(true) {
			System.out.println("정수 0 ~ 100 까지 입력해주세요");
			System.out.println("종료 하시려면 QUIT");
			System.out.print(">> ");
			strNum = scan.nextLine();
			Integer intNum = null;
			if(strNum.trim().equals("QUIT")) {
				System.out.println("종료 합니다.");
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("숫자를 입력해주세요");
					continue;
				}
				
			}
			if ( intNum <= 100 && intNum >= 0 ) {
				return intNum;
			} else {
				System.out.println("0 ~ 100 사이의 숫자만 입력해주세요");
				continue;
			}
			
		}
		
	}
}
