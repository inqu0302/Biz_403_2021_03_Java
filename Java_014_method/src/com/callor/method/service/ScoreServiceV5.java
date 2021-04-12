package com.callor.method.service;

import java.util.ArrayList;

/*
 * 과목명을 subject = {"국어", "영어", "수학"} 배열에 선언
 * 과목의 점수를 담을 3개의 List선언
 * List<Integer> kors, List<Integer> engs, List<Integer> maths
 * InputServiceV2의 inputValue() method를 사용하여 5명 학생의 각 과목의 점수를 입력
 * 입력 받은 점수를 list에 add() 
 * printScore() method를 사용하여 성적 리스트 출력
 */
public class ScoreServiceV5 {
	
	protected String[] subject;
	InputServiceV2 inService;
	protected ArrayList<Integer> kors;
	protected ArrayList<Integer> engs;
	protected ArrayList<Integer> maths;
	
	
	
	
	public ScoreServiceV5() {

		subject = new String[] {"국어", "영어", "수학"};
		inService = new InputServiceV2();
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();
		
	}
	
	public void inputValue() {
		int students = 5;
		
		for(int i = 0 ; i < students ; i++) {
			for (int j = 0 ; j < subject.length ; j++) {
				Integer score = inService.inputValue((i + 1) + "번 학생 " + subject[j], 0, 100);
				if(score == null) {
					return;
				} else if(subject[j].equals("국어")) {
					kors.add(score);
				} else if(subject[j].equals("영어")) {
					engs.add(score);
				} else if(subject[j].equals("수학")) {
					maths.add(score);
				}
			}
		}
		this.printScore();
	}
	
	public void printScore() {
		
		System.out.println("=".repeat(50));
		System.out.println("학생 성적 리스트");
		System.out.println("-".repeat(50));
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("=".repeat(50));
		
		for(int i = 0 ; i < kors.size() ; i++) {
			System.out.printf("%d\t", i+1);
			System.out.printf("%d\t", kors.get(i));
			System.out.printf("%d\t", engs.get(i));
			System.out.printf("%d\t\n", maths.get(i));
		}
	}
	
}
