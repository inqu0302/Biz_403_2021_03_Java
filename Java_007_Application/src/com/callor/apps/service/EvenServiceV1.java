package com.callor.apps.service;

import java.util.Random;

// 클래스 선언문(시작하는 곳)
public class EvenServiceV1 {

	int[] intNum;
	int[] evenNum;
	int index;
	int sum;
	
	// 생성자 method
	// 클래스를 선언하면 자동으로 만들어지는 method 별도의 코드가 필요없으면 만들지 않아도 된다.
	// new EvenServiceV1() 코드에서 호출되는 method
	// 생성자 method에는 클래스 영역의 변수들을 초기화, 생성하기 위한 코드들이 작성된다
	public EvenServiceV1() {
		
		//생성은 생성자에서
		intNum = new int[100];
		evenNum = new int[intNum.length];
		
	}
	
	// 난수를 생성하는 메서드
	public void makeNums() {
		
		Random rnd = new Random();
		for (int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
		
	}
	// 짝수(Even) 홀수 (Odd)
	// 짝수들을 저장하고 출력하는 메서드
	public void printEven(){
//		index = 0;
		int nCount = 0;
		System.out.println("============================");
		System.out.println("짝수들의 리스트");
		System.out.println("----------------------------");
		for (int i = 0 ; i < intNum.length ; i++ ) {
			if(intNum[i] % 2 == 0) {
				System.out.println(intNum[i]);
//				evenNum[index] = intNum[i];
//				index++;
				
				nCount++;
			}
		}
		System.out.println("짝수들의 개수 : " + nCount);
		System.out.println("===========================");
		
//		for( index = 0; index < evenNum.length ; index++) {
//			System.out.print(evenNum[index] + "\t");
//			if (index % 5 <= 0 ) {
//				System.out.println();
//			}
//			if (evenNum[index] == 0) {
//				System.out.println();
//				break;
//			}
//		}
	}
	

	// 짝수들의 합을 구하고 출력하는 메서드
	public void sumEven() {
		for(int i = 0 ; i<intNum.length ; i++) {
			if (intNum[i] % 2 == 0) {
				sum += intNum[i];
			}
		}
		System.out.println("================");
		System.out.println("총합 : " + sum);
		System.out.println("================");
	}
}
