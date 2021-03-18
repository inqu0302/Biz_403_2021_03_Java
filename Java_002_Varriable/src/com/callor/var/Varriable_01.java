package com.callor.var;

public class Varriable_01 {

	public static void main(String[] args) {
		
		// 변수 선언
		int num1 = 33;
		int num2 = 55;
		
		// 연산값 저장
		int sum = num1 + num2;
		int minus = num2 - num1;
		int times = num1 * num2;
		int div = num2 / num1;

		// 결과 출력
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		System.out.printf("%d - %d = %d\n", num2, num1, minus);
		System.out.printf("%d * %d = %d\n", num1, num2, times);
		System.out.printf("%d / %d = %d\n", num2, num1, div);

	}

}
