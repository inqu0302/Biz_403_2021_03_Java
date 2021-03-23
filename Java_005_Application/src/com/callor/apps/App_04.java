package com.callor.apps;

import java.util.Random;

public class App_04 {

	/*
	 * 반은 5개 인원은50~99 Random을 이용해 생성 피자 1box는 6조각 마무리후에 리스트출력
	 */
	public static void main(String[] args) {

		Random rnd = new Random();

		int intClass[] = new int[5];
		int pizzaPcs[] = new int[5];
		int pizzaBox[] = new int[5];

		int pizza = 6;
		int box = 0;

		for (int i = 0; i < 5; i++) {
			intClass[i] = rnd.nextInt(10) + 50;

			pizzaBox[i] = (intClass[i] / pizza);
			if (intClass[i] % (pizzaBox[i] * pizza) > 0) {
				pizzaBox[i]++;
			}

			pizzaPcs[i] = (pizzaBox[i] * pizza);
			box += pizzaBox[i];
		}

		System.out.println("===================================");
		System.out.printf("인원수\t 피자주문\t 전체 조각 수\n");
		System.out.println("-----------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf(" %d\t %d\t\t %d\n", intClass[i], pizzaBox[i], pizzaPcs[i]);
		}
		System.out.println("===================================");
		System.out.println("전체 주문 BOX 수량 : " + box);

	}

}
