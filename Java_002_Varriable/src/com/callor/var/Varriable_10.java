package com.callor.var;

public class Varriable_10 {

	public static void main(String[] args) {
		
		int intNum = 1; // 시작하는 값
		
		// 명령이 실행될때마다 1씩 증가하는 값으로 설정
		intNum ++ ; 	// 시작하는 값 + 1
		intNum ++ ;		// 시작하는 값 + 2
		
		int intNum1 = 100;
		intNum1++;  //101
		intNum1++; 	//102
		
		intNum1 = 99;
		intNum1 ++; 
		
		intNum1 = 1;
		intNum1 += 2 ; // 1 + 2
		intNum1 += 2 ; // 3 + 2
		
		intNum1 = 0;
		int intSum = 0;
		
		intSum += intNum1 ; //intSum = intSum + intNum1
		
		// intNum1을 1증가하고 == 1이된다
		// intNum1에 저장된 1을 intSum에 저장하라
		// intSum = 0 + 1
		intSum += (++intNum1);
		
		//1씩 증가(변화)되는 intNum변수의 값을 intSum 변수에 누전한다.
		intNum = 0;
		intSum = 0;
		intSum += ++intNum; // 0 + 1 을 intSum저장
		intSum += ++intNum; // 1 + 2 을 intSum저장
		intSum += ++intNum; // 3 + 3 을 intSum저장
		intSum += ++intNum; // 4 + 4 을 intSum저장
			
		
		
	}
}
