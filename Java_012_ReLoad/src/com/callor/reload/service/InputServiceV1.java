package com.callor.reload.service;
/*
 * List<Integer> intList 리스트 객체선언, 입력을위한 Scanner scan 객체선언
 * intList,scan 클래스 생성자에서 객체생성
 * inputNum() method 선언, 정수입력받아 intList객체에 추가하는 코드 작성
 * printNum() method선언 입력된 리스트 출력하는 코드 작성
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV1 {
	/*
	 * 맴버변수들 : 클래스 영역에 선언된 객체들
	 * 접근 제한자
	 * private : 나 혼자 단독으로 사용할때
	 * protected : 클래스를 상속하여 사용할수 있도록 할때
	 */
	// Integer wrapper 클래스 형 데이터들을 담을 리스트
	protected List<Integer> intList ;
	// 키보드 입력을 받아 코드를 수행하기 위해서 선언
	protected Scanner scan;
	
	// 선언만 된 객체는 코드(method)를 호출하여 기능을 수행할수 없다
	// 반드시 생성(초기화)를 해주어야 한다.
	// 현재 Service 클래스의 생성자 method에서 수행을 한다.
	public InputServiceV1(){
		//TODO InputserviceV1의 생성자 method
		intList = new ArrayList <Integer>();
		scan = new Scanner(System.in);
	}
	
	// method의 선언문
	// 클래스에 선언하는 기본 type의 method
	// { } : 블래이드, 코드블럭
	// 코드블럭( { } ) 에 연산을 수행하는 코드를 작성하고 그 코드들의 묶음을 inputNum라고 하겠다
	public void inputNum() {
		String strNum = null;
		Integer intNum = 0;
		
		while(true) {
			System.out.println("=".repeat(30));
			System.out.print("정수를 입력하세요 (종료 : QUIT): ");
			strNum = scan.nextLine();
			System.out.println("-".repeat(30));
			if(strNum.equals("QUIT")) {
				break;
			} else if (strNum.equals(" ")) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자만 입력해주세요");
				continue;
			}
			
			intList.add(intNum);
			
		}
		
	}// inputNum
	
	
	
	public void printNum() {
		System.out.println("=".repeat(30));
		System.out.println("입력하신 숫자는 다음과 같습니다.");
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.printf("%d\t",intList.get(i));
			if((i+1)%5 == 0) {
				System.out.println();
			}
		}
	}

}
