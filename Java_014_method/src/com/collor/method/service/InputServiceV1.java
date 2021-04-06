package com.collor.method.service;

import java.util.Scanner;

/*
 * inputValue(String title)method 선언
 * title + "값을 입력하세요" prompt 를 보여주고
 * 정수 또는 QUIT를 키보드 입력을 통해 받는다
 * 입력값이 QUIT면 null 을 return
 * 정수이면 정수값을 return 한다
 */
public class InputServiceV1 {
	
	protected Scanner scan ;
	Integer intNum ;
	public InputServiceV1() {
		// Scanner class는 키보드 자원을 연동하여 키보드로 부터 값을 입력받기 위한 클래스
		// 이 클래스는 컴퓨터의 자원을 사용하는 관리가 매우 엄격하게 필요한 클래스이다.
		// 사용하는 방법에 따라, 오류가 발생하거나 심지어 컴퓨터 시스템이 멈추는 현상까지
		// 발생할 수 있다. 이러한 클래스는 사용할때 상당한 주의가 필요하다
		
		// Scanner 클래스를 main() method 가 아닌 Service등의 클래스에서 사용할때는 클래스 영역에
		// 선언을 하고 클래스의 생성자에서 생성(초기화)를 하는 것이 좋다.
		scan = new Scanner(System.in);
		Integer intNum = 0;
	}
	
	// 문자열, 정수, 정, 매개변수를 갖는 method 선언
	// 문자열과 범위 (start ~ end) 값을 전달받아 
	// prompt 문자열을 생성하고 inputValue(String title) method 를 호출하여
	// 값을 입력받도록 하고 return 된 값에 따라 null이 return 되면 그냥 return 을 
	// 해버리고 정수 값이 return 되면 start, end 값 범위에 있는 값인지 유효성 
	// 검사를 하고 범위를 벗어나면 다시 입력하도록 반복한다.
	
	public Integer inputValue(String title, int start, int end) {
		
		// title 변수 값을 "새우깡( 0 ~ 100 )" 문자열로 다시 생성
		title = String.format("%s (%d ~%d)",title, start, end);

				while(true) {
			
			Integer retNum = this.inputValue(title);
			if(retNum == null) {
				return null;
			} else if ( retNum < start || retNum > end) {
				
					System.out.printf("입력값은 %d ~%d 범위이어야 합니다.\n",start, end);
					continue;
			}
			
			return retNum;
			
		}
	}
	
	/*
	 * String title 매개변수를 받고 정수값이나 QUIT가 입력되는지 확인을 하고 
	 * 잘못 입력된 값이 있으면 다시 입력받도록 하는 method
	 */
	public Integer inputValue(String title) {
		
		while(true) {
			System.out.println(title + " 값을 입력하세요(종료 : QUIT)");
			System.out.print(">> ");
			String strNum = scan.nextLine();
	
			if(strNum.equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("정수만 입력해주세요(종료:QUIT)");
					continue;
				}
				return intNum;
			}

		}
	}
}
