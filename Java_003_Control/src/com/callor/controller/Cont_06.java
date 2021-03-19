package com.callor.controller;

public class Cont_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strKor = "국어";
		String strEng = "영어";
		
		int intKor = 70;
		int intEng = 100;
		
		System.out.println(strKor + "점수 : " +intKor);
		System.out.println(strEng + "점수 : " +intEng);
		
		System.out.printf("%s : %d \n", strKor, intKor );
		System.out.printf("%s : %d \n", strEng, intEng );
		
		String strNation = "우리나라 대한민국";
		
		System.out.println("==============================");
		
		for(int index =0; index < 10; index ++) {
			
			int num = index +1;
			System.out.printf("%3d. %s\n", num, strNation);
		}
		
		System.out.println("================================");
		
		
	}

}
