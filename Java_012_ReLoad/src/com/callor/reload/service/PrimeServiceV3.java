package com.callor.reload.service;

public class PrimeServiceV3 extends PrimeServiceV1{

	public void primeNum() {
		
		int rndNum = rnd.nextInt(51) + 50;
		
		//for() 반복문이 중단되었는지 모두수행했는지 판별
		
		int index = 0;
		for (index = 2; index < rndNum ; index++) {
			if (rndNum % index == 0) {
				break;
			}
		}
		
		// for()가 끝났을때 break 되었을때와 
		// 			항상 index < rndNum
		// 그렇지 않은 경우를 확인하여 코드를 진행
		// 			index >= rndNum
		if (index < rndNum) {
			System.out.println(rndNum + " 는 소수가 아님");
		} else {
			System.out.println(rndNum + " 는 소수임");
		}
		
	}
}
