package com.collor.method.service;

/*
 * addNum() method는 두개의 정수를 매개변수로 받는다
 * 매개변수로 받은 2개의 정수의 합을 계산하고 합의 결과가 짝수이면
 * 계산결과를 return 하고 그렇지 않으면 null을 return한다.
 */
public class NumberServiceV1 {
	
	Integer num1 = 0;
	Integer num2 = 0;
	Integer sum = 0;
	
	public Integer addNum(Integer num1,Integer num2) {
		sum = num1 + num2 ;
		this.num1 = num1;
		this.num2 = num2;
		if ( sum % 2 == 0) {
			return sum;
		}else {
		return null;
		}
		
	}
	
	public void printNum() {
		System.out.println(this.addNum(num1, num2));
		
		
	}
}
