package com.callor.app.service;

import java.util.Scanner;

/*
 * inputValue(string title)
 * inputValue(string title, int start)
 * inputValue(string title, int start, int end)
 * method를 선언
 * title + 값을 입력하세요 prompt를 보여주고
 * 정수 또는 QUIT를 키보드를 통해 입력 받는다
 * 입력값이 QUIT 이면 null 을 return 하고
 * 정수이면 입력한 정수 값을 return 한다.
 * Exception이 발생할 경우 적절하게 예외처리를 수행한다.
 */
public class InputServiceV1 {
	
	protected Scanner scan;
	protected String strNum;
	protected Integer intNum;
	
	public InputServiceV1() {

		scan = new Scanner(System.in);
		strNum = null;
		intNum = null;
	}
	
	// TODO title값만 받는 경우
	public Integer inputValue(String title) {
		
		while(true) {
			System.out.println(title + " 값을 입력하세요(입력취소 : QUIT)");
			System.out.print(">>> ");
			strNum = scan.nextLine();
			if(strNum.equals("QUIT")) {
				return null;
			}
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("QUIT 또는 정수값만 입력해주세요");
				continue;
			}
			return intNum;
		}
	}
	
	// TODO start값까지 받는경우
	public Integer inputValue (String title, int start) {
		
		while(true) {
			System.out.println(title + " 값을 입력하세요(입력취소 : QUIT)");
			System.out.println("값의 범위는 " + start + " 이상입력해주세요");
			System.out.print(">>> ");
			strNum = scan.nextLine();
			if(strNum.equals("QUIT")) {
				return null;
			}
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("QUIT 또는 정수값만 입력해주세요");
				continue;
			}
			if (intNum < start) {
				System.out.println("값의 범위는 " + start + " 이상입력해주세요");
				continue;
			}
			return intNum;
		}
	}
	
	// TODO end값 까지 입력받는 경우
	public Integer inputValue (String title, int start, int end) {
		
		while(true) {
			System.out.println(title + " 값을 입력하세요(입력취소 : QUIT)");
			System.out.printf("값의 범위는 %d ~ %d 입니다.\n", start, end);
			System.out.print(">>> ");
			strNum = scan.nextLine();
			if(strNum.equals("QUIT")) {
				return null;
			}
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("QUIT 또는 정수값만 입력해주세요");
				continue;
			}
			if (intNum < start || intNum > end) {
				System.out.printf("값의 범위는 %d ~ %d 입니다.\n", start, end);
				continue;
			}
			return intNum;
		}
	}

}
