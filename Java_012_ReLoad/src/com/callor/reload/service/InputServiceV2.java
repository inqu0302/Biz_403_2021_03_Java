package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * scan, intList 객체선언
 * 생성자에서 객체 초기화
 * inputNum 메서드에서 키보드를통해 정수를 입력받아 intList에 추가
 * 입력받는 정수는 50~150 이내 유효성검사 수행
 */
public class InputServiceV2 {
	
	protected Scanner scan;
	protected List<Integer> intList ;
	
	public InputServiceV2() {
		
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}

	
	public void inputNum() {
		while(true) {
			System.out.println("=".repeat(40));
			System.out.println("정수를 입력해주세요.(범위50~150)");
			System.out.print("(종료:QUIT) >> ");
			String str = scan.next();
			if (str.equals("QUIT")) {
				break;
			}
			int num = 0;
			try {
				num = Integer.valueOf(str);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("-".repeat(40));
				System.out.println("정수를 입력하세요");
				continue;
			}
			
			if(num < 50 || num > 150 ) {
				System.out.println("-".repeat(40));
				System.out.println("숫자를 확인해주세요");
			} else {
				intList.add(num);
			}
		}
		System.out.println("=".repeat(40));
		
	}// End intputNume
	
	public void printNum() {
		for(int i = 0; i < intList.size(); i++) {
			System.out.println("입력하신 정수는 : " + intList.get(i));
		}
	}
}
