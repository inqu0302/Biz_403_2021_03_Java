package com.callor.apps;

public class Pay_05 {

	/*
	 * 스위치 변수를 사용한 조건 연산
	 * 		연산이 2가지 경우에 서로 달리 수행해야 할 경우
	 * 		변수를 1로 시작하고 코드 내에서 변수에 (-1) 곱하는 코드를 추가하고
	 * 		변수값이 (> 0) 또는 (< 0) 경우를 비교연산을 수행하여 코드를 간소화 할수있다
	 * 
	 * for () { } : 반복되는 횟수가 처음에 정해진 경우 사용
	 * 
	 * while () { } : 반복되는 횟수가 정해지지 않고 특정 조건에 맞추어 반복이 되는 경우 사용
	 *   
	 */
	
	
	public static void main(String[] args) {
		
		int nPay = 3_723_560;
		int nPaper = 50_000;
		
		int sw = 1;
		
//		for(;;){
		
		// while(조건){ }
		// 조건 = 비교연산문 이 true인 동안
		// 무한 반복 실행하는 반복문
		
		
		while(nPay > 0) {
			int nCount = nPay / nPaper;
			System.out.printf("%6d 원권 %5d 매\n", nPaper, nCount);
			nPay %= nPaper;

			// nPaper 2 또는 5로 나누기
			if( sw >0) {
				nPaper /= 5;
				} else {
					nPaper /= 2;
				}
			sw *= (-1);
			}
		}
		
	}
