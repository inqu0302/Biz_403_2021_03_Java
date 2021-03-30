package com.callor.classes;

import java.util.Random;

public class Class_01 {

	/*
	 * 랜덤클래스를 이용하여 50~100까지 중 난수 1개를 생성
	 * 2~(난수-1)까지 수중에서 생성된 난수의 약수들을 배열에 저장
	 * 배열에 저장된 리스트를 출력
	 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num = 0;
		int index = 0;
		int nCount = 0;
		
		num = rnd.nextInt(50) + 51 ;
		
		for (int i = 2 ; i < num ; i++) {
			if (num % i == 0) {
				nCount++;
			}
		}
		
		int numbers [] = new int [nCount];
				
		System.out.println("난수 : " + num);
		for (int i = 2 ; i < num ; i++) {
			if (num % i == 0) {
				numbers[index++] = i;
			}
		}
		
		System.out.println("난수 " + num + "의 약수들");
		for (int i = 0 ; i < index ; i++) {
			System.out.print(numbers[i] + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
			
		}
		
		if(index == 0 ) {
			System.out.println("소수입니다.");
		}
		
		
		
	}
}
