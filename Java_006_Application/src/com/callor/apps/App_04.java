package com.callor.apps;

import java.util.Random;

public class App_04 {

	// 정수형 배열 20개를 선언
	// 1~100까지의 난수를 배열에 저장
	// 배열에 저장된 수중 짝수가 저장된 최초의 위치 만 출력

	public static void mian(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random();

		int intNum[] = new int[20];

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.print("2의 배수가 저장된 최초의 위치");
				System.out.println( i + "번");
				break;
			}
		}

	}

}
