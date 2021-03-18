package com.callor.var;

public class Varriable_19 {

	public static void main(String[] args) {

		// Console에 숫자 0이 무한반복되어 출력
		// 무한이 반복되는 코드를 조건을 부여하여 
		// 유한반복되도록 변경하기
		int intNum = 0;
		
		// for ()명령에 조건 부여하기
		// for() 문의 두번째 명령구간에 비교 연산자를 사용한 조건문 작성
		for (;intNum < 10;) {
			System.out.println(++intNum);
			System.out.println();
			System.out.println();
		}
		
		intNum = 0;
		for (; intNum < 10;) {
			intNum += 2;
			System.out.println(intNum);
		}

		intNum = 1;
		for (; intNum < 10;) {
			intNum += 2;
			System.out.println(intNum);
		}
		
		
	}

}
