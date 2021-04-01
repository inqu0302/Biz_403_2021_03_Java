package com.callor.reload.service;

import java.util.Random;

/*
 * Random rnd 객체선언
 * 50~100 까지 중 임의의 난수를 생성후 소수인지 판별하여 출력하는 코드 작성
 */
public class PrimeServiceV1 {
	
	protected Random rnd ;
	protected int intNum ;
	
	public PrimeServiceV1 () {
		
		rnd = new Random();
		intNum = 0;
		
	}
	
	public void primeNum() {
		
		intNum = rnd.nextInt(51)+50;
		Boolean isPrime = true;
		/*
		 * for()반복문이 실행되거나 끝나는경우
		 * 비교문 "i < rndNum" true 인 동안 반복하라
		 * 만약 rndNum가 10이면 i == 9까지 반복
		 * 
		 * for() 반복문이 종료되면 i 은 얼마일까?
		 * i 값이 rndNum 보다 작으면 {} 내의 코드 실행
		 * {} 실행 후에 i++ 를 실행하고 다시 i++가 실행
		 * 때문에 for()반복문이 중단되지 않고 모두 정상수행이 되면 i값은 같아진다
		 * 
		 * 만약 for() 반복문이 중간에 break를 만나게 되면
		 * " i 값은 항상 intNum 보다 작다"
		 *
		 */
		for (int i = 2; i < intNum ; i++) {
			if (intNum % i == 0) {
//				System.out.println(intNum + "는(은) 소수가 아니다");
				isPrime = false;
				break;
			}
//			else if (i == (intNum-1)){// for 문 안에서는 if 문이 여러번 작동하게 되면 효율이 떨어지게되어 좋은 코드가 아님
//				System.out.println(intNum + "는(은) 소수이다");
//			}
		}
		
		if(isPrime == true) {
			System.out.println(intNum + "는(은) 소수이다");
		} else {
			System.out.println(intNum + "는(은) 소수가 아니다");
		}
	}
	

}
