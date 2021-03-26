package com.callor.apps.service;

import java.util.Scanner;

/*
 * 5명 학생의 국어,영어,수학 점수를 저장할 배열생성
 * 키보드를 이용하여 5명 학생의 국어, 영어, 수학 점수를 입력 받고 배열에 저장
 * 학생 별 총점, 평균을 계산하고 성적 리스트 출력
 */
public class ScoreServiceV1 {

	int intKor[];
	int intEng[];
	int intMath[];
	int totalScore[];
	float floatAvg[];
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
	
	//점수 입력을 받는 메서드
	public void inputScore() {
		
		
		System.out.println(dLines);
		System.out.println("학생들의 점수를 입력해주세요");
		for(int i = 0; i< intKor.length ; i++) {
			System.out.println((i+1) + "번 학생 국어 점수를 입력하세요");
			System.out.print(">>> ");
			intKor[i] = scan.nextInt();
			System.out.println((i+1) + "번 학생 영어 점수를 입력하세요"); 
			System.out.print(">>> ");
			intEng[i] = scan.nextInt();
			System.out.println((i+1) + "번 학생 수학 점수를 입력하세요");
			System.out.print(">>> ");
			intMath[i] = scan.nextInt();
			System.out.println(sLines);
		}
		scan.close();
	}
	
	// 총점과 평균을 계산하는 메서드
	public void resultScore() {
		for (int i = 0 ; i < intKor.length ; i++) { 
			totalScore[i] += intKor[i];
			totalScore[i] += intEng[i];
			totalScore[i] += intMath[i];
			
			floatAvg[i] = (float)totalScore[i] / 3;
		}
	}
	
	// 결과를 출력하는 메서드
	public void printResult() {
		System.out.println(dLines);
		System.out.println("\t\t성적 리스트 출력");
		System.out.println(dLines);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sLines);
		
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%3d\t",i+1);
			System.out.printf("%3d\t",intKor[i]);
			System.out.printf("%3d\t",intEng[i]);
			System.out.printf("%3d\t",intMath[i]);
			System.out.printf("%3d\t",totalScore[i]);
			System.out.printf("%3.2f\n",floatAvg[i]);
		}
		System.out.println(dLines);
	}


}
