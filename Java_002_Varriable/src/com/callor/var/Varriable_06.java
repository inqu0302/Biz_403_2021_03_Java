package com.callor.var;

public class Varriable_06 {

	public static void main(String[] args) {
		
		int intNum = 0;
		
		
		System.out.println( intNum++ );
		// intNum = intNum + 1
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );

		intNum = 0;
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
			
		
		
		intNum = 0;
		// 1
		intNum += 1;
		System.out.println(intNum);
		// 위의 동작과 같음
		System.out.println(++intNum);
		
		// 2 
		System.out.println(intNum);
		intNum += 1;
		// 위의 동작과 같음
		System.out.println(intNum++);
		
		
	}
}
