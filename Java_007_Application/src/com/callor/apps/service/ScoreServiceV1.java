package com.callor.apps.service;

import java.util.Random;

/*
 * 10명의 학생의 국어, 영어, 수학 점수를 배열에 저장
 * 학생들의 총점, 평균을 계산하여 성적리스트 출력
 */

	
public class ScoreServiceV1 {

	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intSum;
	float[] floatAvg;

	public ScoreServiceV1() {
	
		
		intKor = new int[10];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		
		intSum = new int[intKor.length];
		floatAvg = new float[intKor.length];
	}
	
	// 점수를 생성하는 메서드
	public void makeScore() {
		Random rnd = new Random();
		for ( int i = 0 ; i < intKor.length ; i++) {
			intKor[i] = rnd.nextInt(60)+41;
			intEng[i] = rnd.nextInt(60)+41;
			intMath[i] = rnd.nextInt(60)+41;
			
		}
	}
	// 총점과 평균값을 구하는 메서드
	public void scoreSum() {
		for (int i = 0 ; i<intKor.length ; i++) {
			intSum[i] += intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
			
			floatAvg[i] = (float)intSum[i] / 3;
		}
	}
	
	// 성적리스트 출력
	public void printScore() {
		System.out.println("================================================");
		System.out.println("\t\t성적 리스트 출력");
		System.out.println("------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < intKor.length ; i++) {
			System.out.printf("%d\t", i+1);
			System.out.printf("%2d\t", intKor[i]);
			System.out.printf("%2d\t", intEng[i]);
			System.out.printf("%2d\t", intMath[i]);
			System.out.printf("%3d\t", intSum[i]);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
		System.out.println("===============================================");
	}

}

