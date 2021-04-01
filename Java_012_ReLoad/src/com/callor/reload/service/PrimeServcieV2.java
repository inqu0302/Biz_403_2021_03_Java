package com.callor.reload.service;

public class PrimeServcieV2 extends PrimeServiceV1{
	// 자동으로 protected 로 선언된 객체, 변수는 자동으로 생성되어
	// 상속 받은 곳에서 사용할 수 잇다.
	
	public void primeNum() {
		
		int rndNum = rnd.nextInt(51) + 50 ;
		
		boolean notPrime = false ;
		for (int i = 2 ; i < rndNum ; i++) {
			if (rndNum % i == 0) {
				notPrime = true;
				break;
			}
		}
		// flag색깔에 따라 소수, 소수가 아님을 출력
		if ( notPrime ) {
			System.out.println(rndNum + "는 소수가 아님");
		} else {
			System.out.println(rndNum + "는 소수임");
		}
	
	}
	

}
