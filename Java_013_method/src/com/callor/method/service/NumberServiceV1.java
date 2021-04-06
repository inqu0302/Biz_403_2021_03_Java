package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1 {

	protected Random rnd;
	protected Integer intNum;
	
	public NumberServiceV1(){
		
		rnd = new Random();
		intNum = 0;
		
	}
	
	public void inputNum() {
		
		intNum = rnd.nextInt(100) + 1;
		
		if(this.resultNum() == null) {
			System.out.println("3의배수가 아닙니다.");
		}else {
			System.out.println(intNum + "는 3의 배수입니다.");
		}
		
	}
	
	public Integer resultNum() {
		
		if ( intNum % 3 == 0) {
			return intNum;
		} else {
			return null;
		}
	}
}
