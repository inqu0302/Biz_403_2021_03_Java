package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.print(">> ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 : " + str);
		if(str.equals("END") ) {
			System.out.println("안녕!!!");
		} else {
			System.out.println("반가워!!!");
		}
		
	}

}
