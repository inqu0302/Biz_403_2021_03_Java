package com.callor.var;

public class Varriable_12 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		intNum += 100;
		System.out.println(intNum);
		
		intNum += 33;
		System.out.println(intNum);
		
		intSum += intNum ;
		System.out.println(intSum);
		
		intSum += intNum;
		System.out.println(intSum);
		
		intSum += intNum; // 133 + 133
		intSum += intNum; // 133 + 133
		intSum += intNum; // 133 + 133 + 133 + 133
		
		intSum = 0;
		// 0 + 1 + 2 + 3 + 4 + 5
		intSum = intSum + 1 + 2 + 3 + 4 + 5 ;
		
		intSum = 0 ;
		intSum = intSum + 1;
		intSum = intSum + 2;
		intSum = intSum + 3;
		intSum = intSum + 4;
		intSum = intSum + 5;

		intSum = 0;
		intNum = 1;
		intSum = intSum + intNum;
		intSum = intSum + (intNum + 1);
		
		
	}
}
