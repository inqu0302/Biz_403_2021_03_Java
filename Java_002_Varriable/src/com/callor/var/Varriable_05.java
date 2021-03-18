package com.callor.var;

public class Varriable_05 {

	public static void main(String[] args) {
		
		int intNum = 1;
		int intSum = 0;
		
		intSum += intNum; // 0 + 1
		
		intNum ++; //2
		intSum += intNum; // 1 + 2
		intNum ++; //3
		intSum += intNum; // 3 + 3
		intNum ++; //4
		intSum += intNum; // 6 + 4
		intNum ++; //5
		intSum += intNum; // 10 + 5
		intNum ++; //6 
		intSum += intNum; // 15 + 6
		intNum ++; //7
		intSum += intNum; // 21 + 7
		intNum ++; //8
		intSum += intNum; // 28 + 8
		intNum ++; //9
		intSum += intNum; // 36 + 9
		intNum ++; //10
		intSum += intNum; // 45 + 10
		
	
		System.out.println(intSum);
		
	}
}
