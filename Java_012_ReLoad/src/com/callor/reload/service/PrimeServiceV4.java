package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * List<Integer> intList객체선언
 * 50~100 까지 임의의 난수 50개를 생성하고 소수인 정수들만 intList에 추가
 */
public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> intList;
	protected List<Integer> primeList;
	
	public PrimeServiceV4() {
		
		rnd = new Random();
		intList = new ArrayList<Integer>();
		primeList = new ArrayList<Integer>();
		
	}
	
	public void isPrime() {
		
		for (int i = 0 ; i < 50 ; i++) {
			intList.add(rnd.nextInt(51) + 50);
		}
		int index = 0;
		
		for (int i = 0 ; i < intList.size(); i++) {
			int num = intList.get(i);
			for(index = 2 ; index < num ; index++) {
				if(num % index == 0) {
					break;
				}
			}
			if(num <= index) {
				primeList.add(num);
			}
		}
	}
	
	public void printPrimeNum() {
		
//		for (int i = 0 ; i <primeList.size() ; i++) {
//			System.out.printf("%d\t",primeList.get(i));
//			if ((i+1) % 5 == 0) {
//				System.out.println();
//			}
//		}
		
		// 배열, list 구조의 데이터들을 전체 반복 (읽기) 처리할 경우
		for(Integer prime : primeList) {
			System.out.println(prime);
		}
	}
}
