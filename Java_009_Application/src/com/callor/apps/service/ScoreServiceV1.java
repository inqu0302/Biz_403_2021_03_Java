package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	// 학생 수 만큼 과목점수를 저장할 배열 선언
	int [] intKor;
	int [] intEng;
	int [] intMath;
	int [] totalScore;
	float [] floatAvg;
	
	// 클래스 영역에 Scanner 클래스를 사용하여 scan 객체를 선언
	Scanner scan;
	String dLines = LinesService.dLines(50);
	String sLines = LinesService.sLines(50);


	// 변수 생성자
	public ScoreServiceV1() {
		
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		totalScore = new int[intKor.length];
		floatAvg = new float[intKor.length];
		scan = new Scanner(System.in);
	
	}
	
	// 점수를 입력 받는 메서드
	public void inputScore() {
		System.out.println(dLines);
		System.out.println("학생들의 점수를 입력해 주세요");
		for(int i = 0 ; i < intKor.length ; i++) {
				System.out.println(sLines);
				System.out.println((i+1) +"번 학생 국어점수를 입력해주세요");
				System.out.print(">>> ");
				intKor[i] = scan.nextInt();
				if(intKor[i]>100 || intKor[i]<0) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					i--;
					continue;
				}
				System.out.println((i+1) +"번 학생 영어점수를 입력해주세요");
				System.out.print(">>> ");
				intEng[i] = scan.nextInt();
				if(intEng[i]>100 || intEng[i]<0) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					i--;
					continue;
				}
				System.out.println((i+1) +"번 학생 수학점수를 입력해주세요");
				System.out.print(">>> ");
				intMath[i] = scan.nextInt();
				if(intMath[i]>100 || intMath[i]<0) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					i--;
					continue;
				}
				System.out.println(sLines);

		}
		scan.close();
	}
	
	// 점수 계산을 하는 메서드
	public void Scoreresult() {
		for(int i = 0 ; i < intKor.length ; i++) {
			totalScore[i] = intKor[i] + intEng[i] + intMath[i];
			floatAvg[i] = ((float)totalScore[i]) / 3;
		}
	}

	public void printScore() {
		System.out.println(dLines);
		System.out.println("\t\t학생들 성적 리스트 ");
		System.out.println(sLines);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(dLines);
		for (int i = 0 ; i < intKor.length ; i++) {
			System.out.print((i+1) + "\t");
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			System.out.printf("%3d\t", totalScore[i]);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
		System.out.println(dLines);
	}
}