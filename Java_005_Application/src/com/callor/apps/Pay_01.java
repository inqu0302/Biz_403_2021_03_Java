package com.callor.apps;

public class Pay_01 {

	/*
	 * 3,723,560원을 은행에서 인출하려고합니다.
	 * 최소한의 화폐 개수로 지급하려고합니다
	 * 최소 화폐매수를 계산
	 */
	
	public static void main(String[] args) {
		
		int totalMoney = 3273560;
		int tho50 = 0;
		int tho10 = 0;
		int tho5 = 0;
		int tho1 = 0;
		int hun5 = 0;
		int hun1 = 0;
		int won50 = 0;
		int won10 = 0;
		
		int intWon = 50000;
		
		int won[] = new int[8];

		
		System.out.println("===============================");
		System.out.println("급여 수령액 : " + totalMoney);
		System.out.println("===============================");

		// for 문을 활용해 코드 줄이기
		for(int i = 0; i <8; i++) {
			won[i] = totalMoney / intWon;
			totalMoney = totalMoney % intWon;
			if (i % 2 == 0) {
				intWon /= 5;
			} else {
				intWon /= 2;
			}
		}
		int wongun = 50000;
		
		for(int i = 0; i < 8 ; i++) {
			System.out.printf("%5d 원권 \t %3d매\n", wongun,won[i]);
			if (i % 2 == 0) {
				wongun /= 5;
			} else {
				wongun /= 2;
			}
		}
		// 화폐 매수 계산하는 식
//		tho50 = totalMoney / 50000 ;
//		totalMoney = totalMoney % 50000;
//		tho10 = totalMoney / 10000 ;
//		totalMoney = totalMoney % 10000;
//		tho5 = totalMoney / 5000 ;
//		totalMoney = totalMoney % 5000;
//		tho1 = totalMoney / 1000 ;
//		totalMoney = totalMoney % 1000;
//		hun5 = totalMoney / 500 ;
//		totalMoney = totalMoney % 500;
//		hun1 = totalMoney / 100 ;
//		totalMoney = totalMoney % 100;
//		won50 = totalMoney / 50;
//		totalMoney = totalMoney % 50;
//		won10 = totalMoney / 10;
//		totalMoney = totalMoney % 10;
//		
//
//		System.out.printf("%5d 원권\t%3d매\n",50000,tho50);
//		System.out.printf("%5d 원권\t%3d매\n",10000,tho10);
//		System.out.printf("%5d 원권\t%3d매\n",5000,	tho5);
//		System.out.printf("%5d 원권\t%3d매\n",1000,	tho1);
//		System.out.printf("%5d 원권\t%3d매\n",500,	hun5);
//		System.out.printf("%5d 원권\t%3d매\n",100,	hun1);
//		System.out.printf("%5d 원권\t%3d매\n",50,	won50);
//		System.out.printf("%5d 원권\t%3d매\n",10,	won10);
//		System.out.println("==============================");
		
//		System.out.println(totalMoney);
		
				
		
	}
}
