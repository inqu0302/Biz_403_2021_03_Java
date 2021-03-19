package com.callor.controller;

public class Cont_01 {

	public static void main(String[] args) {
		
		/*
		 * intNum 변수를 생성후 변수를활용하여 내용을 10번 출력
		 */
		
		//변수생성
		int intNum = 0 ;
		
		
		System.out.println("===================================");
		
		// main () 메서드의 코드는 Topdown으로 진행이 된다
		// 코드가 정상 진행되는 과정에서 for() 명령문을 만나면
		// 조건을 검사하고 조건에 따라 반복하는 코드가 실행된다
		// 이처럼 Topdown으로 진행되는 코드의 흐름을 바꾸는 명령을
		// "제어명령", "Control 명령" 이라고 한다
		
		
		//for문을 활용하여 10번 반복
		for (; intNum <10;) {
			System.out.printf("%2d. 우리나라 대한민국\n", ++intNum);
		}
		
		System.out.println("===================================");
		
		/*
		 * for() 명령을 만나면
		 * intNum = 0 을 실행한다.
		 * 		이 명령은 반복횟수와 관계없이 딱 한번만 실행됨
		 * 
		 * intNum < 10 을 실행하여 조건을 검사
		 * 		결과가 true 이면 {} 의 명령을 실행
		 * 
		 * 명령 실행이 끝나면
		 * 다시 for()명령문 시작으로 되돌아 온다
		 * intNum++ 명령을 실행 후
		 * intNum < 10 조건을 검사한다
		 * 
		 * 증가, 조건 검사를 반복하면서 조건 검사결과가 
		 * false 가 될때까지 반복하여 {} 의 명령을 실행
		 * 
		 */
		
		for ( intNum = 0 ; intNum <10 ; intNum++) {
			System.out.printf("%2d. 우리나라 대한민국\n", intNum);
		}
		
		System.out.println("===================================");
		
		
	}
}
