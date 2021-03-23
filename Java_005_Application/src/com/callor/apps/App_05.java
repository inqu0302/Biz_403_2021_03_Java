package com.callor.apps;

import java.util.Random;

public class App_05 {

	/*
	 * 5명의 학생의 성적을 계산
	 * 과목은 국어(intKor) 영어(intEng) 수학(intMath) 이며
	 * 과목의 점수는 Random 클래스를 사용하여 50~100 까지 생성
	 * 학번 국어 영어 수학 총점 평균 을 계산하여 출력
	 */
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int students[] = new int[5];
		int intKor[] = new int[5];
		int intEng[] = new int[5];
		int intMath[] = new int[5];
		int scores[] = new int[5];
		float floatAvg[] = new float[5];
		
		float subject = 3.0f ;
		
		//학번과 점수 생성하는 for 문
		for(int i = 0; i<5 ; i++) {
			// 학번생성
			students[i] = i + 1;
			// 국어점수
			intKor[i] = rnd.nextInt(51) + 50;
			// 영어점수
			intEng[i] = rnd.nextInt(51) + 50;
			// 수학점수
			intMath[i] = rnd.nextInt(51) + 50;
		}
		
		// 총점과 평균 계산하는 for 문
		for(int i = 0; i< 5 ; i++) {
			scores[i] = intKor[i] + intEng[i] + intMath[i] ; 
			floatAvg[i] = ((float)scores[i] / subject) ;
		}
		
		//출력문
		System.out.println("================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i<5 ; i++) {
			System.out.printf("%d\t", students[i]);
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.print(intMath[i] + "\t");
			System.out.print(scores[i] + "\t");
			System.out.printf("%3.2f\n" ,floatAvg[i]);
		}
		
		System.out.println("===============================================");
		
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int intSum = 0;
		
		//각 과목별 총점계산
		for ( int i = 0 ; i <5 ; i++) {
			korSum += intKor[i];
			engSum += intEng[i];
			mathSum += intMath[i];
			intSum += scores[i];
		}
		
		System.out.printf("총점\t%d\t%d\t%d\t%d",korSum,engSum,mathSum,intSum);
		 
		
		
		
	
	}
	
}
