package com.callor.var;

public class Varraible_15 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		intSum += (intNum +=2);
		intSum += (intNum +=2);
		intSum += (intNum +=2);
		intSum += (intNum +=2);
		intSum += (intNum +=2);
		System.out.printf("Sum : %d  Num : %d \n", intSum, intNum);
		
		intSum = 0 ;
		intNum = 0 ;
		
		for(; intNum<10;) {
			intSum += (intNum +=2);
		}
		System.out.printf("Sum : %d  Num : %d \n", intSum, intNum);
		 
	}
	
}
